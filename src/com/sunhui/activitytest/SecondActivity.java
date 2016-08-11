package com.sunhui.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		textView = (TextView) findViewById(R.id.textView);
		// �����intent���������ڶ���activity��intent��
		Intent intent = getIntent();
		String data = intent.getStringExtra("data");
		textView.setText(data);
	}

	public void doClick(View view) {
		Intent intent = new Intent();
		intent.putExtra("sun", "����˵��������˧��");
		setResult(RESULT_OK, intent);
		finish();

	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent();
		intent.putExtra("sun", "����˵��������˧��");
		setResult(RESULT_OK, intent);
		finish();
	}
}
