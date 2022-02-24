package com.example.emailotpverificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VerifyOTP extends AppCompatActivity {
    EditText n1,n2,n3,n4;
    String code1;
    String inputcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        Intent intent1=getIntent();
         code1=intent1.getStringExtra("Otp");

        Toast.makeText(VerifyOTP.this, String.valueOf(code1), Toast.LENGTH_SHORT).show();
    }

    public void Verify_Otp(View view) {
        n1=findViewById(R.id.no1_Id);
        n2=findViewById(R.id.no2_id);
        n3=findViewById(R.id.no3_id);
        n4=findViewById(R.id.no4_id);


        inputcode=n1.getText().toString().trim()+n2.getText().toString().trim()+n3.getText().toString().trim()+n4.getText().toString().trim();
        if (inputcode.equals(String.valueOf(code1)))
        {
            Intent intent=new Intent(VerifyOTP.this,HomeActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(VerifyOTP.this, "Wrong OtP", Toast.LENGTH_SHORT).show();
        }
    }
}