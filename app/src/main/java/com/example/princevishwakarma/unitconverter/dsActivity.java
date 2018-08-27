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

public class dsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    EditText input;
    Spinner spinner;
    TextView resultshow;



    String Byte ="Byte",Kilobyte="Kilobyte",Megabyte ="Megabyte",Gigabyte="Gigabyte",Terabyte ="Terabyte";


    TextView b1,kb1,mb1,gb1,tb1;
    String[] option = { "Select Unit","Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button result= findViewById(R.id.bt);
        final EditText input= findViewById(R.id.input);
        final TextView resultshow= findViewById(R.id.resultshow);
        final Spinner spinner= findViewById(R.id.spinner);
        b1 = findViewById(R.id.b);
        kb1= findViewById(R.id.kb);
        mb1= findViewById(R.id.mb);
       gb1= findViewById(R.id.gb);
        tb1= findViewById(R.id.tb);


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
                    if (option1.equals(Byte)) {
                        resultshow.setText("0");
                        BigDecimal b = new BigDecimal("1");
                        BigDecimal kb = new BigDecimal("0.001");
                        BigDecimal mb = new BigDecimal("0.000001");
                        BigDecimal gb = new BigDecimal("0.000000001");
                        BigDecimal tb = new BigDecimal("0.000000000001");

                        BigDecimal b_result = bd1.multiply(b);
                        BigDecimal kb_result = bd1.multiply(kb);
                        BigDecimal mb_result = bd1.multiply(mb);
                        BigDecimal gb_result = bd1.multiply(gb);
                        BigDecimal tb_result = bd1.multiply(tb);

                        b1.setText(String.valueOf(b_result));
                       kb1.setText(String.valueOf(kb_result));
                        mb1.setText(String.valueOf(mb_result));
                        gb1.setText(String.valueOf(gb_result));
                       tb1.setText(String.valueOf(tb_result));

                        Toast.makeText(getApplicationContext(), "Converted into Byte", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);


                    } else if (option1.equals(Kilobyte)) {
                        resultshow.setText("0");
                        BigDecimal b = new BigDecimal("1000");
                        BigDecimal kb = new BigDecimal("1");
                        BigDecimal mb = new BigDecimal("0.001");
                        BigDecimal gb = new BigDecimal("0.000001");
                        BigDecimal tb = new BigDecimal("0.000000001");

                        BigDecimal b_result = bd1.multiply(b);
                        BigDecimal kb_result = bd1.multiply(kb);
                        BigDecimal mb_result = bd1.multiply(mb);
                        BigDecimal gb_result = bd1.multiply(gb);
                        BigDecimal tb_result = bd1.multiply(tb);

                        b1.setText(String.valueOf(b_result));
                        kb1.setText(String.valueOf(kb_result));
                        mb1.setText(String.valueOf(mb_result));
                        gb1.setText(String.valueOf(gb_result));
                        tb1.setText(String.valueOf(tb_result));

                        Toast.makeText(getApplicationContext(), "Converted into Kilobyte", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }else if (option1.equals(Megabyte)) {
                        resultshow.setText("0");
                        BigDecimal b = new BigDecimal("1000000");
                        BigDecimal kb = new BigDecimal("1000");
                        BigDecimal mb = new BigDecimal("1");
                        BigDecimal gb = new BigDecimal("0.001");
                        BigDecimal tb = new BigDecimal("0.00001");

                        BigDecimal b_result = bd1.multiply(b);
                        BigDecimal kb_result = bd1.multiply(kb);
                        BigDecimal mb_result = bd1.multiply(mb);
                        BigDecimal gb_result = bd1.multiply(gb);
                        BigDecimal tb_result = bd1.multiply(tb);




                        b1.setText(String.valueOf(b_result));
                        kb1.setText(String.valueOf(kb_result));
                        mb1.setText(String.valueOf(mb_result));
                        gb1.setText(String.valueOf(gb_result));
                        tb1.setText(String.valueOf(tb_result));

                        Toast.makeText(getApplicationContext(), "Converted into Megabyte", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Gigabyte)) {
                        resultshow.setText("0");
                        BigDecimal b = new BigDecimal("1000000000");
                        BigDecimal kb = new BigDecimal("1000000");
                        BigDecimal mb = new BigDecimal("1000");
                        BigDecimal gb = new BigDecimal("1");
                        BigDecimal tb = new BigDecimal("0.001");

                        BigDecimal b_result = bd1.multiply(b);
                        BigDecimal kb_result = bd1.multiply(kb);
                        BigDecimal mb_result = bd1.multiply(mb);
                        BigDecimal gb_result = bd1.multiply(gb);
                        BigDecimal tb_result = bd1.multiply(tb);

                        b1.setText(String.valueOf(b_result));
                        kb1.setText(String.valueOf(kb_result));
                        mb1.setText(String.valueOf(mb_result));
                        gb1.setText(String.valueOf(gb_result));
                        tb1.setText(String.valueOf(tb_result));

                        Toast.makeText(getApplicationContext(), "Converted into Gigabyte", Toast.LENGTH_LONG).show();
                        resultshow.setText(""+name);
                    }
                    else if (option1.equals(Terabyte)) {

                        resultshow.setText("0");
                        BigDecimal b = new BigDecimal("1000000000000");
                        BigDecimal kb = new BigDecimal("1000000000");
                        BigDecimal mb = new BigDecimal("1000000");
                        BigDecimal gb = new BigDecimal("1000");
                        BigDecimal tb = new BigDecimal("1");

                        BigDecimal b_result = bd1.multiply(b);
                        BigDecimal kb_result = bd1.multiply(kb);
                        BigDecimal mb_result = bd1.multiply(mb);
                        BigDecimal gb_result = bd1.multiply(gb);
                        BigDecimal tb_result = bd1.multiply(tb);

                        b1.setText(String.valueOf(b_result));
                        kb1.setText(String.valueOf(kb_result));
                        mb1.setText(String.valueOf(mb_result));
                        gb1.setText(String.valueOf(gb_result));
                        tb1.setText(String.valueOf(tb_result));

                        Toast.makeText(getApplicationContext(), "Converted into Terabyte", Toast.LENGTH_LONG).show();
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
            Intent i = new Intent(dsActivity.this, aboutActivity.class);
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
            Intent i = new Intent(dsActivity.this, lengthActivity.class);
            startActivity(i);

        } else if (id == R.id.mass_nav) {
            Intent i = new Intent(dsActivity.this, massActivity.class);
            startActivity(i);

        } else if (id == R.id.time_nav) {
            Intent i = new Intent(dsActivity.this,timeActivity.class);
            startActivity(i);

        } else if (id == R.id.temp_nav) {
            Intent i = new Intent(dsActivity.this, tempActivity.class);
            startActivity(i);

        } else if (id == R.id.ds_nav) {
            Intent i = new Intent(dsActivity.this, dsActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

        }else if (id == R.id.contact) {
            Intent i = new Intent(dsActivity.this, contactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
