package com.example.harsha.reva;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class User_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_user_profile);
    }

    public void user_profile_button(View view){
        Intent q = new Intent(this,Home_activity.class);
        startActivity(q);
        finish();

    }

    public void change_password(View view){
        Intent i = new Intent(this, ChangePassword.class);
        startActivity(i);

        finish();

    }

    @Override
    public void  onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
