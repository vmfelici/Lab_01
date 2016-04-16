package com.example.valerio.lab_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int durata= Toast.LENGTH_SHORT;

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

        if (un.getText().length() > 0 && pw.getText().length() > 0) {
            p.setText(pw.getText());
            u.setText(un.getText());
        } else {
            Toast.makeText(MainActivity.this,R.string.campi_vuoti, durata).show();
        }
    }

    public void Durata(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_breve:
                if (checked)
                    durata = Toast.LENGTH_SHORT;
                    Log.i("durata avviso ", "corta");
                    break;
            case R.id.radio_lungo:
                if (checked)
                    durata = Toast.LENGTH_LONG;
                    Log.i("durata avviso ", "lunga");
                    break;
        }
    }
}
