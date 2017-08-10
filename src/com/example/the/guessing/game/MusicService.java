package com.example.the.guessing.game;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {

	MediaPlayer mp;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		mp = MediaPlayer.create(getApplicationContext(), R.raw.harry);
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		if(mp !=null)
		{
			mp.stop();
		}
		super.onDestroy();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		if(mp !=null)
		{
			mp.start();
		}
		super.onStart(intent, startId);
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
