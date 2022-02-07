package com.example.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            return  true;
        }
        else if (id == R.id.socialMediaApps){
            Intent intent = new Intent(MainActivity.this, SocialMediaApps.class);
            startActivity(intent);
            return  true;
        }
        else if (id == R.id.bookList) {
            Intent intent = new Intent(MainActivity.this, BookList.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.countryList) {
            Intent intent = new Intent(MainActivity.this, CountryList.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}