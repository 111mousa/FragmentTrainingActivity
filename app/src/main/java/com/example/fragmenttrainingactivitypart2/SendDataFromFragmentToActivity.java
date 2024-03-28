package com.example.fragmenttrainingactivitypart2;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fragmenttrainingactivitypart2.databinding.ActivitySendDataFromFragmentToBinding;

public class SendDataFromFragmentToActivity extends AppCompatActivity implements FragmentSendData.FragmentOnItemClickListner{

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data_from_fragment_to);
        tv = findViewById(R.id.activity_name_tv);
    }

    @Override
    public void FragmentOnItemClick(Name name) {
        tv.setText(name.getName());
    }
}