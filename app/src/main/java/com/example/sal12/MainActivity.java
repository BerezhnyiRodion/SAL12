package com.example.sal12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final  String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "find View-elements");
        tvOut = (TextView) findViewById(R.id.tv_out);
        btnOk = (Button) findViewById(R.id.btn_ok);
        btnCancel = (Button) findViewById(R.id.btn_cancel);

        Log.d(TAG,"assign handler to buttons");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG,"by id we determine the button that called this handler");
        switch (v.getId()) {
            case R.id.btn_ok:
                Log.d(TAG,"OK button");
                tvOut.setText("OK button pressed");
                Toast.makeText(this, "OK button pressed", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_cancel:
                Log.d(TAG, "Cancel button");
                tvOut.setText("Cancel button pressed");
                Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_LONG).show();
                break;
        }
    }
}