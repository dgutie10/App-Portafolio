package com.example.android.myappportafolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchToast (View view){
        Button button = (Button) view;

        String buttonText = button.getText().toString().toLowerCase();

        Context context = getApplicationContext();
        CharSequence toastContent  = "This button will launch my "+buttonText+" app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,toastContent,duration);
        toast.show();


    }
}