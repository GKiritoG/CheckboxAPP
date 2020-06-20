package com.example.checkboxbuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOK(view: View) {

        CheckBox chk;
        TextView txvSow;
        String str = "";

        int[] if = {R.id.chk01,R.id.chk02,R.id.chk03,R.id.chk04}

        for(int i : id){

            chk = findViewById(i);
            if(chk.isChecked())
                str += "\n" + chk.getText();
        }

        txvShow = findViewById(R.id.txvShow);
        txvShow.setText(str);

    }
}
