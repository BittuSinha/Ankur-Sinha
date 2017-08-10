package com.example.the.guessing.game;

import java.util.Random;


import java.util.Scanner;

//import com.example.helloapp2.MainActivity;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.text.Editable;



public class SecondActivity extends Activity {
private static int s;
EditText e;
Button b,b1;
 int y=0;
 static int z=0;
	
    	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Random r=new Random();
		s=r.nextInt(20);
        b = (Button)findViewById(R.id.button1);
        e = (EditText)findViewById(R.id.editText1);
        b1 = (Button)findViewById(R.id.button2);
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				z=0;
				Intent i = new Intent(SecondActivity.this,MainActivity.class);
				startActivity(i);
				
			}
		});
       
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//final AlertDialog dialog = new AlertDialog.Builder(SecondActivity.this).create();
				//dialog.setTitle("Result");
				
				z++;
				
				try{
				
				int x=Integer.parseInt(e.getText().toString());
		        e.setText("");
		        
		        
				if(s==x)
				{
				     y=1;
					 z=0;		
				     final AlertDialog dialog = new AlertDialog.Builder(SecondActivity.this).create();
					 dialog.setTitle("Results");
					 dialog.setMessage("You Guessed it Right!\nCongratulations!");
					 dialog.setButton("OK",new DialogInterface.OnClickListener() 
					    {
							
						public void onClick(DialogInterface arg0, int arg1) 
						    {
								// TODO Auto-generated method stub
							 Intent i=new Intent(SecondActivity.this,MainActivity.class);
							 startActivity(i);
							 dialog.dismiss();
							}
						});
						dialog.show();
				       
				}
				
				else if(s>x)
					Toast.makeText(getApplicationContext(), "Your Guess is smaller than the desired number.\nChoose a bigger number!", Toast.LENGTH_LONG).show();
				else
					Toast.makeText(getApplicationContext(), "Your Guess is bigger than the desired number.\nChoose a smaller number!", Toast.LENGTH_LONG).show();
				
				if(z==4)
				{
					final AlertDialog dialog = new AlertDialog.Builder(SecondActivity.this).create();
					dialog.setTitle("Info!");
					dialog.setMessage("last chance");
					dialog.setButton("OK",new DialogInterface.OnClickListener() {
						
						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							dialog.dismiss();
						}
					});
					dialog.show();
				}
				if(z==5)
				{
					z=0;
					final AlertDialog dialog = new AlertDialog.Builder(SecondActivity.this).create();
					dialog.setTitle("Info!");
					dialog.setMessage("SORRY!\nAll your attempts are over!");
					dialog.setButton("OK",new DialogInterface.OnClickListener() {
						
						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent i=new Intent(SecondActivity.this,MainActivity.class);
						    startActivity(i);
							dialog.dismiss();
						}
					});
					dialog.show();
					
				}
				}
				catch(NumberFormatException ex)
				{
					Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
				}
			}
		});
       
        
        }
        
        	
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_second, menu);
        return true;
    }

    
}
