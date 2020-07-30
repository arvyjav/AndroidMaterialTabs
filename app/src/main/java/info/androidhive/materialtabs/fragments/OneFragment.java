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



public class OneFragment extends Fragment {
    EditText Angka1, Angka2;
    Button tambah, kurang, kali, bagi;
    TextView hasil;
    float result;
    float angka1, angka2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Angka1=view.findViewById(R.id.num1);
        Angka2=view.findViewById(R.id.num2);
        tambah=view.findViewById(R.id.btambah);
        kurang=view.findViewById(R.id.bkurang);
        kali=view.findViewById(R.id.bkali);
        bagi=view.findViewById(R.id.bbagi);
        hasil=view.findViewById(R.id.textView2);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1= Float.parseFloat(Angka1.getText().toString());
                angka2= Float.parseFloat(Angka2.getText().toString());
                result=angka1+angka2;
                hasil.setText("Hasil: " + result + "");
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1= Float.parseFloat(Angka1.getText().toString());
                angka2= Float.parseFloat(Angka2.getText().toString());
                result=angka1-angka2;
                hasil.setText("Hasil: " +result+"");
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1= Float.parseFloat(Angka1.getText().toString());
                angka2= Float.parseFloat(Angka2.getText().toString());
                result= angka1*angka2;
                hasil.setText("Hasil: " +result +"");
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1= Float.parseFloat(Angka1.getText().toString());
                angka2= Float.parseFloat(Angka2.getText().toString());
                result= angka1/angka2;
                hasil.setText("Hasil: " +result+"");
            }
        });
        return view;
    }

}












        // Inflate the layout for this fragment





