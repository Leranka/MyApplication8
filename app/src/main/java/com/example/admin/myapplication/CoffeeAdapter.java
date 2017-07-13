package com.example.admin.myapplication;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 7/13/2017.
 */

public class CoffeeAdapter extends ArrayAdapter{
    private int mColorResourceId;
    ArrayList<Coffee> coffees;

    public CoffeeAdapter(Activity context, ArrayList<Coffee> coffees, int colorResourceId) {

        super(context, 0, coffees);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check id the views is being used otherwise inflate
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_home, parent, false);
        }

        //Get the {@link Word} object located at this position in the list
        Coffee currentWord = (Coffee) getItem(position);

        //find text view in the list.xml layout with the ID version_name
        ImageView imageView = (ImageView) listView.findViewById(R.id.coffee_img);

        //get the version name from the current Word object and set this text
        imageView.setImageResource(currentWord.ImageId());

        //find the textView in the list.xml layout ID version number
        TextView defaultTextView = (TextView) listView.findViewById(R.id.textView);

        //get the version name from the current Word object and set this text
        defaultTextView.setText(currentWord.mText());

        //find text view in the list.xml layout with the ID version_name
        ImageView imageViewer = (ImageView) listView.findViewById(R.id.order);

        //get the version name from the current Word object and set this text
        imageViewer.setImageResource(currentWord.ImageRes());


        //find the color that the resource maps
        int color = ContextCompat.getColor(getContext(), mColorResourceId);


        //return the whole list item layout

        return listView;
    }
}
