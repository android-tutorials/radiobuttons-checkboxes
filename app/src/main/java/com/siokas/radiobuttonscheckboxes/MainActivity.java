package com.siokas.radiobuttonscheckboxes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

    // Declare the variables
    String message;
    Button button1, button2;
    CheckBox checkBox1, checkBox2, checkBox3;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button and the checkboxes with their id
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        checkBox1 = (CheckBox) findViewById(R.id.android);
        checkBox2 = (CheckBox) findViewById(R.id.ios);
        checkBox3 = (CheckBox) findViewById(R.id.windows);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // Add an OnClickListener on the button2
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the message string
                message = "";

                // Check which radio is checked
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButtonAndroid:
                        message+="Android";
                        break;

                    case R.id.radioButtonIos:
                        message+="iOS";
                        break;

                    case R.id.radioButtonWindows:
                        message+="Windows";
                        break;
                }

                // Finally display the message to the screen
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        // Add an OnClickListener on the button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the message string
                message = "";

                // Check if which checkbox is checked and append the message to the string variable
                if (checkBox1.isChecked())
                    message += "android";
                if (checkBox2.isChecked())
                    message += " ios ";
                if (checkBox3.isChecked())
                    message += " windows";

                // Finally display the message to the screen
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
