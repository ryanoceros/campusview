package com.example.campusview;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CameraView extends Activity {

	
	FrameLayout rl;
	protected void onCreate(Bundle savedInstanceState) {
		
		try{
		      super.onCreate(savedInstanceState);
		      
		      CameraBackground cv = new CameraBackground(
		         this.getApplicationContext());
		       rl = new FrameLayout(
		         this.getApplicationContext()); 
		       TextView text=new TextView(this); 
		       text.setText("GOLDEN Gate"); 
		       text.setTextColor(Color.WHITE);                            
		       text.setTypeface(Typeface.DEFAULT_BOLD);
		       
		      rl.addView(cv);
		      rl.addView(text);
		      setContentView(rl);
		   } catch(Exception e){}
		
	}

	

}
