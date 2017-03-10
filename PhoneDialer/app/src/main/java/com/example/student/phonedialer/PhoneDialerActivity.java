package com.example.student.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity {

    private EditText phoneNumberEditText;
    private ImageButton backspaceImageButton, callImageButton, hangupImageButton;
    private Button genericButton;
    final private static int[] button_ids = {
            R.id.button_0,
            R.id.button_1,
            R.id.button_2,
            R.id.button_3,
            R.id.button_4,
            R.id.button_5,
            R.id.button_6,
            R.id.button_7,
            R.id.button_8,
            R.id.button_9
    };

    private GenericButtonClickListener genericButtonClickListener = new GenericButtonClickListener();

    private class GenericButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            phoneNumberEditText.setText(phoneNumberEditText.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        phoneNumberEditText = (EditText)findViewById(R.id.phone_number_edit_text);
        backspaceImageButton = (ImageButton)findViewById(R.id.backspace_image_button);
        callImageButton = (ImageButton)findViewById(R.id.call_image_button);
        hangupImageButton = (ImageButton) findViewById(R.id.hangup_image_button);
        for (int i = 0; i < button_ids.length; i++)
            genericButton = (Button)findViewById(button_ids[i]);
    }


}
