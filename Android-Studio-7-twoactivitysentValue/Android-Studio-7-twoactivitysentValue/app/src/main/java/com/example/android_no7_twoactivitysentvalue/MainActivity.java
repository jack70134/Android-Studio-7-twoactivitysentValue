package com.example.android_no7_twoactivitysentvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityB();
    }
    public void clickAtoB(View v){
        EditText edit_A = (EditText)findViewById(R.id.editAvalue);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("T", edit_A.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void activityB(){
        int b = 0;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            b = Integer.parseInt(bundle.getString("R"));
            TextView Bvalue = (TextView) findViewById(R.id.value);
            Bvalue.setText(Integer.toString(b));
        }
    }
}