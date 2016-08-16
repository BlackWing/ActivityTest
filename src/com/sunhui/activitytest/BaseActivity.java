package com.sunhui.activitytest;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityColler.addActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityColler.RemoveActivity(this);
	}
}
