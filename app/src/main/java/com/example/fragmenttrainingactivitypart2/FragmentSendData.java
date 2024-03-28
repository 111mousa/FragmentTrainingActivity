package com.example.fragmenttrainingactivitypart2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentSendData extends Fragment {

    private FragmentOnItemClickListner listener;

    public FragmentSendData() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof FragmentOnItemClickListner)
            listener = (FragmentOnItemClickListner) context;
        else
            throw new ClassCastException("Your Activity Does Not Implements FragmentOnItemClickListner");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_for_send_data, container, false);
        RecyclerView rv = view.findViewById(R.id.fragment_main_rv);
        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Zaid"));
        names.add(new Name("Othman"));
        names.add(new Name("Omar"));
        NameAdapter nameAdapter = new NameAdapter(names, new OnItemClickLitsener() {
            @Override
            public void OnItemClick(Name name) {
                listener.FragmentOnItemClick(name);
            }
        });
        rv.setAdapter(nameAdapter);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    public interface FragmentOnItemClickListner{
        void FragmentOnItemClick(Name name);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}