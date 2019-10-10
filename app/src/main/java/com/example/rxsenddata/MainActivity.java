package com.example.rxsenddata;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;

//source https://medium.com/@bishoy_abd/sending-data-between-different-parts-of-your-app-using-rxjava2-5675153e37c

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Model2 model2 = new Model2();
        model2.setName2("hassan2");
        model2.setFamily2("family2");



        Model model = new Model("hassan","hassani");


        // we must send the object not arraylist(because of what we define in RxBus class)
        RxBus.publish(model2);
        startActivity(new Intent(MainActivity.this, SecondActivity.class));

    }
}
