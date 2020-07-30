package info.androidhive.materialtabs.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

import android.content.SharedPreferences;



import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;
import info.androidhive.materialtabs.R;



public class Login extends AppCompatActivity {

    EditText username, password;
    Button masuk;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        pref = getSharedPreferences("login", MODE_PRIVATE);

        username=findViewById(R.id.txtuser);

        password=findViewById(R.id.txtpass);

        masuk=findViewById(R.id.btnmasuk);

        masuk.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if (username.getText().toString().equalsIgnoreCase("boi") ||

                        password.getText().toString().equalsIgnoreCase("shit")){

                    Toast.makeText(Login.this, "Login sukses", Toast.LENGTH_SHORT).show();

                    editor = pref.edit();

                    editor.putString("userid", username.getText().toString());

                    editor.apply();

                    Intent in=new Intent(Login.this, SimpleTabsActivity.class);

                    //bisa melempar nilai

                    in.putExtra("username", username.getText().toString());

                    startActivity(in);

                    finish();

                }

            }

        });



    }
}



