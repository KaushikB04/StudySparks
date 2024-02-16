package com.example.studysparks;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class SettingsFragment extends Fragment {

    Button loutbtn;
    private FirebaseAuth mAuth;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        loutbtn = view.findViewById(R.id.logoutbtn);
        mAuth = FirebaseAuth.getInstance();

        loutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Logout Successfull!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}