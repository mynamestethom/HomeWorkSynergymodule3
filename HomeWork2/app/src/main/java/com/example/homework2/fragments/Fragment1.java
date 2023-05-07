package com.example.homework2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.homework2.R;

public class Fragment1 extends Fragment {

    Button BuyTicket;
    private EditText Textname;
    private EditText Textdata;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        BuyTicket = view.findViewById(R.id.buyticket);
        Textdata = view.findViewById(R.id.data);
        Textname = view.findViewById(R.id.name);


        BuyTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Textname.getText().toString();
                String data = Textdata.getText().toString();
                Bundle result = new Bundle();
                result.putString("bundleKey", name+" "+data);
                getParentFragmentManager().setFragmentResult("requestKey", result);
            }
        });



        return view;
    }


}