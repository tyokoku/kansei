package com.example.tyokoku;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.core.examples.java.helloar.R;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;


public class StampActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stamp);

        /*ホーム画面に戻る*/
        Button returnButton = findViewById(R.id.returnbutton);
        returnButton.setOnClickListener(v -> finish());

        myMethod();
    }


    public void myMethod(){
        for(int i=0; i < 216; i++) {
            String str = "circle" + (i+1);
            int Id = getResources().getIdentifier(str, "id", getPackageName());
            ImageView id = (ImageView)findViewById(Id);

            id.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    id.setImageResource(R.drawable.stamp);
                }
            });
        }

    }

}





