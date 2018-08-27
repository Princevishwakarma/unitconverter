package com.example.princevishwakarma.unitconverter;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button lg,ms,temp,time,ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button lg = findViewById(R.id.lg);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, lengthActivity.class);
                startActivity(i);


            }
        });
        Button ms = findViewById(R.id.ms);
        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, massActivity.class);
                startActivity(i);


            }
        });
        Button tm = findViewById(R.id.tm);
        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, timeActivity.class);
                startActivity(i);


            }
        });
        Button temp = findViewById(R.id.temp);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, tempActivity.class);
                startActivity(i);


            }
        });
        Button ds = findViewById(R.id.ds);
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, dsActivity.class);
                startActivity(i);


            }
        });




        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }








    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_About) {
            Intent i = new Intent(MainActivity.this, aboutActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.lg_nav) {
            Intent i = new Intent(MainActivity.this, lengthActivity.class);
            startActivity(i);

        } else if (id == R.id.mass_nav) {
            Intent i = new Intent(MainActivity.this, massActivity.class);
            startActivity(i);

        } else if (id == R.id.time_nav) {
            Intent i = new Intent(MainActivity.this,timeActivity.class);
            startActivity(i);

        } else if (id == R.id.temp_nav) {
            Intent i = new Intent(MainActivity.this, tempActivity.class);
            startActivity(i);

        } else if (id == R.id.ds_nav) {
            Intent i = new Intent(MainActivity.this, dsActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {
            shareTextUrl();
        }else if (id == R.id.contact) {
            Intent i = new Intent(MainActivity.this,contactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void shareTextUrl() {
        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(Intent.EXTRA_SUBJECT, "Share Unit Converter App");
        share.putExtra(Intent.EXTRA_TEXT, "http://www.newsmarttrick.com");

        startActivity(Intent.createChooser(share, "Share link!"));
    }
}
