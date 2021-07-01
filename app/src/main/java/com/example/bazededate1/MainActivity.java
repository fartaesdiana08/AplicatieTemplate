package com.example.bazededate1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    ListView listView;
    final int REQUEST_CODE =100;

    //pt adapter
    List<PersonalMedical> listaPersonal = new ArrayList<PersonalMedical>();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AdaugaPersonalActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

        //punem in listview cu adapter

        if(listaPersonal.size()!=0){
            adapter = new ArrayAdapter<PersonalMedical>(getApplicationContext(), android.R.layout.simple_list_item_1, listaPersonal);
            listView.setAdapter(adapter);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            final PersonalMedical personal = (PersonalMedical) data.getSerializableExtra(AdaugaPersonalActivity.ADD_PERSONAL);

            if (personal != null) {
                listaPersonal.add(personal);
                Toast.makeText(getApplicationContext(), personal.toString(), Toast.LENGTH_LONG).show();
                ArrayAdapter<PersonalMedical> adapter1 = new ArrayAdapter<PersonalMedical>(getApplicationContext(), android.R.layout.simple_list_item_1, listaPersonal);
                listView.setAdapter(adapter1);
            }
        }
    }
}