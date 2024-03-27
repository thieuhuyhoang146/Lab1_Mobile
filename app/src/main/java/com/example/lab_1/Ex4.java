package com.example.lab_1;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Ex4 extends AppCompatActivity {

    private EditText editText;
    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);

        editText = findViewById(R.id.edt_usr_input);

        // Set up the AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Văn bản vừa nhập là:");
        builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());

        alertDialog = builder.create();

        // Set up the EditText to listen for the Enter key press
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    // Get the text from EditText
                    String message = editText.getText().toString();

                    // Set the message to display in AlertDialog
                    alertDialog.setMessage(message);

                    // Show the AlertDialog
                    alertDialog.show();

                    return true;
                }
                return false;
            }
        });
    }
}
