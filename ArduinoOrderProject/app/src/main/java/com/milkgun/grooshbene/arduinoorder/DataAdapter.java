package com.milkgun.grooshbene.arduinoorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by bene on 2016. 4. 4..
 */
public class DataAdapter extends ArrayAdapter<CData> {
    // 레이아웃 XML을 읽어들이기 위한 객체
    private LayoutInflater mInflater;
    TextView phone;
    ImageView imageView;
    LinearLayout mLinearLayout;
    LinearLayout mSubLinearLayout;
    TextView mSubTextView;


    public DataAdapter(Context context, ArrayList<CData> object) {
        // 상위 클래스의 초기화 과정
        // context, 0, 자료구조
        super(context, 0, object);
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        Typeface tf = Typeface.createFromAsset(context.getAssets(), "NotoSansCJKkr-Regular.otf");
//        name.setTypeface(tf);
//        family.setTypeface(tf);
//        phone.setTypeface(tf);
    }

    // 보여지는 스타일을 자신이 만든 xml로 보이기 위한 구문
    @Override
    public View getView(int position, View v, ViewGroup parent) {

        View view = null;
        // 현재 리스트의 하나의 항목에 보일 컨트롤 얻기
        if (v == null) {
            // XML 레이아웃을 직접 읽어서 리스트뷰에 넣음
            view = mInflater.inflate(R.layout.grid_custom, null);
        } else {
            view = v;
        }
        // 자료를 받는다.
        CData data = this.getItem(position);
        if (data != null) {
            //화면 출력
            phone = (TextView)view.findViewById(R.id.mMainText);
            phone.setText(data.getText());
            imageView = (ImageView)view.findViewById(R.id.mImageView);
            imageView.setImageResource(data.getImage());
            mSubLinearLayout = (LinearLayout)view.findViewById(R.id.mSubLinearLayout);
            mSubLinearLayout.setBackgroundColor(data.getSubColor());
            mSubTextView = (TextView)view.findViewById(R.id.mSubText);
            mSubTextView.setText(data.getSubText());
            mLinearLayout = (LinearLayout)view.findViewById(R.id.mLinearLayout);
            mLinearLayout.setBackgroundColor(data.getColor());
        }
        return view;
    }

    @Override
    public CData getItem(int position) {
        return super.getItem(position);
    }
}