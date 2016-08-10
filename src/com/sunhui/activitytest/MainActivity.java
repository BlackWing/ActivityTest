package com.sunhui.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug.IntToString;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void doClick(View view) {
		// Intent intent = new Intent(this, SecondActivity.class);
		// Intent intent=new Intent("com.sunhui.ACTION_START");
		// startActivity(intent);
		switch (view.getId()) {
		case R.id.button1:
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("http://www.taobao.com"));
			startActivity(intent);
			break;
		case R.id.button2:
			Intent intent2 = new Intent(Intent.ACTION_DIAL);
			intent2.setData(Uri.parse("tel:15720615167"));
			startActivity(intent2);
			break;
		}

		// Toast.makeText(this, "你是蠢猪么", Toast.LENGTH_LONG).show();
	}

	// public void callClick(View view) {
	// Intent intent2 = new Intent(Intent.ACTION_DIAL);
	// intent2.setData(Uri.parse("tel:15720615167"));
	// startActivity(intent2);
	// }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(this, "你是家猪么", Toast.LENGTH_LONG).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "你是野猪么", Toast.LENGTH_LONG).show();
			break;

		}
		return true;
	}

}
