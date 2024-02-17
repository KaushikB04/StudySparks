package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

public class Math2Fragment extends Fragment {
    PDFView pfv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_math2, container, false);

        pfv = v.findViewById(R.id.M2frag);
        pfv.fromAsset("m2.pdf").load();
        return v;
    }
}