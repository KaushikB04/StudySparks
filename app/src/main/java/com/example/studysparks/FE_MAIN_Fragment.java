package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FE_MAIN_Fragment extends Fragment {

    TextView ele,elx,chem,graphics,m1,m2,mechanics,phy,pps,sme;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f_e__m_a_i_n_, container, false);

        ele = view.findViewById(R.id.eleqp);
        elx = view.findViewById(R.id.elxqp);
        chem = view.findViewById(R.id.chemqp);
        graphics = view.findViewById(R.id.graphqp);
        m1 = view.findViewById(R.id.m1);
        m2= view.findViewById(R.id.m2);
        mechanics = view.findViewById(R.id.mechanics);
        phy = view.findViewById(R.id.phyqp);
        pps = view.findViewById(R.id.ppsqp);
        sme = view.findViewById(R.id.smeqp);

        ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new electrical_qp_Fragment());

            }
        });

        elx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new Electronics_Fragment());
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new ChemistryFragment());
            }
        });

        graphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new GraphicsFragment());
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new Emath1Fragment());
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new Math2Fragment());
            }
        });

        mechanics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new MechanicsFragment());
            }
        });

        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new PhysicsFragment());
            }
        });

        pps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new PpsFragment());
            }
        });

        sme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadactivity(new SysteminmechFragment());
            }
        });

        return view;
    }

    private void loadactivity(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}