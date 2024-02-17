package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


public class MechanicsFragment extends Fragment {
    PDFView p;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mechanics, container, false);

        p = v.findViewById(R.id.MechanicsFrag);
        p.fromAsset("mech.pdf").load();

        return v;
    }
}