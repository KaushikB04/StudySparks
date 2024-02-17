package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

public class Civil1Fragment extends Fragment {
    PDFView pdfView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_civil1, container, false);
        pdfView = view.findViewById(R.id.CIVIL11);
        pdfView.fromAsset("civil1.pdf").load();
        return view;
    }
}