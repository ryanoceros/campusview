package com.example.campusview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CameraView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.camera_view);
		//hi
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.camera_view, menu);
		return true;
	}

}
