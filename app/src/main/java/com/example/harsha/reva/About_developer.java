package com.example.harsha.reva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About_developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
    }

    public void developer_button(View view){
        Intent q = new Intent(this,Home_activity.class);
        startActivity(q);
        finish();

    }

    }

