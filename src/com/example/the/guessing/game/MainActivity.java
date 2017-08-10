package com.example.the.guessing.game;

import java.util.*;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RatingBar;
import android.widget.ToggleButton;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	@Override
	
	protected void onStart() {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this,MusicService.class);
		startService(i);
		super.onStart();
	}

	Button b1,b2,b3,b4,b5;
	//ToggleButton tb;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        //tb = (ToggleButton)findViewById(R.id.toggleButton1);
        
       /* tb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked)
				{
					Intent i = new Intent(MainActivity.this,MusicService.class);
					startService(i);
				}
				else
				{
					Intent i = new Intent(MainActivity.this,MusicService.class);
					stopService(i);
				}
				
			}
		});*/
        
        //On Click Event of New Game
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(MainActivity.this,SecondActivity.class);
				startActivity(i);
				
			}
		});
        
        //On Click Event of Exit Button
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,MusicService.class);
				stopService(i);
				Intent homeIntent = new Intent(Intent.ACTION_MAIN);
			    homeIntent.addCategory( Intent.CATEGORY_HOME );
			    homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
			    startActivity(homeIntent); 
			}
		});
        
        //On Click Event of Rating button
        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,ThirdActivity.class);
				startActivity(i);
			}
		});
        
        b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,MusicService.class);
				stopService(i);
				
			}
		});
        
        b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,FourthActivity.class);
				startActivity(i);
				
			}
		});
        
    }
    
    
    
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
