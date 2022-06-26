package com.example.labo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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
        addItemsSpinners();

    }
    public void addItemsSpinners(){

        spinner_provinces = findViewById(R.id.spinner_provinces);
        spinner_villes = findViewById(R.id.spinner_villes);

        ImageView img= (ImageView) findViewById(R.id.image);

        arrayList_provinces = new ArrayList<>();
        arrayList_provinces.add("Québec");
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

        arrayList_bc = new ArrayList<>();
        arrayList_bc.add("Vancouver");
        arrayList_bc.add("Surrey");
        arrayList_bc.add("Burnaby");
        arrayList_bc.add("Richmond");
        arrayList_bc.add("Abbotsford");

        arrayList_pei = new ArrayList<>();
        arrayList_pei.add("Charlottetown");
        arrayList_pei.add("Summerside");
        arrayList_pei.add("Stratford");
        arrayList_pei.add("Cornwall");
        arrayList_pei.add("Three Rivers");

        arrayList_sk = new ArrayList<>();
        arrayList_sk.add("Saskatoon");
        arrayList_sk.add("Regina");
        arrayList_sk.add("Prince Albert");
        arrayList_sk.add("Moose Jaw");
        arrayList_sk.add("Swift Current");

        arrayList_alb = new ArrayList<>();
        arrayList_alb.add("Calgary");
        arrayList_alb.add("Edmonton");
        arrayList_alb.add("Red Deer");
        arrayList_alb.add("Lethbridge");
        arrayList_alb.add("St. Albert");

        arrayList_tnl = new ArrayList<>();
        arrayList_tnl.add("St. John’s");
        arrayList_tnl.add("Conception Bay South");
        arrayList_tnl.add("Mount Pearl");
        arrayList_tnl.add("Paradise");
        arrayList_tnl.add("Corner Brook");

        spinner_provinces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                switch (parent.getItemAtPosition(pos).toString()) {
                    case "Québec":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_qc);
                        img.setImageResource(R.drawable.quebec);
                        break;
                    case "Ontario":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_on);
                        img.setImageResource(R.drawable.ontario);
                        break;
                    case "Nouvelle-Ecosse":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_ns);
                        img.setImageResource(R.drawable.ns);
                        break;
                    case "Nouveau-Brunswick":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_nb);
                        img.setImageResource(R.drawable.nb);
                        break;
                    case "Manitoba":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_mb);
                        img.setImageResource(R.drawable.mb);
                        break;
                    case "Colombie-Britannique":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_bc);
                        img.setImageResource(R.drawable.bc);
                        break;
                    case "Ile-du-Prince-Edouard":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_pei);
                        img.setImageResource(R.drawable.pei);
                        break;
                    case "Saskatchewan":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_sk);
                        img.setImageResource(R.drawable.sk);
                        break;
                    case "Alberta":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_alb);
                        img.setImageResource(R.drawable.alb);
                        break;
                    case "Terre-Neuve-et-Labrador":
                        arrayAdapter_villes = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_tnl);
                        img.setImageResource(R.drawable.tnl);
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