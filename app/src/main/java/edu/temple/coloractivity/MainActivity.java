package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner color = findViewById(R.id.spinner);
        final ColorAdapter adapter = new ColorAdapter(this);
        color.setAdapter(adapter);

        color.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.WHITE);
                findViewById(R.id.layout).setBackgroundColor(adapter.getColor(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                parent.setBackgroundColor(Color.RED);
            }
        });
    }
}
