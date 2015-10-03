package com.jspider.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button login,forgotpwd,signup;
	EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button) findViewById(R.id.loginbutton);
        forgotpwd=(Button) findViewById(R.id.forgotpwdbutton);
        password=(EditText) findViewById(R.id.editTextPassword);
        username=(EditText) findViewById(R.id.editTextUsername);
        signup=(Button)	findViewById(R.id.signupbutton);
        login.setOnClickListener(this);
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				username.setText("");
				password.setText("");
				
			}
		});
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		if(username.getText().toString().equalsIgnoreCase("swayam")&&
				
				password.getText().toString().equals("1234"))
		{
		Toast.makeText(this,"login Sucessful",Toast.LENGTH_SHORT).show();
		}
		else
		{
			Toast.makeText(this,"invalid username & password",Toast.LENGTH_SHORT).show();
		}
	}
}
