package c.bikiprasad13.collegeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    private TextView mlogintext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mlogintext = (TextView) findViewById(R.id.logintextsignuppage);

        mlogintext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendtoLoginActivity();
            }
        });
    }

    private void SendtoLoginActivity(){
        Intent loginIntent = new Intent(signup.this,login.class);
        startActivity(loginIntent);
    }
}
