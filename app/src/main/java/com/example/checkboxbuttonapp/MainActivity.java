package com.example.checkboxbuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {

        CheckBox chk;
        TextView txvShow;
        String str = "";

        int[] id = {R.id.chk01,R.id.chk02,R.id.chk03,R.id.chk04}

        for(int i : id){

            chk = findViewById(i);
            if(chk.isChecked())
                str += "\n" + chk.getText();
        }

        txvShow = findViewById(R.id.txvShow);
        txvShow.setText(str);
    }
}
