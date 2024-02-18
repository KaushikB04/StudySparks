package com.example.studysparks;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.button.MaterialButton;


public class PlacementFragment extends Fragment {
      EditText amount;
      TextView btn;

      MaterialButton pay;
    String GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
    int GOOGLE_PAY_REQUEST_CODE = 123;

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123 && resultCode == RESULT_OK && data.getData()!= null){
            Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "failure", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_placement, container, false);

        amount = view.findViewById(R.id.amount);
        pay = view.findViewById(R.id.paybtn);
        btn = view.findViewById(R.id.place);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new pdfplaceFragment()).commit();
            }
        });


        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amg = amount.getText().toString();
                if (amg.isEmpty()){
                    Toast.makeText(getContext(), "Please Enter Amount", Toast.LENGTH_SHORT).show();
                }
                {
                    Uri uri =
                            new Uri.Builder()
                                    .scheme("upi")
                                    .authority("pay")
                                    .appendQueryParameter("pa", "kaushikbhanuse1234@okicici")
                                    .appendQueryParameter("pn", "studysparks")
                                    .appendQueryParameter("mc", "BCR2DN4TXWC7HPL2")
                                    .appendQueryParameter("tr", "23677")
                                    .appendQueryParameter("tn", "thanks for Support")
                                    .appendQueryParameter("am", amg)
                                    .appendQueryParameter("cu", "INR")
                                    .appendQueryParameter("url", "your-transaction-url")
                                    .build();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(uri);
                    intent.setPackage(GOOGLE_PAY_PACKAGE_NAME);
                    startActivityForResult(intent, GOOGLE_PAY_REQUEST_CODE);
                }

            }
        });





        return view;
    }
}