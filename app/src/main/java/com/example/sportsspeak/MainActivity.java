package com.example.sportsspeak;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing,imgKarate,imgJudo,imgAikido,imgkick,imgTaekio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//string
        imgBoxing=findViewById(R.id.imgboxing);
        imgKarate=findViewById(R.id.imgkarate);
        imgJudo=findViewById(R.id.imgjudo);
        imgAikido=findViewById(R.id.imgaikido);
        imgkick=findViewById(R.id.imgkickboxing);
        imgTaekio=findViewById(R.id.imgtaekw);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgkick.setOnClickListener(MainActivity.this);
        imgTaekio.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View imageButtonView) {
        switch (imageButtonView.getId()){


            case R.id.imgboxing:
                playSportsName(imgBoxing.getTag().toString());

                break;
            case R.id.imgkarate:
                playSportsName(imgKarate.getTag().toString());
                break;
            case R.id.imgjudo:
                playSportsName(imgJudo.getTag().toString());
                break;
            case R.id.imgaikido:
                playSportsName(imgAikido.getTag().toString());
                break;
            case R.id.imgkickboxing:
                playSportsName(imgkick.getTag().toString());
                break;
            case R.id.imgtaekw:
                playSportsName(imgTaekio.getTag().toString());

                break;
        }

    }

    void playSportsName(String sportName){

        MediaPlayer sportsPlayer=MediaPlayer.create(this,getResources().
                getIdentifier(sportName,"raw",getPackageName()));
        sportsPlayer.start();

    }
}
