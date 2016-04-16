package com.example.valerio.lab_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Accedi(View view) {
        TextView u = (TextView) findViewById(R.id.u_inserito);
        TextView p = (TextView) findViewById(R.id.p_inserito);
        EditText un = (EditText) findViewById(R.id.username);
        EditText pw = (EditText) findViewById(R.id.password);
        u.setText(un.getText());
        p.setText(pw.getText());

    }
}
