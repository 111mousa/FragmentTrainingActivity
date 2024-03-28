package com.example.fragmenttrainingactivitypart2;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fragmenttrainingactivitypart2.databinding.ActivitySendDataFromFragmentToFragmentBinding;

public class SendDataFromFragmentToFragment extends AppCompatActivity implements FragmentSendData.FragmentOnItemClickListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data_from_fragment_to_fragment);


    }

    @Override
    public void FragmentOnItemClick(Name name) {
        FragmentSendData2 secondFragment = FragmentSendData2.getInstance(name);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.second_send_data_fragment,secondFragment);
        fragmentTransaction.commit();
    }
}