package com.ali_razavi.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button project_popularMovies = (Button) findViewById(R.id.popularMovies);
        Button project_stockHawk = (Button) findViewById(R.id.stockHawk);
        Button project_buildItbigger = (Button) findViewById(R.id.buildItbigger);
        Button project_makeYourAppMaterial = (Button) findViewById(R.id.makeYourAppMaterial);
        Button project_goUbiquitous = (Button) findViewById(R.id.goUbiquitous);
        Button project_capstone = (Button) findViewById(R.id.capstone);

        project_popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.popularMovies), Toast.LENGTH_SHORT).show();
            }
        });

        project_stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.stockHawk), Toast.LENGTH_SHORT).show();
            }
        });

        project_buildItbigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.buildItBigger), Toast.LENGTH_SHORT).show();
            }
        });

        project_makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.makeYourAppMaterial), Toast.LENGTH_SHORT).show();
            }
        });

        project_goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.goUbiquitous), Toast.LENGTH_SHORT).show();
            }
        });

        project_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.capstone), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
