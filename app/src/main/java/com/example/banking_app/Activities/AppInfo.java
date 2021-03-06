package com.example.banking_app.Activities;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.banking_app.R;

public class AppInfo extends AppCompatActivity {

    private TextView info,github,linkedIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);

        info = (TextView) findViewById(R.id.appDetails);
        github = (TextView) findViewById(R.id.github);
        linkedIn= (TextView) findViewById(R.id.linkedIn);

        info.setMovementMethod(LinkMovementMethod.getInstance());
        github.setMovementMethod(LinkMovementMethod.getInstance());
        linkedIn.setMovementMethod(LinkMovementMethod.getInstance());

    }
}