package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView idBottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_layout);
        idBottomNavView = findViewById(R.id.idBottomNavView);

        idBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.mNavFav:
                    Toast.makeText(getApplicationContext(),
                            "cliquei no favorite",
                            Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),
                            MainActivity.class));
                    break;

                    case R.id.mNavMusic:
                    Toast.makeText(getApplicationContext(),
                            "cliquei no music",
                            Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.mNavPlace:
                    Toast.makeText(getApplicationContext(),
                            "cliquei no place",
                            Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.mNavNews:
                    Toast.makeText(getApplicationContext(),
                            "cliquei no newspaper",
                            Toast.LENGTH_SHORT).show();
                    break;
                }
                return false;
            }
        });
    }
}