package com.milkgun.grooshbene.arduinoorder;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by bene on 2016. 4. 4..
 */
public class CData {
    public String content_label;
    public String description;
    public String text;
    public String subText;
    public int subColor;
    public int spCnt;
    public int image;
    public int color;

    public CData(Context context,String text_, String subText_, int image_, int color_, int subColor_) {
        text = text_;
        image = image_;
        subText = subText_;
        color = color_;
        subColor = subColor_;
    }

    public String getText() {
        return text;
    }

    public int getImage(){
        return image;
    }

    public int getColor(){
        return color;
    }

    public int getSubColor(){
        return subColor;
    }

    public String getSubText(){
        return subText;
    }

    public int getSpCnt(){return spCnt;}
}
