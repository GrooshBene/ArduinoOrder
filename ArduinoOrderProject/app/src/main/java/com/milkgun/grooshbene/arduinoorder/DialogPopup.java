package com.milkgun.grooshbene.arduinoorder;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by bene on 2016. 4. 7..
 */
public class DialogPopup extends Activity {

    Intent intent;
    String mTitle;
    String mValue;
    String mBluetoothTitle;
    TextView mPopupTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_popup);
        mPopupTitle = (TextView)findViewById(R.id.mPopupTitle);
        intent = getIntent();
        mTitle = intent.getStringExtra("title");
        mPopupTitle.setText(mTitle);
    }
}
