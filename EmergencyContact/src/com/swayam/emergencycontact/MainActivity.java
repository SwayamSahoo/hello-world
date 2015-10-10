package com.swayam.emergencycontact;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ListView phonelistview;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] emergency_contacts = {"Police","Ambulance","Fire","Accident","EMC-1","EMC-2"};
        phonelistview = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,emergency_contacts);
        phonelistview.setAdapter(adapter);
        
        final Bundle b1=new Bundle();
        b1.putString("Police", "100");
        b1.putString("Ambulance", "108");
        b1.putString("Fire","102");
        b1.putString("Accident", "104");
        b1.putString("EMC-1", "996573567");
        b1.putString("EMC-2", "736874685");
        
        /*
    	 * Author: Swayam Prakash Sahoo	
    	 * Parameters: 	
    	 * Doc: 7th-OCT-2015
    	 * Dom: 8th-OCT-2015
    	 */
        
        phonelistview.setOnItemClickListener(new OnItemClickListener() {
        	
        	@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Intent intent=new Intent(Intent.ACTION_DIAL);
				switch (position) {
				
				case 0:
					
					condition(b1.getString("Police"));
					break;

				case 1:
					condition(b1.getString("Ambulance"));
					break;	
				case 2:
					condition(b1.getString("Fire"));
					break;
				case 3:
					condition(b1.getString("Accident"));
					break;
				case 4:
					condition(b1.getString("EMC-1"));
					break;
				case 5:
					condition(b1.getString("EMC-2"));
					break;
					}
				
				
			}

			public void condition(String a) {
				Intent intent=new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+a));
				startActivity(intent);
			}
		});
        
        }
        public void call(String a,Bundle b) {
    		Intent intent=new Intent(Intent.ACTION_DIAL);
    		intent.setData(Uri.parse("tel:"+b.getString(a)));
    		startActivity(intent);
    	}
    
}
