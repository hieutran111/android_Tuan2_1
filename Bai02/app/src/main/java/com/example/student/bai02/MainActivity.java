package com.example.student.bai02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnC, btnF, btnClear;
    EditText edtF, edtC;
    Double F,C,Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = (Button)findViewById(R.id.btnC);
        btnF = (Button)findViewById(R.id.btnF);
        btnClear = (Button)findViewById(R.id.btnClear);

        edtC = (EditText)findViewById(R.id.edtC);
        edtF = (EditText)findViewById(R.id.edtF);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    F = Double.parseDouble(edtF.getText().toString());

                    Result = (F-32)*5/9;
                    edtC.setText(Result+"");
                }catch(Exception x){
                    Toast.makeText(MainActivity.this, x.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    C = Double.parseDouble(edtC.getText().toString());

                    Result = C * 9/5 +32;
                    edtF.setText(Result+"");
                }catch(Exception x){

                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtC.setText("");
                edtF.setText("");
            }
        });

    }
}
