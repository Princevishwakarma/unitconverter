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

public class tempActivity extends AppCompatActivity
     implements NavigationView.OnNavigationItemSelectedListener {
    EditText input;
    Spinner spinner;
    TextView resultshow;



    String Celsius ="Celsius",Fahrenheit="Fahrenheit",Kelvin="Kelvin";


    TextView c1,f1,kl1;
    String[] option = { "Select Unit","Celsius", "Fahrenheit","Kelvin" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button result= findViewById(R.id.bt);
        final EditText input= findViewById(R.id.input);
        final TextView resultshow= findViewById(R.id.resultshow);
        final Spinner spinner= findViewById(R.id.spinner);
        c1 = findViewById(R.id.c);
        f1= findViewById(R.id.f);
        kl1= findViewById(R.id.kl);


        ArrayAdapter<String> a = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,option);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

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

                    if (option1.equals(Celsius)) {
                        resultshow.setText("0");
                        BigDecimal c = new BigDecimal("1");
                        BigDecimal f = new BigDecimal("33.8");
                        BigDecimal kl = new BigDecimal("273");

                        BigDecimal c_result = bd1.multiply(c);
                        BigDecimal f_result = bd1.multiply(f);
                        BigDecimal kl_result = bd1.add(kl);

                        c1.setText(String.valueOf(c_result));
                        f1.setText(String.valueOf(f_result));
                        kl1.setText(String.valueOf(kl_result));

                        Toast.makeText(getApplicationContext(), "Converted into Celsius", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);

                    } else if (option1.equals(Fahrenheit)) {
                        resultshow.setText("0");

                        BigDecimal c11 = new BigDecimal("0.5555");
                        BigDecimal c111 = new BigDecimal("32");
                        BigDecimal f = new BigDecimal("1");
                        BigDecimal kl = new BigDecimal("273");

                        BigDecimal c_result1= bd1.subtract(c111);
                        BigDecimal c_result= c_result1.multiply(c11);
                        BigDecimal f_result = bd1.multiply(f);
                        BigDecimal kl1_result = c_result.add(kl);

                        c1.setText(String.valueOf(c_result));
                        f1.setText(String.valueOf(f_result));
                        kl1.setText(String.valueOf(kl1_result));

                        Toast.makeText(getApplicationContext(), "Converted into Fahrenheit", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Kelvin)) {
                        resultshow.setText("0");
                        BigDecimal c = new BigDecimal(273);
                        BigDecimal f = new BigDecimal("9");
                        BigDecimal ff = new BigDecimal("2298.35");
                        BigDecimal fff = new BigDecimal("5");
                        BigDecimal kl = new BigDecimal("1");




                        BigDecimal c_result = bd1.subtract(c);
                        BigDecimal f_result1 = bd1.multiply(f);
                        BigDecimal f_result11 = f_result1.subtract(ff);
                        BigDecimal f_result = f_result11.divide(fff);
                        BigDecimal kl_result = bd1.multiply(kl);

                        c1.setText(String.valueOf(c_result));
                        f1.setText(String.valueOf(f_result));
                        kl1.setText(String.valueOf(kl_result));
                        Toast.makeText(getApplicationContext(), "Converted into Kelvin", Toast.LENGTH_LONG).show();
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
            Intent i = new Intent(tempActivity.this, aboutActivity.class);
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
            Intent i = new Intent(tempActivity.this, lengthActivity.class);
            startActivity(i);

        } else if (id == R.id.mass_nav) {
            Intent i = new Intent(tempActivity.this, massActivity.class);
            startActivity(i);

        } else if (id == R.id.time_nav) {
            Intent i = new Intent(tempActivity.this,timeActivity.class);
            startActivity(i);

        } else if (id == R.id.temp_nav) {
            Intent i = new Intent(tempActivity.this, tempActivity.class);
            startActivity(i);

        } else if (id == R.id.ds_nav) {
            Intent i = new Intent(tempActivity.this, dsActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

        }else if (id == R.id.contact) {
            Intent i = new Intent(tempActivity.this, contactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
