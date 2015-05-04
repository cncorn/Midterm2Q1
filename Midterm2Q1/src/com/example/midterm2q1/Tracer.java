package com.example.midterm2q1;


import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;

public class Tracer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Question1","onCreate");
		
		//notify("onCreate");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i("Question1","onPause");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i("Question1","onResume");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("Question1","onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("Question1","onDestroy");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i("Question1","onRestoreInstanceState");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i("Question1","onSaveInstanceState");
	}

	private void notify(String methodName) {
		String name = this.getClass().getName();
		String[] strings = name.split("\\.");
		Notification noti = new Notification.Builder(this)
				.setContentTitle(methodName + " " + strings[strings.length - 1])
				.setAutoCancel(true).setSmallIcon(R.drawable.ic_launcher)
				.setContentText(name).build();
		NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notificationManager.notify((int) System.currentTimeMillis(), noti);
	}

}

