package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText eturl;
    Button btnGo,btnFb,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        eturl=findViewById(R.id.et_url);
        btnFb=findViewById(R.id.btn_facebook);
        btnGoogle=findViewById(R.id.btn_google);
        btnGo=findViewById(R.id.btn_go);


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url=eturl.getText().toString();
                if (url.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter url", Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent intent=new Intent(MainActivity.this,WebActivity.class);
                    intent.putExtra("url",url);
                    startActivity(intent);
                    }
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.google.com");
                startActivity(intent);

            }
        });
        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);

            }
        });




    }
}