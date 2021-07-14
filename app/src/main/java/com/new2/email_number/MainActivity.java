package com.new2.email_number;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText email, phonenumber;
    RecyclerView recyclerView;
    Button Enter;
    private ArrayList<contacdat> contactsList = new ArrayList<>();
    Contact adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        phonenumber = findViewById(R.id.number);
        recyclerView = findViewById(R.id.recyclerview);
        Enter = findViewById(R.id.Enter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new Contact(contactsList);
        recyclerView.setAdapter(adapter);
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s_email = email.getText().toString();
                String s_number = phonenumber.getText().toString();


                    try {

                        contactsList.add(new contacdat(s_email,s_number));

                        email.setText("");
                    phonenumber.setText("");
                        adapter.notifyItemChanged(contactsList.size());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }





            }
        });


    }
}