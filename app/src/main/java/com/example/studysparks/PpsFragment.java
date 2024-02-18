package com.example.studysparks;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class PpsFragment extends Fragment {

    PDFView pdfv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pps, container, false);

        pdfv = view.findViewById(R.id.PPSFrag);
        pdfv.fromAsset("pps.pdf").load();

        return view;
    }

}