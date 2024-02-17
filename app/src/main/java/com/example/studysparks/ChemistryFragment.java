package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

public class ChemistryFragment extends Fragment {

    PDFView pfview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chemistry, container, false);
        pfview = view.findViewById(R.id.Chemistry);
        pfview.fromAsset("chem.pdf").load();
        return view;
    }
}