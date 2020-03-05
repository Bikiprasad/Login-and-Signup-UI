package c.bikiprasad13.collegeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private TextView mCreateNewaccount;
    private TextView mForgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mForgetPassword = (TextView) findViewById(R.id.forgetpasswordtextloginpage);
        mCreateNewaccount = (TextView) findViewById(R.id.singuptextloginpage);
        mCreateNewaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendToRegisterActivity();
            }
        });
        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendToForgetPasswordActivity();
            }
        });
    }


    private void SendToRegisterActivity()
    {
        Intent RegisterIntent = new Intent(login.this,signup.class);
        startActivity(RegisterIntent);
    }
    private void SendToForgetPasswordActivity()
    {
        Intent ForgetPasswordIntent = new Intent(login.this,forgetpassword.class);
        startActivity(ForgetPasswordIntent);
    }
}
