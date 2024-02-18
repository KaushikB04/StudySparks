package com.example.studysparks;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;


public class SysteminmechFragment extends Fragment {

    PDFView pdfView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_systeminmech, container, false);
        pdfView = view.findViewById(R.id.SMEFrag);
        pdfView.fromAsset("sme.pdf").load();
        return view;
    }



}