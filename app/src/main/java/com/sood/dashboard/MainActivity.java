package com.sood.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private Button button;

    BottomNavigationView bottomNavigationView;
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAcademies();
            }
        });
    }
    public void openAcademies(){
        Intent intent = new Intent(this, Academies.class);
        startActivity(intent);

<<<<<<< Updated upstream
        //-------------------------------------------------------------
=======
                switch (item.getItemId())
                {
                    case R.id.menuHome:
                        return true;
                    case R.id.menuAbout:
                        startActivity(new Intent(getApplicationContext(), aboutUs.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.menuAccount:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.menuSettings:
                        startActivity(new Intent(getApplicationContext(), Settings.class));
                        overridePendingTransition(0,0);
                        return true;
                }
>>>>>>> Stashed changes

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTournaments();
            }
        });
    }
    public void openTournaments(){
        Intent intent = new Intent(this, Tournaments.class);
        startActivity(intent);

        //-------------------------------------------------------------

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDonate();
            }
        });
    }
    public void openDonate(){
        Intent intent = new Intent(this, Donate.class);
        startActivity(intent);

        //-------------------------------------------------------------

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmpty();
            }
        });
    }
    public void openEmpty(){
        Intent intent = new Intent(this, Empty.class);
        startActivity(intent);
    }
}
