package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vilas on 3/30/2016.
 */
public class SongMood  extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.songmood);
            setContentView(R.layout.songscat);
        }
    public void songs1(View v)
        {
            Intent redirect = new Intent(SongMood.this,MainActivity.class);
            startActivity(redirect);

        }
    public void songs2(View v)
    {
        Intent redirect = new Intent(SongMood.this,timecategorisation.class);

        startActivity(redirect);

    }
    public void songs3(View v)
    {
    Intent redirect = new Intent(SongMood.this,year.class);
    startActivity(redirect);
    }

    public void songs4(View v)
    {
        Intent redirect = new Intent(SongMood.this,yearnew.class);
        startActivity(redirect);
    }

    public void songs5(View v)
    {
        Intent redirect = new Intent(SongMood.this,categorisation.class);
        startActivity(redirect);
    }

}
