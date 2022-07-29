package com.sood.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int imgarray[] = {R.drawable.all_sports_banner, R.drawable.images, R.drawable.images__1_, R.drawable.sport_equipment_2_22802518};

        flipper=(ViewFlipper) findViewById(R.id.flipper);

        for(int i = 0;i<imgarray.length;i++)
        {
            showimage(imgarray[i]);
        }
    }

    public void showimage(int img)
    {
        ImageView imageview = new ImageView(this);
        imageview.setBackgroundResource(img);

        flipper.addView(imageview);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}
