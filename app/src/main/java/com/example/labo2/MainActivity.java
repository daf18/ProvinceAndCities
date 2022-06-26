package com.example.labo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner_provinces,spinner_villes;

    ArrayList<String> arrayList_provinces;
    ArrayAdapter<String> arrayAdapter_provinces;

    ArrayList<String> arrayList_qc, arrayList_on, arrayList_ns,
            arrayList_nb,arrayList_mb,arrayList_bc,arrayList_pei,
            arrayList_sk,arrayList_alb,arrayList_tnl;
    ArrayAdapter<String> arrayAdapter_villes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItemsProvincesSpinner();

    }
    public void addItemsProvincesSpinner(){

        spinner_provinces = findViewById(R.id.spinner_provinces);
        spinner_villes = findViewById(R.id.spinner_villes);

        ImageView img= (ImageView) findViewById(R.id.image);

        arrayList_provinces = new ArrayList<>();
        arrayList_provinces.add("Quebec");
        arrayList_provinces.add("Ontario");
        arrayList_provinces.add("Nouvelle-Ecosse");
        arrayList_provinces.add("Nouveau-Brunswick");
        arrayList_provinces.add("Manitoba");
        arrayList_provinces.add("Colombie-Britannique");
        arrayList_provinces.add("Ile-du-Prince-Edouard");
        arrayList_provinces.add("Saskatchewan");
        arrayList_provinces.add("Alberta");
        arrayList_provinces.add("Terre-Neuve-et-Labrador");

        arrayAdapter_provinces = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList_provinces);
        spinner_provinces.setAdapter(arrayAdapter_provinces);


        // child spinner
        arrayList_qc = new ArrayList<>();
        arrayList_qc.add("Montréal");
        arrayList_qc.add("Québec");
        arrayList_qc.add("Laval");
        arrayList_qc.add("Gatineau");
        arrayList_qc.add("Longueuil");

        arrayList_on = new ArrayList<>();
        arrayList_on.add("Toronto");
        arrayList_on.add("Ottawa");
        arrayList_on.add("Mississauga");
        arrayList_on.add("Brampton");
        arrayList_on.add("Hamilton");

        arrayList_ns = new ArrayList<>();
        arrayList_ns.add("Halifax");
        arrayList_ns.add("Cape Breton");
        arrayList_ns.add("Truro");
        arrayList_ns.add("New Glasgow");
        arrayList_ns.add("Glace Bay");

        arrayList_nb = new ArrayList<>();
        arrayList_nb.add("Moncton");
        arrayList_nb.add("Saint John");
        arrayList_nb.add("Fredericton");
        arrayList_nb.add("Dieppe");
        arrayList_nb.add("Riverview");

        arrayList_mb = new ArrayList<>();
        arrayList_mb.add("Winnipeg");
        arrayList_mb.add("Brandon");
        arrayList_mb.add("Steinbach");
        arrayList_mb.add("Thompson");
        arrayList_mb.add("Portage La Prairie");

        // TODO: finish provinces

        spinner_provinces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(parent.getContext(),
                         parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();

                switch (parent.getItemAtPosition(pos).toString()) {
                    case "Quebec":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_qc);
                        img.setImageResource(R.drawable.quebec);
                        break;
                    case "Ontario":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_on);
                        img.setImageResource(R.drawable.ontario);
                        break;
                }
    spinner_villes.setAdapter(arrayAdapter_villes);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Log.d("selected", "onNothingSelected: ");
            }
        });
    }
}