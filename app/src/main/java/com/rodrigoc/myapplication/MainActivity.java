package com.rodrigoc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.rodrigoc.myapplication.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    private Button mButton, mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btn_send);
        mButton.setOnClickListener(v->{
            Intent mIntent=new Intent(MainActivity.this,NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,"Mi genio florece en la masacre, como un lirio al amanecer.");
            startActivity(mIntent);
        });
        mButtonShare=findViewById(R.id.btn_shr);
        mButtonShare.setOnClickListener(v->{
            Intent mIntent=new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT,"Algún día mi genialidad será... comprendida.");
            startActivity(mIntent);
        });
    }
    /*
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"EN PAUSA");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"DETENIDO");
    }*/


}
