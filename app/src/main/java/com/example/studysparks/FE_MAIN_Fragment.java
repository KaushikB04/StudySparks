package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FE_MAIN_Fragment extends Fragment {

    TextView ele;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f_e__m_a_i_n_, container, false);

        ele = view.findViewById(R.id.eleqp);
        ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new electrical_qp_Fragment()).commit();

            }
        });

        return view;
    }
}