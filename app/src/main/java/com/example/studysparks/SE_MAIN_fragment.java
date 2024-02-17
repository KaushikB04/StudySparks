package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SE_MAIN_fragment extends Fragment {
    TextView civil,comp,entc,electrical,it,mech;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_s_e__m_a_i_n_fragment, container, false);
        civil = view.findViewById(R.id.BranchCivil);

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new Civil_Questions_Fragment());
            }
        });
        return view;
    }

    private void loadfragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}