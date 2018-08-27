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

public class massActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    EditText input;
    Spinner spinner;
    TextView resultshow;



    String Milligram ="Milligram",Gram="Gram",Kilogram ="Kilogram",Pound="Pound",Ton ="Ton";


    TextView mg1,g1,kg1,lb1,t1;
    String[] option = { "Select Unit","Milligram", "Gram", "Kilogram", "Pound", "Ton" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button result= findViewById(R.id.bt);
        final EditText input= findViewById(R.id.input);
        final TextView resultshow= findViewById(R.id.resultshow);
        final Spinner spinner= findViewById(R.id.spinner);
        mg1 = findViewById(R.id.mg);
        g1= findViewById(R.id.g);
        kg1= findViewById(R.id.kg);
        lb1= findViewById(R.id.lb);
        t1= findViewById(R.id.t);


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

                    if (option1.equals(Milligram)) {

                        resultshow.setText("0");
                        BigDecimal mili = new BigDecimal("1");
                        BigDecimal gram = new BigDecimal("0.001");
                        BigDecimal kg = new BigDecimal("0.000001");
                        BigDecimal pou = new BigDecimal("0.000002204622622");
                        BigDecimal ton = new BigDecimal("0.000000001");

                        BigDecimal mili_result = bd1.multiply(mili);
                        BigDecimal gram_result = bd1.multiply(gram);
                        BigDecimal kilo_result = bd1.multiply(kg);
                        BigDecimal  pou_result = bd1.multiply(pou);
                        BigDecimal ton_result = bd1.multiply(ton);

                        mg1.setText(String.valueOf(mili_result));
                        g1.setText(String.valueOf(gram_result));
                        kg1.setText(String.valueOf(kilo_result));
                        lb1.setText(String.valueOf(pou_result));
                        t1.setText(String.valueOf(ton_result));

                        Toast.makeText(getApplicationContext(), "Converted into Milligram", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);


                    } else if (option1.equals(Gram)) {

                        resultshow.setText("0");
                        BigDecimal mili = new BigDecimal("1000");
                        BigDecimal gram = new BigDecimal("1");
                        BigDecimal kg = new BigDecimal("0.001");
                        BigDecimal pou = new BigDecimal("0.00220462");
                        BigDecimal ton = new BigDecimal("0.000001");


                        BigDecimal mili_result = bd1.multiply(mili);
                        BigDecimal gram_result = bd1.multiply(gram);
                        BigDecimal kilo_result = bd1.multiply(kg);
                        BigDecimal  pou_result = bd1.multiply(pou);
                        BigDecimal ton_result = bd1.multiply(ton);

                        mg1.setText(String.valueOf(mili_result));
                        g1.setText(String.valueOf(gram_result));
                        kg1.setText(String.valueOf(kilo_result));
                        lb1.setText(String.valueOf(pou_result));
                        t1.setText(String.valueOf(ton_result));

                        Toast.makeText(getApplicationContext(), "Converted into Gram ", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }else if (option1.equals(Kilogram)) {
                        resultshow.setText("0");
                        BigDecimal mili = new BigDecimal("1000000");
                        BigDecimal gram = new BigDecimal("100");
                        BigDecimal kg = new BigDecimal("1");
                        BigDecimal pou = new BigDecimal("2.205");
                        BigDecimal ton = new BigDecimal("0.00110231");

                        BigDecimal mili_result = bd1.multiply(mili);
                        BigDecimal gram_result = bd1.multiply(gram);
                        BigDecimal kilo_result = bd1.multiply(kg);
                        BigDecimal  pou_result = bd1.multiply(pou);
                        BigDecimal ton_result = bd1.multiply(ton);

                        mg1.setText(String.valueOf(mili_result));
                        g1.setText(String.valueOf(gram_result));
                        kg1.setText(String.valueOf(kilo_result));
                        lb1.setText(String.valueOf(pou_result));
                        t1.setText(String.valueOf(ton_result));

                        Toast.makeText(getApplicationContext(), "Converted into Kilogram", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Pound)) {
                        resultshow.setText("0");
                        BigDecimal mili = new BigDecimal("453592.37");
                        BigDecimal gram = new BigDecimal("453.592");
                        BigDecimal kg = new BigDecimal("0.453592");
                        BigDecimal pou = new BigDecimal("1");
                        BigDecimal ton = new BigDecimal("0.0005");

                        BigDecimal mili_result = bd1.multiply(mili);
                        BigDecimal gram_result = bd1.multiply(gram);
                        BigDecimal kilo_result = bd1.multiply(kg);
                        BigDecimal  pou_result = bd1.multiply(pou);
                        BigDecimal ton_result = bd1.multiply(ton);

                        mg1.setText(String.valueOf(mili_result));
                        g1.setText(String.valueOf(gram_result));
                        kg1.setText(String.valueOf(kilo_result));
                        lb1.setText(String.valueOf(pou_result));
                        t1.setText(String.valueOf(ton_result));

                        Toast.makeText(getApplicationContext(), "Converted into Pound", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Ton)) {
                        resultshow.setText("0");
                        BigDecimal mili = new BigDecimal("907184740");
                        BigDecimal gram = new BigDecimal("907185");
                        BigDecimal kg = new BigDecimal("907.185");
                        BigDecimal pou = new BigDecimal("2000");
                        BigDecimal ton = new BigDecimal("1");

                        BigDecimal mili_result = bd1.multiply(mili);
                        BigDecimal gram_result = bd1.multiply(gram);
                        BigDecimal kilo_result = bd1.multiply(kg);
                        BigDecimal  pou_result = bd1.multiply(pou);
                        BigDecimal ton_result = bd1.multiply(ton);

                        mg1.setText(String.valueOf(mili_result));
                        g1.setText(String.valueOf(gram_result));
                        kg1.setText(String.valueOf(kilo_result));
                        lb1.setText(String.valueOf(pou_result));
                        t1.setText(String.valueOf(ton_result));

                        Toast.makeText(getApplicationContext(), "Converted into Ton", Toast.LENGTH_LONG).show();
                        resultshow.setText(" "+name);
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
            Intent i = new Intent(massActivity.this, aboutActivity.class);
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
            Intent i = new Intent(massActivity.this, lengthActivity.class);
            startActivity(i);

        } else if (id == R.id.mass_nav) {
            Intent i = new Intent(massActivity.this, massActivity.class);
            startActivity(i);

        } else if (id == R.id.time_nav) {
            Intent i = new Intent(massActivity.this,timeActivity.class);
            startActivity(i);

        } else if (id == R.id.temp_nav) {
            Intent i = new Intent(massActivity.this, tempActivity.class);
            startActivity(i);

        } else if (id == R.id.ds_nav) {
            Intent i = new Intent(massActivity.this, dsActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

        }else if (id == R.id.contact) {
            Intent i = new Intent(massActivity.this, contactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
