package com.example.fragmenttrainingactivitypart2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.fragment_main_rv);
        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Zaid"));
        names.add(new Name("Othman"));
        names.add(new Name("Omar"));
        NameAdapter nameAdapter = new NameAdapter(names, new OnItemClickLitsener() {
            @Override
            public void OnItemClick(Name name) {
                NameFragment fragment = NameFragment.getInstance(name.getName());
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_fragment,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        rv.setAdapter(nameAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}