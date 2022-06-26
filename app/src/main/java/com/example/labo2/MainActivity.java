package com.example.labo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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

        arrayList_provinces = new ArrayList<>();
        arrayList_provinces.add("Québec");
        arrayList_provinces.add("Ontario");
        arrayList_provinces.add("Nouvelle-Écosse");
        arrayList_provinces.add("Nouveau-Brunswick");
        arrayList_provinces.add("Manitoba");
        arrayList_provinces.add("Colombie-Britannique");
        arrayList_provinces.add("Île-du-Prince-Édouard");
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

    }
}