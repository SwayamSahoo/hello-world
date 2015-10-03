package com.jspider.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button Login,Signup,ForgotPassword;
	EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login=(Button) findViewById(R.id.buttonLogin);
        Signup=(Button) findViewById(R.id.buttonSignup);
        password=(EditText) findViewById(R.id.editTextPassword);
        username=(EditText) findViewById(R.id.editTextUsername);
        Login.setOnClickListener(this);
        Signup.setOnClickListener(new OnClickListener() {
			
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
