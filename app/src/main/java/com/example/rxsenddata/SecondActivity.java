package com.example.rxsenddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;



public class SecondActivity extends AppCompatActivity {

    Disposable disposable= new CompositeDisposable();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        disposable =  RxBus.subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {

                if(o instanceof Model){
                    Model data1 = (Model) o;
                     String a =data1.getFamily();
                     String f = a;


                }
                if(o instanceof  Model2){

                    Model2 data2 = (Model2) o;
                    String b = data2.getFamily2();
                    String c = b;
                }

            }
        });

//        disposable.dispose(); //unsubscribe
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        disposable.dispose(); //very important
    }
}




