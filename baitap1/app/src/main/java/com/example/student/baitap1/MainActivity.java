package com.example.student.baitap1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB;
    TextView txtKetQua;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUCLN, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnTong = findViewById(R.id.btnTong);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                txtKetQua.setText(Integer.toString(a+b));
            }
        });

        btnHieu = findViewById(R.id.btnHieu);

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                txtKetQua.setText(Integer.toString(a-b));
            }
        });

        btnTich = findViewById(R.id.btnTich);

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                txtKetQua.setText(Integer.toString(a*b));
            }
        });

        btnThuong = findViewById(R.id.btnThuong);

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                if (b == 0) {
                    txtKetQua.setText("Không thể chia cho 0");
                } else {
                    txtKetQua.setText(Integer.toString(a/b));
                }
            }
        });

        btnThoat = findViewById(R.id.btnThoat);

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
