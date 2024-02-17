package com.example.studysparks;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class electrical_qp_Fragment extends Fragment {
    PDFView ele;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_electrical_qp_, container, false);

        ele = view.findViewById(R.id.elcpdf);
        ele.fromAsset("basicelericaal.pdf").load();





        return view;
    }
}