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

public class lengthActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    EditText input;
   Spinner spinner;
   TextView resultshow;



    String Inch ="Inch",Foot="Foot",Yard ="Yard",Centimeter="Centimeter",Meter ="Meter",Kilometer="Kilometer",Mile="Mile";


    TextView inch1,foot1,yard1,cm1,m1,km1,mi1;
    String[] option = { "Select Unit","Inch", "Foot", "Yard", "Centimeter", "Meter","Kilometer","Mile" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button result= findViewById(R.id.bt);
        final EditText input= findViewById(R.id.input);
        final TextView resultshow= findViewById(R.id.resultshow);
        final Spinner spinner= findViewById(R.id.spinner);
        inch1 = findViewById(R.id.inch);
        foot1= findViewById(R.id.foot);
        yard1= findViewById(R.id.yard);
        cm1= findViewById(R.id.cm);
        m1= findViewById(R.id.m);
        km1= findViewById(R.id.km);
        mi1= findViewById(R.id.mi);

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
                    resultshow.setText("0");
                    BigDecimal bd1 = new BigDecimal(name);
                    if (option1.equals(Inch)) {
                        resultshow.setText("0");
                        BigDecimal inch = new BigDecimal("1");
                        BigDecimal foot = new BigDecimal("0.0833333");
                        BigDecimal yard = new BigDecimal("0.02777778");
                        BigDecimal cm = new BigDecimal("2.54");
                        BigDecimal m = new BigDecimal("0.0254");
                        BigDecimal km = new BigDecimal("0.0000254");
                        BigDecimal mi = new BigDecimal("0.0000157828");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);

                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result) );
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), "Converted into Inch", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);

                    } else if (option1.equals(Foot)) {
                        resultshow.setText("0");
                        BigDecimal inch = new BigDecimal("12");
                        BigDecimal foot = new BigDecimal("1");
                        BigDecimal yard = new BigDecimal("0.33333");
                        BigDecimal cm = new BigDecimal("30.48");
                        BigDecimal m = new BigDecimal("0.3048");
                        BigDecimal km = new BigDecimal("0.0003048");
                        BigDecimal mi = new BigDecimal("0.0001893939");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);

                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result) );
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), "Converted into Foot", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }else if (option1.equals(Yard)) {
                        resultshow.setText("0 ");
                        BigDecimal inch = new BigDecimal("36");
                        BigDecimal foot = new BigDecimal("3");
                        BigDecimal yard = new BigDecimal("1");
                        BigDecimal cm = new BigDecimal("91.44");
                        BigDecimal m = new BigDecimal("0.9144");
                        BigDecimal km = new BigDecimal("0.0009144");
                        BigDecimal mi = new BigDecimal("0.0005681818");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);

                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result) );
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), "Converted into Yard", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Centimeter)) {
                        resultshow.setText("0");

                        BigDecimal inch = new BigDecimal("0.393701");
                        BigDecimal foot = new BigDecimal("0.0328084");
                        BigDecimal yard = new BigDecimal("0.0109361");
                        BigDecimal cm = new BigDecimal("1");
                        BigDecimal m = new BigDecimal("0.01");
                        BigDecimal km = new BigDecimal("0.00001");
                        BigDecimal mi = new BigDecimal("0.0000062137");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);

                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result) );
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), " Converted into Centimeter", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Meter)) {

                        resultshow.setText("0");
                        BigDecimal inch = new BigDecimal("39.3701");
                        BigDecimal foot = new BigDecimal("3.28084");
                        BigDecimal yard = new BigDecimal("1.09361");
                        BigDecimal cm = new BigDecimal("100");
                        BigDecimal m = new BigDecimal("1");
                        BigDecimal km = new BigDecimal("0.001");
                        BigDecimal mi = new BigDecimal("0.000621371");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);



                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result) );
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), "Converted into Meter", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    } else if (option1.equals(Kilometer)) {
                        resultshow.setText("0");
                        BigDecimal inch = new BigDecimal("39370.1");
                        BigDecimal foot = new BigDecimal("3280.84");
                        BigDecimal yard = new BigDecimal("1093.61");
                        BigDecimal cm = new BigDecimal("100000");
                        BigDecimal m = new BigDecimal("1000");
                        BigDecimal km = new BigDecimal("1");
                        BigDecimal mi = new BigDecimal("0.621371");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);

                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result));
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), "Converted into Kilometer", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Mile)) {
                        resultshow.setText("0");
                        BigDecimal inch = new BigDecimal("63360");
                        BigDecimal foot = new BigDecimal("5280");
                        BigDecimal yard = new BigDecimal("1760");
                        BigDecimal cm = new BigDecimal("160934");
                        BigDecimal m = new BigDecimal("1609");
                        BigDecimal km = new BigDecimal("1.60934");
                        BigDecimal mi = new BigDecimal("1");

                        BigDecimal inch_result = bd1.multiply(inch);
                        BigDecimal foot_result = bd1.multiply(foot);
                        BigDecimal yard_result = bd1.multiply(yard);
                        BigDecimal  cm_result = bd1.multiply(cm);
                        BigDecimal m_result = bd1.multiply(m);
                        BigDecimal km_result = bd1.multiply(km);
                        BigDecimal mi_result = bd1.multiply(mi);

                        inch1.setText(String.valueOf(inch_result));
                        foot1.setText(String.valueOf(foot_result) );
                        yard1.setText(String.valueOf(yard_result));
                        cm1.setText(String.valueOf(cm_result));
                        m1.setText(String.valueOf(m_result));
                        km1.setText(String.valueOf(km_result));
                        mi1.setText(String.valueOf( mi_result));
                        Toast.makeText(getApplicationContext(), "Converted into Mile", Toast.LENGTH_LONG).show();
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
            Intent i = new Intent(lengthActivity.this,aboutActivity.class);
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
            Intent i = new Intent(lengthActivity.this, lengthActivity.class);
            startActivity(i);

        } else if (id == R.id.mass_nav) {
            Intent i = new Intent(lengthActivity.this, massActivity.class);
            startActivity(i);

        } else if (id == R.id.time_nav) {
            Intent i = new Intent(lengthActivity.this,timeActivity.class);
            startActivity(i);

        } else if (id == R.id.temp_nav) {
            Intent i = new Intent(lengthActivity.this, tempActivity.class);
            startActivity(i);

        } else if (id == R.id.ds_nav) {
            Intent i = new Intent(lengthActivity.this, dsActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

        }else if (id == R.id.contact) {
            Intent i = new Intent(lengthActivity.this, contactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
