package com.example.aaa.t_01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView messageView;
    EditText inputView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageView = (TextView)findViewById(R.id.textView);
        inputView = (EditText)findViewById(R.id.editText);
        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                messageView.setText(inputView.getText().toString());
            }
        });

        Button btn2 = (Button)findViewById(R.id.btn_toast);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"시작 버튼이눌렸어요",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn3 = (Button)findViewById(R.id.btn_google);
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(myIntent);
            }
        });

        Button btn4 = (Button)findViewById(R.id.btn_tel);
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-1234-5678"));
                startActivity(myIntent);
            }
        });

    }
}
