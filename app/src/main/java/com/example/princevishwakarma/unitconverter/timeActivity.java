package com.example.princevishwakarma.unitconverter;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class timeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    EditText input;
    Spinner spinner;
    TextView resultshow;



    String Millisecond ="Millisecond",Second="Second",Minute ="Minute",Hour="Hour",Day ="Day",Week="Week";


    TextView milli1,seco1,min1,hou1,day1,week1;
    String[] option = { "Select Unit","Millisecond", "Second", "Minute", "Hour", "Meter","Day","Week" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button result= findViewById(R.id.bt);
        final EditText input= findViewById(R.id.input);
        final TextView resultshow= findViewById(R.id.resultshow);
        final Spinner spinner= findViewById(R.id.spinner);
        milli1 = findViewById(R.id.ms);
        seco1= findViewById(R.id.s);
        min1= findViewById(R.id.m);
        hou1= findViewById(R.id.h);
        day1= findViewById(R.id.d);
       week1= findViewById(R.id.w);


        ArrayAdapter<String> a = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,option);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(a);







        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        result.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                final String option1 = (String) spinner.getSelectedItem();
                String name = input.getText().toString().trim();


                if (TextUtils.isEmpty(name)) {
                    input.setError(getString(R.string.enter_number));
                    input.requestFocus();

                }else {

                    BigDecimal bd1 = new BigDecimal(name);
                    if (option1.equals(Millisecond)) {
                        resultshow.setText("0");
                        BigDecimal milli = new BigDecimal("1");
                        BigDecimal seco = new BigDecimal("0.001");
                        BigDecimal min = new BigDecimal("0.0000166667");
                        BigDecimal hou = new BigDecimal("0.00000277778");
                        BigDecimal day = new BigDecimal("0.00000000165344");
                        BigDecimal week = new BigDecimal("0.0000000115741");

                        BigDecimal milli_result = bd1.multiply(milli);
                        BigDecimal seco_result = bd1.multiply(seco);
                        BigDecimal min_result = bd1.multiply(min);
                        BigDecimal  hou_result = bd1.multiply(hou);
                        BigDecimal day_result = bd1.multiply(day);
                        BigDecimal week_result = bd1.multiply(week);

                        milli1.setText(String.valueOf(milli_result));
                       seco1.setText(String.valueOf(seco_result));
                       min1.setText(String.valueOf(min_result));
                       hou1.setText(String.valueOf(hou_result));
                       day1.setText(String.valueOf(day_result));
                       week1.setText(String.valueOf(week_result));

                        Toast.makeText(getApplicationContext(), "Converted into MilliSecond", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);


                    } else if (option1.equals(Second)) {
                        resultshow.setText("0");
                        BigDecimal milli = new BigDecimal("1000");
                        BigDecimal seco = new BigDecimal("1");
                        BigDecimal min = new BigDecimal("0.0166667");
                        BigDecimal hou = new BigDecimal("0.000277778");
                        BigDecimal day = new BigDecimal("0.0000115741");
                        BigDecimal week = new BigDecimal("0.00000165344");


                        BigDecimal milli_result = bd1.multiply(milli);
                        BigDecimal seco_result = bd1.multiply(seco);
                        BigDecimal min_result = bd1.multiply(min);
                        BigDecimal  hou_result = bd1.multiply(hou);
                        BigDecimal day_result = bd1.multiply(day);
                        BigDecimal week_result = bd1.multiply(week);

                        milli1.setText(String.valueOf(milli_result));
                        seco1.setText(String.valueOf(seco_result));
                        min1.setText(String.valueOf(min_result));
                        hou1.setText(String.valueOf(hou_result));
                        day1.setText(String.valueOf(day_result));
                        week1.setText(String.valueOf(week_result));

                        Toast.makeText(getApplicationContext(), "Converted into Second", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }else if (option1.equals(Minute)) {
                        resultshow.setText("0");
                        BigDecimal milli = new BigDecimal("60000");
                        BigDecimal seco = new BigDecimal("60");
                        BigDecimal min = new BigDecimal("1");
                        BigDecimal hou = new BigDecimal("0.0166667");
                        BigDecimal day = new BigDecimal("0.000694444");
                        BigDecimal week = new BigDecimal("0.0000992063");

                        BigDecimal milli_result = bd1.multiply(milli);
                        BigDecimal seco_result = bd1.multiply(seco);
                        BigDecimal min_result = bd1.multiply(min);
                        BigDecimal  hou_result = bd1.multiply(hou);
                        BigDecimal day_result = bd1.multiply(day);
                        BigDecimal week_result = bd1.multiply(week);

                        milli1.setText(String.valueOf(milli_result));
                        seco1.setText(String.valueOf(seco_result));
                        min1.setText(String.valueOf(min_result));
                        hou1.setText(String.valueOf(hou_result));
                        day1.setText(String.valueOf(day_result));
                        week1.setText(String.valueOf(week_result));

                        Toast.makeText(getApplicationContext(), "Converted into Minute", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Hour)) {
                        resultshow.setText("0");
                        BigDecimal milli = new BigDecimal("3600000");
                        BigDecimal seco = new BigDecimal("3600");
                        BigDecimal min = new BigDecimal("60");
                        BigDecimal hou = new BigDecimal("1");
                        BigDecimal day = new BigDecimal("0.0416667 ");
                        BigDecimal week = new BigDecimal("0.00595238");

                        BigDecimal milli_result = bd1.multiply(milli);
                        BigDecimal seco_result = bd1.multiply(seco);
                        BigDecimal min_result = bd1.multiply(min);
                        BigDecimal  hou_result = bd1.multiply(hou);
                        BigDecimal day_result = bd1.multiply(day);
                        BigDecimal week_result = bd1.multiply(week);

                        milli1.setText(String.valueOf(milli_result));
                        seco1.setText(String.valueOf(seco_result));
                        min1.setText(String.valueOf(min_result));
                        hou1.setText(String.valueOf(hou_result));
                        day1.setText(String.valueOf(day_result));
                        week1.setText(String.valueOf(week_result));

                        Toast.makeText(getApplicationContext(), "Converted into Hour", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Day)) {

                        resultshow.setText("0");
                        BigDecimal milli = new BigDecimal("86400000");
                        BigDecimal seco = new BigDecimal("84600");
                        BigDecimal min = new BigDecimal("1440");
                        BigDecimal hou = new BigDecimal("24 ");
                        BigDecimal day = new BigDecimal("1 ");
                        BigDecimal week = new BigDecimal("0.142857");


                        BigDecimal milli_result = bd1.multiply(milli);
                        BigDecimal seco_result = bd1.multiply(seco);
                        BigDecimal min_result = bd1.multiply(min);
                        BigDecimal  hou_result = bd1.multiply(hou);
                        BigDecimal day_result = bd1.multiply(day);
                        BigDecimal week_result = bd1.multiply(week);

                        milli1.setText(String.valueOf(milli_result));
                        seco1.setText(String.valueOf(seco_result));
                        min1.setText(String.valueOf(min_result));
                        hou1.setText(String.valueOf(hou_result));
                        day1.setText(String.valueOf(day_result));
                        week1.setText(String.valueOf(week_result));
                        Toast.makeText(getApplicationContext(), "Converted into Day", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    } else if (option1.equals(Week)) {

                        resultshow.setText("0");
                        BigDecimal milli = new BigDecimal("86400000");
                        BigDecimal seco = new BigDecimal("604800");
                        BigDecimal min = new BigDecimal("10080");
                        BigDecimal hou = new BigDecimal("168");
                        BigDecimal day = new BigDecimal("7");
                        BigDecimal week = new BigDecimal("1");



                        BigDecimal milli_result = bd1.multiply(milli);
                        BigDecimal seco_result = bd1.multiply(seco);
                        BigDecimal min_result = bd1.multiply(min);
                        BigDecimal  hou_result = bd1.multiply(hou);
                        BigDecimal day_result = bd1.multiply(day);
                        BigDecimal week_result = bd1.multiply(week);

                        milli1.setText(String.valueOf(milli_result));
                        seco1.setText(String.valueOf(seco_result));
                        min1.setText(String.valueOf(min_result));
                        hou1.setText(String.valueOf(hou_result));
                        day1.setText(String.valueOf(day_result));
                        week1.setText(String.valueOf(week_result));
                        Toast.makeText(getApplicationContext(), "Converted into Week", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }

                    else {
                        Toast.makeText(getApplicationContext(), "Select Unit", Toast.LENGTH_LONG).show();
                    }





                }
            }

        });
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
            Intent i = new Intent(timeActivity.this, aboutActivity.class);
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
            Intent i = new Intent(timeActivity.this, lengthActivity.class);
            startActivity(i);

        } else if (id == R.id.mass_nav) {
            Intent i = new Intent(timeActivity.this, massActivity.class);
            startActivity(i);

        } else if (id == R.id.time_nav) {
            Intent i = new Intent(timeActivity.this,timeActivity.class);
            startActivity(i);

        } else if (id == R.id.temp_nav) {
            Intent i = new Intent(timeActivity.this, tempActivity.class);
            startActivity(i);

        } else if (id == R.id.ds_nav) {
            Intent i = new Intent(timeActivity.this, dsActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

        }else if (id == R.id.contact) {
            Intent i = new Intent(timeActivity.this,contactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
