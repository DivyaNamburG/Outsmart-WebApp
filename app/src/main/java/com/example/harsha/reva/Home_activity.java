package com.example.harsha.reva;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Home_activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        TextView textView = (TextView)findViewById(R.id.toolbar_title);
        textView.setText(R.string.ap_name);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageView3);  //image onclick opens drawer
        imageButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                                               if (!drawer.isDrawerOpen(GravityCompat.START)) drawer.openDrawer(Gravity.START);
                                               else drawer.closeDrawer(Gravity.END);
                                           }
                                       }
        );

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_home()).commit();
        }

    }



/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "No Recent Messages", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
    public void aa(View v) {

        Intent io =new Intent(getApplication(),User_profile.class);
        startActivity(io);

        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }

//for textbook part, every clickable code is here
    public void archictecture_button(View architecture){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).addToBackStack(null).commit();
    }

    public void civil_button(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).commit();
    }

    public void cs_button(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).commit();
    }

    public void eee_button(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).commit();
    }

    public void ece_button(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).commit();
    }

    public void mech_button(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).commit();
    }

    public void bca_button(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Semester_selection()).commit();
    }

//textbook part ends here

//ppt selection
public void sub1(View architecture){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).addToBackStack(null).commit();
    }

    public void sub2(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }

    public void sub3(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }

    public void sub4(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }

    public void sub5(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }

    public void sub6(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }

    public void sub7(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }
    public void sub8(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_sub_ppt()).commit();
    }

//ppt ends

    //video lectures onclick starts here
    public void tsub1(View architecture){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    public void tsub2(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    public void tsub3(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    public void tsub4(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    public void tsub5(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    public void tsub6(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    public void tsub7(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }
    public void tsub8(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Video_lectures()).commit();
    }

    //video lectures ends here

    //pdf onclick starts here
    public void psub1(View architecture){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }

    public void psub2(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }

    public void psub3(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }

    public void psub4(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }

    public void psub5(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }

    public void psub6(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }

    public void psub7(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }
    public void psub8(View a){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Notes_uploaded()).commit();
    }
    //pdf onclick ends here

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.content_frame);

        if(fragment instanceof Fragment_notes){
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,new Fragment_home()).commit();

        }else{
            super.onBackPressed();

        }

    }

    /*
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            //three dots
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
        */


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_home()).commit();

                break;
            case R.id.nav_notes:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_notes()).commit();

                break;
            case R.id.nav_textbooks:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_textbooks()).addToBackStack(null).commit();

                break;
            case R.id.nav_ppt:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_ppt()).commit();

                break;
            case R.id.video_lec:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Fragment_vid_lec()).commit();

                break;
            case R.id.about_us:
                Intent w = new Intent(getApplicationContext(),About_developer.class);
                startActivity(w);
                break;
            case R.id.moodle:
                Intent m = new Intent(getApplicationContext(),Moodle_web_view.class);
                startActivity(m);
                break;
            case R.id.nav_logout:

                openLogoutdialog();
                break;
            case R.id.nav_share:

                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String sharebody = "App Link";
                String sharesub = "App subject";
                myintent.putExtra(Intent.EXTRA_SUBJECT, sharesub);
                myintent.putExtra(Intent.EXTRA_TEXT, sharebody);
                startActivity(Intent.createChooser(myintent, "Share Using"));
                break;

            case R.id.settings:
                Intent intent = new Intent(getApplicationContext(), Settings.class);
                startActivity(intent);
                break;


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    public void restart() {

        Intent ii = new Intent(getApplicationContext(), Home_activity.class);
        startActivity(ii);
        finish();
    }
    public void openLogoutdialog(){
        Logout_dialog logout_dialog = new Logout_dialog();
        logout_dialog.show(getSupportFragmentManager(),"logout dialog");
    }
}