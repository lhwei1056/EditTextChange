package com.example.lhwei.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by lhwei on 2017/4/19.
 */

public class SecondAc extends AppCompatActivity {

    private EditText et1,et2;
    private String s1,s2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        myTextWatcher1 tw1 = new myTextWatcher1();
        myTextWatcher2 tw2 = new myTextWatcher2();
        et1.addTextChangedListener(tw1);
        et2.addTextChangedListener(tw2);
//        et2.removeTextChangedListener();
    }
    class myTextWatcher1 implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            Log.i("Second","before1"+s);
        }

        //bijiao fangfa zai dangqian fangfa he zai afterTextChanged()fangfa zhong xiantong xiaoguo
        //douneng dadao xiangtong xiaoguo  et1,et2liandongbianhua ...
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.i("Second","changed1"+s);
            if(null != et2){
                s2 = String.valueOf(et2.getText());
                String tmps = String.valueOf(s);
                boolean _equal = tmps.equals(s2);
                Log.i("Second","after12"+s2+">>>tmps12 ="+tmps+"_equal ..."+_equal);
                if(!_equal){
                    et2.setText(s);
                }

            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            Log.i("Second","after1"+s);

        }
    }
    class myTextWatcher2 implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            Log.i("Second","before2"+s);
        }

        //bijiao fangfa zai dangqian fangfa he zai afterTextChanged()fangfa zhong xiantong xiaoguo
        //douneng dadao xiangtong xiaoguo  et1,et2liandongbianhua ...
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.i("Second","changed2"+s);
            if(null != et1){
                s1 = String.valueOf(et1.getText());
                String tmps = String.valueOf(s);
                boolean _equal = tmps.equals(s1);
                Log.i("Second","after21>>>"+s1+"  tmps21 >>"+tmps+"_equal "+_equal);
                if(!_equal){
                    et1.setText(s);
                }

            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            Log.i("Second","after2"+s);
        }
    }
}
