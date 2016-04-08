package com.example.enfonseca.calculadorabasica_evandro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView res;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        res= (TextView) findViewById(R.id.resultado);
        rg = (RadioGroup) findViewById(R.id.rbgroup);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);



    }

    public void calcular(View v){

        int selected = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(selected);

        Toast.makeText(MainActivity.this, " ......"+rb.getText().toString(), Toast.LENGTH_SHORT).show();

        double dn1 = Double.parseDouble(n1.getText().toString());
        double dn2 = Double.parseDouble(n2.getText().toString());

        double dres=0;

        if(rb.getText().equals("+")){
            dres =dn1+dn2;
        }

        if(rb.getText().equals("-")){
            dres =dn1-dn2;
        }

        if(rb.getText().equals("x")){
            dres =dn1*dn2;
        }

        if(rb.getText().equals("/")){
            dres =dn1/dn2;
        }



        res.setText(""+dres);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
