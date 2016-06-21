package com.example.android.major_market_locator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SelectStateActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView placeTextView;
    String[] items = new String[]{"Select Place", "Abuja",  "Anambra", "Delta", "Kano", "Lagos"};
    String Place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_state);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        placeTextView = (TextView)findViewById(R.id.text_view_Place);
        dropdown.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        placeTextView.setText(items[position]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        placeTextView.setText("");

    }



    public void locate_market (View view){



        if(placeTextView.getText().toString()== ("Select Place") || placeTextView.getText().toString()== ("")){

            Toast.makeText(this, "You must select a place", Toast.LENGTH_SHORT).show();
        }

        else if (placeTextView.getText().toString()== ("Abuja")){

            Uri gmmIntentUri = Uri.parse("geo:0 ,0?q=major+markets+in+Abuja");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
            else{
                Toast.makeText(this, "Install google map", Toast.LENGTH_SHORT).show();
            }

        }
        else if (placeTextView.getText().toString()== ("Anambra")) {

            Uri gmmIntentUri = Uri.parse("geo:0 ,0?q=major+markets+in+Anambra");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            } else {
                Toast.makeText(this, "Install google map", Toast.LENGTH_SHORT).show();
            }
        }
        else if (placeTextView.getText().toString()== ("Delta")) {

            Uri gmmIntentUri = Uri.parse("geo:0 ,0?q=major+markets+in+Delta");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            } else {
                Toast.makeText(this, "Install google map", Toast.LENGTH_SHORT).show();
            }
        }
        else if (placeTextView.getText().toString()== ("Kano")) {

            Uri gmmIntentUri = Uri.parse("geo:0 ,0?q=major+markets+in+Kano");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            } else {
                Toast.makeText(this, "Install google map", Toast.LENGTH_SHORT).show();
            }
        }
        else if (placeTextView.getText().toString()== ("Lagos")) {

            Uri gmmIntentUri = Uri.parse("geo:0 ,0?q=major+markets+in+Lagos");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            } else {
                Toast.makeText(this, "Install google map", Toast.LENGTH_SHORT).show();
            }
        }







    }




}
