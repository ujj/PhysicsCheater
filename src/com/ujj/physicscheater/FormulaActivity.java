package com.ujj.physicscheater;

import com.ujj.physicscheater.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FormulaActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formulaview);
		Button closeButton = (Button) findViewById(R.id.close_button);
		TextView tv = (TextView) findViewById(R.id.formulae);
		Intent i = getIntent();
		String field1Value = i.getStringExtra("topic");

		if (field1Value.equals("Mechanics")) {
			tv.setText(R.string.Mechanics);
		} else if (field1Value.equals("Work, Energy, Power")) {
			tv.setText(R.string.WPE);
		} else if (field1Value.equals("Impulse, Momentum")) {
			tv.setText(R.string.IM);
		} else if (field1Value.equals("Rotational Motion")) {
			tv.setText(R.string.RM);
		} else if (field1Value.equals("Electromagnetic Waves")) {
			tv.setText(R.string.EMW);
		} else if (field1Value.equals("Optics")) {
			tv.setText(R.string.OP);
		} else if (field1Value.equals("Heat and Thermodynamics")) {
			tv.setText(R.string.TD);
		} else if (field1Value.equals("Electrostatics")) {
			tv.setText(R.string.ES);
		} else if (field1Value.equals("Electric Current")) {
			tv.setText(R.string.EC);
		} else if (field1Value.equals("Magnetism")) {
			tv.setText(R.string.MG);
		} else if (field1Value.equals("Gravitation")) {
			tv.setText(R.string.G);
		} else if (field1Value.equals("Important Constants")) {
			tv.setText(R.string.C);
		} else if (field1Value.equals("Fluids")) {
			tv.setText(R.string.F);
		}
		closeButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}
}
