package com.example.admin.myapplication;

/**
 * Created by Admin on 7/13/2017.
 */

public class Coffee {

    private int mImage;
    private String Text;
    private int Image;


    public Coffee(int ImageId, String mText, int ImageRes) {
        mImage = ImageId;
        Text = mText;
        Image = ImageRes;

    }

    public int ImageId(){
        return mImage;
    }

    public String mText(){
        return Text;
    }

    public int ImageRes(){
        return Image;
    }
}
