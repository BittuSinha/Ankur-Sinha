package com.example.the.guessing.game;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class ThirdActivity extends Activity {

	RatingBar r;
	Button b,b1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        r = (RatingBar)findViewById(R.id.ratingBar1);
        b = (Button)findViewById(R.id.button1);
        b1 = (Button)findViewById(R.id.button2);
        r.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Thanks For Rating Us!", Toast.LENGTH_LONG).show();
			}
		});
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				r.setRating(5);
			}
		});
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ThirdActivity.this,MainActivity.class);
				startActivity(i);
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_third, menu);
        return true;
    }

    
}
