package com.example.studysparks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

public class GraphicsFragment extends Fragment {

    PDFView pfv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graphics, container, false);

        pfv = view.findViewById(R.id.Graphics);
        pfv.fromAsset("graphics.pdf").load();
        return view;
    }
}