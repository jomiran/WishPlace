package bross.wishplace.menu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bross.wishplace.R;
import android.content.SharedPreferences;
import android.content.Intent;

public class LoginActivity extends ActionBarActivity implements View.OnClickListener {

    EditText inputEmail;
    EditText inputPassword;
    CheckBox checkAutoLogin;

    private void init() {
        findViewById(R.id.login_btn_find_id).setOnClickListener(this);
        findViewById(R.id.login_btn_find_password).setOnClickListener(this);
        findViewById(R.id.login_btn_join).setOnClickListener(this);
        findViewById(R.id.login_btn_login).setOnClickListener(this);
        inputEmail = (EditText) findViewById(R.id.login_input_email);
        inputPassword = (EditText) findViewById(R.id.login_input_password);
//        checkAutoLogin = (CheckBox) findViewById(R.id.login_check_auto_login);
//        SharedPreferences pref = getSharedPreferences("save_user.xml", 0);
//        inputEmail.setText(pref.getString("wishPlaceEmail", ""));
//        if (pref.getInt("autoLogin", 0) == 1) {
//            inputPassword.setText(pref.getString("password", ""));
//            checkAutoLogin.setChecked(true);
//            onClick(findViewById(R.id.login_btn_login));
//        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    @Override
    public void onDestroy() {
        super.onDestroy();
        SharedPreferences pref = getSharedPreferences("save_info.xml", 0);
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("wishPlaceEmail", inputEmail.getText().toString());
        if (checkAutoLogin.isChecked()) {

            edit.putString("password", inputPassword.getText().toString());
            edit.putInt("autoLogin", 1);
        } else {
            edit.putString("password", "");
            edit.putInt("autoLogin", 0);
        }

        edit.commit();
    }

    @Override
    public void onClick(View view) {

        Intent intent = null;
        switch (view.getId()) {
            case R.id.login_btn_join:
                intent = new Intent(getApplicationContext(),
                        JoinActivity.class);
                break;
            case R.id.login_btn_find_id:
//                intent = new Intent(getApplicationContext(),
//                        FindIDActivity.class);
                break;
            case R.id.login_btn_find_password:
//                intent = new Intent(getApplicationContext(),
//                        DaumMapActivity.class);
                /*
                intent = new Intent(getApplicationContext(),
                        FindPasswordActivity.class);
                startActivity(intent);
                */
                break;
            case R.id.login_btn_login:
//                intent = new Intent(getApplicationContext(),
//                        MainActivity.class);
                break;
        }
        startActivity(intent);
    }
}
