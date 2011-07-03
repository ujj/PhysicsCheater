package com.ujj.physicscheater;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class PhysicsCheater extends ListActivity {
	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] countries = getResources().getStringArray(
				R.array.countries_array);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
				countries));

		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
		
				Intent i = new Intent(PhysicsCheater.this,
						FormulaActivity.class);
				i.putExtra("topic", ((TextView) view).getText());
				startActivity(i);
			}
		});
	}
}