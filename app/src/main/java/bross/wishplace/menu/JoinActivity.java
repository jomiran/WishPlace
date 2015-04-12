package bross.wishplace.menu;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import bross.wishplace.R;
import bross.wishplace.json.JSONParser;

public class JoinActivity extends ActionBarActivity implements View.OnClickListener {

    private EditText inputEmail;
    private EditText inputPhone;
    private EditText inputPassword1;
    private EditText inputPassword2;
    private Spinner selectSex;
    private EditText inputAddress;
    private Spinner selectBirthYear;
    private com.gc.materialdesign.views.CheckBox checkAgree;

    private LocationManager locationManager;
    private String provider;
    private String locationName;
    private LatLng latlng;


    private String[] getBirthYearArr() {
        final int BIRTH_YEAR_SIZE = 87;
        String[] birthYearArr = new String[BIRTH_YEAR_SIZE];
        birthYearArr[0] = "선택해 주세요";
        for (int i = 0; i < BIRTH_YEAR_SIZE - 1; i++)
            birthYearArr[i + 1] = String.valueOf(i + 1930);
        return birthYearArr;
    }
    private String[] getSexArr()
    {
        String []sexArr = new String[3];
        sexArr[0] = "선택해 주세요";
        sexArr[1] = "남자";
        sexArr[2] = "여자";

        return sexArr;
    }
    private void init() {
        findViewById(R.id.join_btn_cancle).setOnClickListener(this);
        findViewById(R.id.join_btn_ok).setOnClickListener(this);
        inputEmail = (EditText) findViewById(R.id.join_input_email);
        inputPhone = (EditText) findViewById(R.id.join_input_phone);
        inputPassword1 = (EditText) findViewById(R.id.join_input_password_1);
        inputPassword2 = (EditText) findViewById(R.id.join_input_password_2);
        selectSex = (Spinner) findViewById(R.id.join_select_sex);
        inputAddress = (EditText) findViewById(R.id.join_input_address);
        checkAgree = (com.gc.materialdesign.views.CheckBox) findViewById(R.id.join_check_agree);
        selectBirthYear = (Spinner) findViewById(R.id.join_select_birth_year);


        String[] optionSex = getSexArr();
        ArrayAdapter<String> sexAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, optionSex);
        selectSex.setAdapter(sexAdapter);

        String[] optionBirthYear = getBirthYearArr();
        ArrayAdapter<String> birthYearAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, optionBirthYear);
        selectBirthYear.setAdapter(birthYearAdapter);

        setPhoneNumber();

    }



    private void getCurrentLocation() {
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        provider = LocationManager.GPS_PROVIDER;
        Location currentLocation = new Location(LocationManager.GPS_PROVIDER);
        try {
            currentLocation = locationManager
                    .getLastKnownLocation(LocationManager.GPS_PROVIDER);

            if (currentLocation == null) {
                provider = LocationManager.GPS_PROVIDER;
                currentLocation = locationManager
                        .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            }
            latlng = new LatLng(currentLocation.getLatitude(), currentLocation.getLongitude());
        } catch (Exception e) {
            Log.i("Error", e.toString());
            Log.i("LM", Context.LOCATION_SERVICE.toString());
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; ㅁthis adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_join, menu);
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

    private void setPhoneNumber() {
        try {
            TelephonyManager systemService = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            String phoneNumber = systemService.getLine1Number();
            if (phoneNumber.length() > 10) {
                phoneNumber = phoneNumber.substring(phoneNumber.length() - 10,
                        phoneNumber.length());
            }
            phoneNumber = "0" + phoneNumber;
            inputPhone.setText(phoneNumber);
            // inputPhone.setEnabled(false);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.join_btn_ok:
                if (inputEmail.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "메일을 채워주세요.", Toast.LENGTH_SHORT)
                            .show();
                    inputEmail.setFocusable(true);
                    return;
                }

                if (inputPhone.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "폰번호를 채워주세요.", Toast.LENGTH_SHORT)
                            .show();
                    inputPhone.setFocusable(true);
                    return;
                }

                if (inputPassword1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 채워주세요.", Toast.LENGTH_SHORT)
                            .show();
                    inputPassword1.setFocusable(true);
                    return;
                }

                if (inputPassword2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 채워주세요.", Toast.LENGTH_SHORT)
                            .show();
                    inputPassword2.setFocusable(true);
                    return;
                }

                String emailPattern = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";

                if (!inputEmail.getText().toString().matches(emailPattern)) {
                    Toast.makeText(getApplicationContext(), "이메일을 재대로 입력해주세요",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                if (!inputPassword1.getText().toString()
                        .equals(inputPassword2.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 확인해주세요.",
                            Toast.LENGTH_SHORT).show();
                    inputPassword1.setFocusable(true);
                    return;
                }
                if (selectSex.getPrompt().toString()
                        .equals("선택해 주세요")) {
                    Toast.makeText(getApplicationContext(), "성별을 선택해주세요",
                            Toast.LENGTH_SHORT).show();
                    inputPassword1.setFocusable(true);
                    return;
                }

                if (inputAddress.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "주소를 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                    inputPassword1.setFocusable(true);
                    return;
                }

                if (selectBirthYear.getPrompt().toString()
                        .equals("선택해 주세요")) {
                    Toast.makeText(getApplicationContext(), "나이를 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                    inputPassword1.setFocusable(true);
                    return;
                }

                if (!checkAgree.isCheck()) {
                    Toast.makeText(getApplicationContext(), "약관에 동의해주세요.", Toast.LENGTH_SHORT)
                            .show();
                    return;
                }


                String url = "user/user_join.jsp?";
                url += "email=";
                url += inputEmail.getText().toString();
                url += "&phone=";
                url += inputPhone.getText().toString();
                url += "&password=";
                url += inputPassword1.getText().toString();
                url += "&sex=";
                url += selectSex.getSelectedItem().toString();
                url += "&address=";
                url += inputAddress.getText().toString().replace(' ', '_');
                url += "&birthYear=";
                url += selectBirthYear.getSelectedItem().toString();

                JSONParser json = new JSONParser("join", url);
                json.execute();


                try {
                    Thread.sleep(500);
                } catch (Throwable ex) {
                    ex.printStackTrace();
                }


                String result = json.result;

                if (result.equals("false")) {
                    Toast.makeText(getApplicationContext(),
                            "Email 혹은 핸드폰번호 중복입니다.", Toast.LENGTH_SHORT).show();
                    return;
                }

                AlertDialog.Builder alert = new AlertDialog.Builder(
                        JoinActivity.this);
                alert.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                dialog.dismiss(); // 닫기]
                                finish();
                            }
                        });
                alert.setTitle("회원가입");
                alert.setMessage("회원가입이 완료되었습니다.");
                alert.show();

                Log.i("Join URL ", url);

                break;
            case R.id.join_btn_cancle:
                finish();
                break;
        }
    }
}