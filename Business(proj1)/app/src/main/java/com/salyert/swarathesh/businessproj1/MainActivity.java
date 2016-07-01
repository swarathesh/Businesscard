package com.salyert.swarathesh.businessproj1;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout MainLayout;
    private AnimationDrawable animationDrawable;
    private TextView body;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainLayout = (RelativeLayout) findViewById(R.id.layoutMain);
        MainLayout.setBackgroundResource(R.drawable.main_background_animation);
        animationDrawable = (AnimationDrawable) MainLayout.getBackground();
        animationDrawable.start();
        body = (TextView) findViewById(R.id.rest);
        final String[] subject = new String[]{"CEO: Sundar Pichai\n\n" +
                "Founded: September 4, 1998, Menlo Park, California, United States\n\n" +
                "Headquarters: Mountain View, California, United States\n\n" +
                "Revenue: 74.54 billion USD\n\n" +
                "Founders: Larry Page, Sergey Brin\n\n" +
                "Address: 1600 Amphitheatre Parkway\n\n"+
               "Mountain View, CA 94043\n\n"+
                "Phone: +1 650-253-0000\n\n"};
        body.setText(Arrays.toString(subject).replaceAll("\\[|\\]", ""));


    }
}