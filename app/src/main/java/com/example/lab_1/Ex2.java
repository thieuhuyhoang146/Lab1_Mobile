package com.example.lab_1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);
        Intent intent = getIntent();

        final Button callButton = (Button) findViewById(R.id.btn_phone);
        final EditText phoneNumber = (EditText) findViewById(R.id.edt_text_phone);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + phoneNumber.getText()));
                startActivity(callIntent);
            }
        });
    }
}
