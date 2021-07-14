package com.new2.email_number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Contact extends RecyclerView.Adapter<Contact.Holder> {
  /*  List<String> itemlist;
    List<String> itemlist2;*/
  private ArrayList<contacdat> contactsList;
    public Contact(ArrayList<contacdat> contactsList ) {
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        Holder holder = new Holder(view);


        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        final contacdat contact = contactsList.get(position);
        holder.email.setText(contact.getName());
        holder.number.setText(contact.getNumber());
    }


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView email, number;

        public Holder(@NonNull View itemView) {
            super(itemView);
            email = itemView.findViewById(R.id.email_tx);
            number = itemView.findViewById(R.id.number_tx);
        }

    }
}
