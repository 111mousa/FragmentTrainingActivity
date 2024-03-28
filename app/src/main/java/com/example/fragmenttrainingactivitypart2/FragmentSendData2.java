package com.example.fragmenttrainingactivitypart2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FragmentSendData2 extends Fragment {

    private String name;
    public static final String ARG_NAME="name";

    public FragmentSendData2() {
        // Required empty public constructor
    }

    public static FragmentSendData2 getInstance(Name name){
        FragmentSendData2 fragment = new FragmentSendData2();
        Bundle bundle = new Bundle();
        bundle.putString("name",name.getName());
        fragment.setArguments(bundle);
        return fragment;
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
        View view = inflater.inflate(R.layout.fragment_send_data2, container, false);
        TextView tv = view.findViewById(R.id.fragment_tv_name_2);
        tv.setText(name);
        return view;
    }
}