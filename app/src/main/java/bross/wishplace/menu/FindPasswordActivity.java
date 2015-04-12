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

public class FindPasswordActivity extends ActionBarActivity implements View.OnClickListener{
    private EditText inputPhone;
    private EditText inputEmail;
    private void init()
    {
        inputPhone = (EditText)findViewById(R.id.find_password_phone);
        inputEmail = (EditText)findViewById(R.id.find_password_email);
        findViewById(R.id.find_password_btn).setOnClickListener(this);
        setPhoneNumber();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_password);
        init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_password, menu);
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
        switch(v.getId())
        {
            case R.id.find_password_btn:
                if(inputEmail.toString()=="")
                {
                    Toast.makeText(getApplicationContext(), "ID를 입력해주세요.", Toast.LENGTH_SHORT).show();
                    inputEmail.findFocus();
                    return;
                }
                if(inputPhone.toString()=="")
                {
                    Toast.makeText(getApplicationContext(), "전화번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
                    inputPhone.findFocus();
                    return;
                }

                JSONParser json = new JSONParser("findPW","user/findPassword.jsp?email="+inputEmail.getText().toString()
                        +"&phone="+inputPhone.getText().toString());
                json.execute();

                try {
                    Thread.sleep(500); // 쓰레등
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                String password = json.result;

                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();     //닫기]
                        finish();
                    }
                });
                alert.setTitle("PW찾기");
                if(password.equals("false"))
                    alert.setMessage("해당 하는 아이디가 존재하지 않습니다.");
                else
                    alert.setMessage("찾으시는 암호는 [ "+password+" ] 입니다.");
                alert.show();
                break;
        }
    }
}
