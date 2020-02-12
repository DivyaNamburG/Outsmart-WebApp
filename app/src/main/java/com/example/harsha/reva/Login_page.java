package com.example.harsha.reva;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;                 //for box messages
import android.app.ProgressDialog;           //for loading gifs

import com.android.volley.AuthFailureError;  //volley for networking
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;



public class Login_page extends AppCompatActivity {
    public static final String LOGIN_URL="http://girish-bp-54.000webhostapp.com/home.php";
    public static final String KEY_EMAIL="email";
    public static final String KEY_PASSWORD="password";
    public static final String LOGIN_SUCCESS="success";
    public static final String SHARED_PREF_NAME="tech";
    public static final String EMAIL_SHARED_PREF = "email";
    public static final String LOGGEDIN_SHARED_PREF="loggedin";
    public static boolean getInstance;
    private EditText editTextSRN;
    private EditText editTextPassword;
    private Button BtnLogin;
    private boolean loggedIn=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        editTextSRN=(EditText)findViewById(R.id.editText);
        editTextPassword=(EditText)findViewById(R.id.editText2);
        BtnLogin=(Button)findViewById(R.id.button2);
        BtnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
                ProgressDialog progressDialog = new ProgressDialog(Login_page.this);
                progressDialog.setMessage("Logging In");
                progressDialog.show();
                progressDialog.setCancelable(false);

            }
        });
    }

    private void login() {

        final String email = editTextSRN.getText().toString().trim().toLowerCase();  //putting text to strings
        final String password = editTextPassword.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {       //on server response
                        if(response.trim().equalsIgnoreCase(LOGIN_SUCCESS)){

                            SharedPreferences sharedPreferences = Login_page.this.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putBoolean(LOGGEDIN_SHARED_PREF, true);
                            editor.putString(EMAIL_SHARED_PREF, email);

                            editor.commit();
//from line 55 to 68 its login page activity code with server URL interaction
                            Intent intent = new Intent(Login_page.this, Home_activity.class);
                            startActivity(intent);
                            finish();

                            Toast.makeText(Login_page.this, "Login Successfull!", Toast.LENGTH_LONG).show();
                        }else{
                            Intent intent = new Intent(getApplicationContext(),Login_page.class);
                            startActivity(intent);
                            finish();
                            Toast.makeText(Login_page.this, "Invalid username or password", Toast.LENGTH_LONG).show();


                        }
                    }
                },
                new Response.ErrorListener() {      //on no response
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> prams = new HashMap<>();
                prams.put(KEY_EMAIL, email);
                prams.put(KEY_PASSWORD, password);

                return prams;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);       //adding request to queue
        requestQueue.add(stringRequest);
    }
    @Override
    protected void onResume() {         //on resume when the app is opened after login
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        loggedIn = sharedPreferences.getBoolean(LOGGEDIN_SHARED_PREF, false);
        if(loggedIn){
            Intent intent = new Intent(Login_page.this, Home_activity.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }


}