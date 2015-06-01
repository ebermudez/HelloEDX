package com.ebermudez.helloedx;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView text = (TextView) findViewById(R.id.textView1);
        text.setTag(1);
        
        final Button btn = (Button) findViewById(R.id.button1);
        
        btn.setOnClickListener( new View.OnClickListener() {

		@Override
		public void onClick (View v) {
		final int status =(Integer) text.getTag();
		if(status == 0) {
		    text.setText("Hello 21w.789x");
		    text.setTag(1); //pause
		} else {
		    text.setText("Goodbye 21w.789x");
		    text.setTag(0); //pause
		}
		}
        }
		);
        
    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
