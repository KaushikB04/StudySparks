package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


public class pdfplaceFragment extends Fragment {

  PDFView btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pdfplace, container, false);

        btn = view.findViewById(R.id.pdfplace);
        btn.fromAsset("placement.pdf").load();
        return view;
    }
}