package com.example.fragmenttrainingactivitypart2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NameFragment extends Fragment {

    private String name;
    public static final String ARG_NAME = "name";
    public NameFragment() {
        // Required empty public constructor

    }

    public static NameFragment getInstance(String name){
        Bundle bundle = new Bundle();
        bundle.putString("name",name);
        NameFragment nameFragment = new NameFragment();
        nameFragment.setArguments(bundle);
        return nameFragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle!=null){
            name = bundle.getString(ARG_NAME);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_name, container, false);
        TextView tv = view.findViewById(R.id.activity_name_tv);
        tv.setText(name);
        return view;
    }

}