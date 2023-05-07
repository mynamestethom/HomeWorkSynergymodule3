package com.example.homework2.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homework2.R;
import com.example.homework2.Ticket;

import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

public class Fragment2 extends Fragment{

    TextView ticket_number;
    TextView ticket_name;
    TextView ticket_data;
    TextView ticket_price;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_2, container, false);
        ticket_number = view.findViewById(R.id.numberticket);
        ticket_name = view.findViewById(R.id.ticket_name);
        ticket_data = view.findViewById(R.id.ticket_data);
        ticket_price = view.findViewById(R.id.priceTicket);

        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String key, @NonNull Bundle bundle) {
                String result = bundle.getString("bundleKey");
                String arrval [] = result.split(" ");
                if(arrval.length != 0){
                    if(arrval[0].length() > 3 && arrval[1].length() != 0){
                        ticket_name.setText("Name: "+arrval[0].toLowerCase());
                        ticket_data.setText("Data: "+arrval[1]);
                        ticket_price.setText("670P");
                        ticket_number.setText(String.valueOf(Randomnumber())+"id/ticket");
                    }else{
                        Toast.makeText(getContext() , "Слишком короткое имя" , Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(getContext() , "Введите данные полностью" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    public int Randomnumber(){
        int min = 100;
        int max = 100000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return  i;
    }


}