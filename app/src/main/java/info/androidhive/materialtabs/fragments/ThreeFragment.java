package info.androidhive.materialtabs.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class ThreeFragment extends Fragment{

    private EditText num1;
    private EditText num2;
    private Button Tambah;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        num1 = view.findViewById(R.id.angka1);
        num2 = view.findViewById(R.id.angka2);
        Tambah = view.findViewById(R.id.tambah);
        hasil = view.findViewById(R.id.hasil);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Plus(num1.getText().toString(),num2.getText().toString());
            }
        });
        return view;
    }

    private void Plus (String num1,String num2){
        if(num1.equals("") && num2.equals("")){
            Toast.makeText(getActivity(),"?????", Toast.LENGTH_SHORT).show();
        }
        else{
            float number1 = Float.parseFloat(num1);
            float number2 = Float.parseFloat(num2);
            float sum = number1 * number2;
            hasil.setText("Answer : " + sum);
        }
    }
}


