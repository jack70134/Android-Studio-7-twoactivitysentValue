package com.example.android_no7_twoactivitysentvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        activityA();
    }
    public void clickBtoA(View v){
        EditText edit_B = (EditText)findViewById(R.id.editBvalue);
        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("R", edit_B.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void activityA() {
        int a= 0;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            a = Integer.parseInt(bundle.getString("T"));
            TextView Avalue = (TextView)findViewById(R.id.value);
            Avalue.setText(Integer.toString(a));
        }
    }
}