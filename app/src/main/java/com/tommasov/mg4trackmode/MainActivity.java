package com.tommasov.mg4trackmode;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String packageName = "com.saic.saicmaintenance";
        String className = "com.saicmotor.hmi.trackmode.MainActivity";

        Intent intent = new Intent();
        intent.setClassName(packageName, className);

        if (isAppInstalled(packageName)) {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(this, "Activity not found", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Package not found", Toast.LENGTH_SHORT).show();
        }

        finish();
    }

    private boolean isAppInstalled(String packageName) {
        try {
            getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
