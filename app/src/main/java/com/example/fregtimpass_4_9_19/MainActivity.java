package com.example.fregtimpass_4_9_19;

import android.app.AlertDialog;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bactivity=findViewById(R.id.activity_button);
        bactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert Message");
                builder.setMessage("Activity button clicked");
                builder.show();
            }
        });

    } @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
        //
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                startActivity(new Intent(Settings.ACTION_SETTINGS));
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);

                alertDialog.setCancelable(true);
                alertDialog.setTitle("hallo");
                alertDialog.setMessage("sssss");
                alertDialog.show();
                alertDialog.setIcon(R.mipmap.ic_launcher);
                break;
            case R.id.approachfrag:
                startActivity(new Intent(Settings.ACTION_BLUETOOTH_SETTINGS));
                break;
            default:
        }

        return super.onOptionsItemSelected(item);

    }
}
