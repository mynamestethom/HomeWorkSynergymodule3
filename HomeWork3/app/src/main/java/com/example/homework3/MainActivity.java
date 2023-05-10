package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Bill Gates" , "$86 B" ,R.drawable.united_states ));
        persons.add(new Person("Warren Buffett" , "$75.6 B" , R.drawable.united_states));
        persons.add(new Person("Jeff Bezos" , "$72.8 B" ,R.drawable.united_states ));
        persons.add(new Person("Amancio Ortega" , "$71.3 B" , R.drawable.spain));
        persons.add(new Person("Mark Zuckerberg" , "$56 B" , R.drawable.united_states));
        persons.add(new Person("Carlos Slim Helu" , "$54.5 B" ,R.drawable.mexico ));
        persons.add(new Person("Larry Ellison" , "$52.2 B" , R.drawable.united_states));
        persons.add(new Person("Charles Koch" , "$48.3 B" , R.drawable.united_states));
        persons.add(new Person("David Koch" , "$48.3 B" , R.drawable.united_states));
        persons.add(new Person("Michael Bloomberg" , "$47.5 B" , R.drawable.united_states));//10
        persons.add(new Person("Bernard Arnault" , "$41.5 B" , R.drawable.france));
        persons.add(new Person("Larry Page" , "$40.7 B" , R.drawable.united_states));
        persons.add(new Person("Sergey Brin" , "$39.8 B" , R.drawable.united_states));
        persons.add(new Person("Liliane Bettencourt" , "$39.5 B" , R.drawable.france));
        persons.add(new Person("S. Robson Walton" , "$34.1 B" , R.drawable.united_states));

    }

    public void initializeAdapter(){
        Person_Adapter person_adapter = new Person_Adapter(persons);
        recyclerView.setAdapter(person_adapter);
    }
}