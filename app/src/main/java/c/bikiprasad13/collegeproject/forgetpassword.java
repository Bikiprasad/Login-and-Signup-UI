package c.bikiprasad13.collegeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class forgetpassword extends AppCompatActivity {

    private TextView mGotoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        mGotoLogin = (TextView) findViewById(R.id.gotologinpagefrgtpaswd);

        mGotoLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                SendToLoginPage();
            }
        });
    }

    private void SendToLoginPage(){
        Intent LoginIntent= new Intent(forgetpassword.this,login.class);
        startActivity(LoginIntent);
    }
}
