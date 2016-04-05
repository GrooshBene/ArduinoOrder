package com.milkgun.grooshbene.arduinoorder;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by bene on 2016. 4. 4..
 */
//    public CData(Context context,String text_, String subText_, int image_, int color_, int subColor_) {

public class MainActivity extends AppCompatActivity {
    GridView mGridView;
    ArrayList<CData> mArrayList;
    ArrayAdapter<CData> mAdapter;
    android.support.v7.app.ActionBar mActionBar;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridView = (GridView)findViewById(R.id.mGridView);
        mArrayList = new ArrayList<CData>();
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mAdapter = new DataAdapter(MainActivity.this, mArrayList);
        mActionBar = getSupportActionBar();
        mActionBar.setTitle(Html.fromHtml("<font color='#2DC1A8'>DashBoard</font>"));
        mGridView.setAdapter(mAdapter);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.app_name, R.string.app_name);
        mDrawerLayout.setDrawerListener(mToggle);
        mAdapter.add(new CData(getApplicationContext(), "온도 측정 센서", "Temperature Sensor", R.drawable.ic_sensor_temp, Color.rgb(239, 154, 154), Color.rgb(229, 155, 155)));
        mAdapter.add(new CData(getApplicationContext(), "습도 측정 센서","Humidity Sensor", R.drawable.ic_sensor_supdo, Color.rgb(100,181,246), Color.rgb(66,165,245)));
        mAdapter.add(new CData(getApplicationContext(), "조도 센서","Illumination Sensor", R.drawable.ic_sensor_zodo, Color.rgb(255,209,128), Color.rgb(255,171,64)));
        mAdapter.add(new CData(getApplicationContext(), "인체 감지 센서","Motion Sensor", R.drawable.ic_sensor_motion, Color.rgb(128,203,196), Color.rgb(77,182,172)));
        mAdapter.add(new CData(getApplicationContext(), "소리 감지 센서", "Sound Sensor", R.drawable.ic_sensor_sound, Color.rgb(179,157,219), Color.rgb(149,117,205)));
        mAdapter.add(new CData(getApplicationContext(), "터치 감지 센서", "Touch Sensor", R.drawable.ic_sensor_touch, Color.rgb(248,187,208), Color.rgb(244,143,177)));
        mAdapter.add(new CData(getApplicationContext(), "자이로 센서", "Gyro Sensor", R.drawable.ic_sensor_gyro, Color.rgb(197,202,233), Color.rgb(121,134,203)));
        mAdapter.add(new CData(getApplicationContext(), "버튼","Button", R.drawable.ic_sensor_button, Color.rgb(130,177,255), Color.rgb(68,138,255)));
        mAdapter.notifyDataSetChanged();

    }
}
