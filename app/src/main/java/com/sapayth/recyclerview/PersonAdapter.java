package com.sapayth.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    private List<Person> personList;
    private Context context;

    public PersonAdapter(List<Person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.person_list_item, parent, false);

        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person currentPerson = personList.get(position);

        holder.personIV.setImageResource(currentPerson.getImageResourceId());
        holder.personNameTV.setText(currentPerson.getName());
        holder.personAgeTV.setText(currentPerson.getAge() + "");
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        private ImageView personIV;
        private TextView personNameTV;
        private TextView personAgeTV;

        public PersonViewHolder(View itemView) {
            super(itemView);

            personIV = itemView.findViewById(R.id.personImageView);
            personNameTV = itemView.findViewById(R.id.personNameTextView);
            personAgeTV = itemView.findViewById(R.id.personAgeTextView);
        }
    }
}
