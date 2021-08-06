package com.example.alertdialogboxexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog();
            }
        });
    }
    public void getDialog() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View view = layoutInflater.inflate(R.layout.dialog_box, null);
        Button tea1=view.findViewById(R.id.tea);
        Button coffie1=view.findViewById(R.id.coffie);
        tea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Tea is coming for you",Toast.LENGTH_LONG).show();
            }
        });
        coffie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Coffie is coming for you",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(view).create();
        alertDialog.show();
    }
}
