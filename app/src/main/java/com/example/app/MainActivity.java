package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // No additional setup required here since onClick attributes in XML handle click events
    }

    // Method to handle Email Lookup click
    public void openEmailLookup(View view) {
        Intent intent = new Intent(this, Lookup.class);
        startActivity(intent);
    }

    // Method to handle Leak Search click
    public void openLeakSearch(View view) {
        Intent intent = new Intent(this, LeakSearch.class);
        startActivity(intent);
    }

    // Method to handle IP Investigation click
    public void openIPInvestigation(View view) {
        Intent intent = new Intent(this, IpInvestigation.class);
        startActivity(intent);
    }

    // Method to handle Nodal Officers click
    public void openNodalOfficers(View view) {
        Intent intent = new Intent(this, NodalOfficers.class);
        startActivity(intent);
    }
}
