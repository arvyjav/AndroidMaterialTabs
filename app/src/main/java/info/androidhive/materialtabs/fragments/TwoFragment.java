package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.androidhive.materialtabs.R;



public class TwoFragment extends Fragment{

    EditText txta3;
    EditText ang3;
    Button btnhitung;
    TextView tv_hasil;
    float result;
    float angka3;
    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        txta3      = view.findViewById(R.id.angka1);

        btnhitung = view.findViewById(R.id.bagi);
        tv_hasil   = view.findViewById(R.id.hasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka3 = Float.parseFloat(txta3.getText().toString());
                result = angka3*angka3;
                tv_hasil.setText("Hasil: " + result + "");
            }
        });

        return view;
    }
    }


