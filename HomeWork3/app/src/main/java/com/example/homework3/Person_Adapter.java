package com.example.homework3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Person_Adapter extends RecyclerView.Adapter<Person_Adapter.PersonViewHolder> {

    private LayoutInflater layoutInflater;
    List<Person> persons;

    Person_Adapter(List<Person> persons){
        this.persons = persons;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_forbes , parent , false);
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.name.setText(persons.get(position).name);
        holder.money.setText(persons.get(position).money);
        holder.flag.setImageResource(persons.get(position).flag);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder{
        ImageView flag;
        TextView name;
        TextView money;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            name = itemView.findViewById(R.id.name);
            money = itemView.findViewById(R.id.money);
        }
    }
}
