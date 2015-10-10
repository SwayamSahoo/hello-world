package com.jspider.widgets;

import android.os.Bundle;
import android.app.Activity;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{

	RadioButton radiobuttonoption1;
	RadioGroup radiogroupselections;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radiobuttonoption1 =(RadioButton)findViewById(R.id.radioButtonoption1);
        radiogroupselections =(RadioGroup)findViewById(R.id.radioGroup1);
        radiogroupselections.setOnCheckedChangeListener(MainActivity.this);
        radiobuttonoption1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
        	@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				if(state)
				{
					Toast.makeText(MainActivity.this,"You selected option 1", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
    }

	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) {
		switch (id){
		
		case R.id.radioselection1:
			Toast.makeText(MainActivity.this,"You selected Option 1",Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection2:
			Toast.makeText(MainActivity.this,"You selected Option 2",Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection3:
			Toast.makeText(MainActivity.this,"You selected Option 3",Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection4:
			Toast.makeText(MainActivity.this,"You selected Option 4",Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		
	}
    

}
