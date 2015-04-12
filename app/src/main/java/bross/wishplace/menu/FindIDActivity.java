package bross.wishplace.menu;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import bross.wishplace.R;
import bross.wishplace.json.JSONParser;

public class FindIDActivity extends ActionBarActivity implements View.OnClickListener{

    EditText inputPhone;
    private void init()
    {
        inputPhone = (EditText)findViewById(R.id.find_id_phone);
        findViewById(R.id.find_id_btn).setOnClickListener(this);
        setPhoneNumber();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);
        init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_id, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    void setPhoneNumber() {
        try {
            TelephonyManager systemService = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            String phoneNumber = systemService.getLine1Number();
            if (phoneNumber.length() > 10) {
                phoneNumber = phoneNumber.substring(phoneNumber.length() - 10,
                        phoneNumber.length());
            }
            phoneNumber = "0" + phoneNumber;
            inputPhone.setText(phoneNumber);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.find_id_btn:

                JSONParser json = new JSONParser("findID",
                        "user/findID.jsp?phone="
                                + inputPhone.getText().toString());
                json.execute();

                try {
                    Thread.sleep(200); // 쓰레등
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                String userEmail = json.result;

                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                dialog.dismiss(); // 닫기]
                                finish();
                            }
                        });
                alert.setTitle("ID찾기");
                if (userEmail.equals("false") || userEmail == null)
                    alert.setMessage("해당 휴대폰이 등록된 아이디가 없습니다.");
                else
                    alert.setMessage("찾으시는 ID는 [ " + userEmail + " ] 입니다.");
                alert.show();
                break;
        }
    }
}
