package com.example.studysparks;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class GeminiFragment extends Fragment {

    EditText edt;
    Button btn;
    TextView result;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gemini,container,false);
        edt = view.findViewById(R.id.geminiedt);
        btn = view.findViewById(R.id.findanswerbtn);
        result = view.findViewById(R.id.result);

        btn.setOnClickListener(v -> {
            GeminiPro model = new GeminiPro();
            String query = edt.getText().toString();
            result.setText("");
            edt.setText("");

            model.getResponce(query, new ResposeCallback() {
                @Override
                public void onResponce(String response) {
                    result.setText(response);
                }

                @Override
                public void onError(Throwable throwable) {
                    Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            });
        });
        return view;
    }
}