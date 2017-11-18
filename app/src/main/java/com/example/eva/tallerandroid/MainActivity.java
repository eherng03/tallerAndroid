package com.example.eva.tallerandroid;

import android.content.Intent;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //R es un fichero java donde están todos los recursos

        Button button = findViewById(R.id.button_launcher_activity);       //Busca la view del botón por id
        button.setOnClickListener(this);
        Log.d("Method","OnCreate();");
    }

    @Override
    public  void onClick(View w){
        createNewActivity();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


    private void createNewActivity(){
        Intent t = new Intent(this,SecondActivity.class);
        startActivity(t);
    }

}
