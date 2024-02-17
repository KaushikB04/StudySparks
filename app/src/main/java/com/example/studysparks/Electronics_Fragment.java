package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


public class Electronics_Fragment extends Fragment {

    PDFView ele;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_electronics_, container, false);
        ele = view.findViewById(R.id.Electronics);
        ele.fromAsset("basic electronics.pdf").load();
        return view;
    }
}