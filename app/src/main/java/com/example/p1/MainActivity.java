package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv,tv1;
    Button btn1,btn2,btn3,btn4;
   Button btn21,btn22,btn23,btn24;
   Button btn31,btn32,btn33,btn34;
   Button btn41,btn42,btn43,btn44;
   Button btn51,btn52,btn53,btn54;
   Dialog dialog;

   Button btn61,btn62,btn63,btn64;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_winner);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn21 = findViewById(R.id.btn21);
        btn23 = findViewById(R.id.btn23);
        btn22 = findViewById(R.id.btn22);
        btn24 = findViewById(R.id.btn24);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn41 = findViewById(R.id.btn41);
        btn42 = findViewById(R.id.btn42);
        btn43 = findViewById(R.id.btn43);
        btn44 = findViewById(R.id.btn44);
        btn51 = findViewById(R.id.btn51);
        btn52 = findViewById(R.id.btn52);
        btn53 = findViewById(R.id.btn53);
        btn54 = findViewById(R.id.btn54);
        btn61 = findViewById(R.id.btn61);
        btn62 = findViewById(R.id.btn62);
        btn63 = findViewById(R.id.btn63);
        btn64 = findViewById(R.id.btn64);

        btn1 .setOnClickListener(this);
        btn2 .setOnClickListener(this);
        btn3 .setOnClickListener(this);
        btn4 .setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn41.setOnClickListener(this);
        btn42.setOnClickListener(this);
        btn43.setOnClickListener(this);
        btn44.setOnClickListener(this);
        btn51.setOnClickListener(this);
        btn52.setOnClickListener(this);
        btn53.setOnClickListener(this);
        btn54.setOnClickListener(this);
        btn61.setOnClickListener(this);
        btn62.setOnClickListener(this);
        btn63.setOnClickListener(this);
        btn64.setOnClickListener(this);
        SharedPreferences sp = getSharedPreferences("mypre",MODE_PRIVATE);
        String sb = sp.getString("name","no value as of now");
        tv1.setText(sb);


    }

    public void dismis(View v)
    {
        dialog.dismiss();
        tv1.setText(null);
        tv.setText(null);
    }

    @Override
    public void onClick(View v) {
        String sb = tv.getText().toString();
        SharedPreferences sp = getSharedPreferences("mypre",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name",sb);
        editor.apply();
        tv1.setText("last value = " +sb);






        switch (v.getId()) {
            case R.id.btn1:
                tv.setText("2");

                break;
            case R.id.btn2:
                tv.setText("6");

                break;
            case R.id.btn3:
                tv.setText("7");
                break;
            case R.id.btn4:
                tv.setText("8");

                break;
            case R.id.btn21:
                tv.setText("6");

                break;
            case R.id.btn22:
                tv.setText("7");

                break;
            case R.id.btn23:
                tv.setText("1");

                break;
            case R.id.btn24:
                tv.setText("4");

                break;
            case R.id.btn31:
                tv.setText("6");

                break;
            case R.id.btn32:
                tv.setText("4");

                break;
            case R.id.btn33:
                tv.setText("4");

                break;
            case R.id.btn34:
                tv.setText("2");

                break;
            case R.id.btn41:
                tv.setText("4");

                break;
            case R.id.btn42:
                tv.setText("6");

                break;
            case R.id.btn43:
                tv.setText("1");

                break;
            case R.id.btn44:
                tv.setText("3");
                break;
            case R.id.btn51:
                tv.setText("9");
                break;
            case R.id.btn52:
                tv.setText("0");
                break;
            case R.id.btn53:
                tv.setText("1");
                break;
            case R.id.btn54:
                tv.setText("6");
                break;
            case R.id.btn61:
                tv.setText("8");
                break;
            case R.id.btn62:
                tv.setText("6");
                break;
            case R.id.btn63:
                tv.setText("4");
                break;
            case R.id.btn64:
                tv.setText("5");
                break;

        }
        String a2 = sb;
        String a3 = tv.getText().toString();
        if(a2.equals(a3)  )
        {
         dialog.show();
        }



        }

}