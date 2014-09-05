package com.example.android_contextmenu_setbackground;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private static final int ITEM1 =Menu.FIRST;
	private static final int ITEM2 =Menu.FIRST+1;
	private static final int ITEM3 =Menu.FIRST+2;
	private TextView tx1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tx1=(TextView)findViewById(R.id.TextView1);
		registerForContextMenu(tx1);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu,View v,ContextMenuInfo menuinfo) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch(id){
		case R.id.red:
			tx1.setBackgroundColor(Color.RED);
			break;
		case R.id.blue:
			tx1.setBackgroundColor(Color.BLUE);
			break;
		case R.id.green:
			tx1.setBackgroundColor(Color.GREEN);
			break;
		
		}
		return true;
	}
}
