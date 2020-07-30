package info.androidhive.materialtabs.activity;

import android.support.v7.app.AppCompatActivity;


import android.content.Context;

import android.content.Intent;

import android.content.SharedPreferences;

import android.os.Bundle;

import info.androidhive.materialtabs.fragments.OneFragment;

public class ControlClass extends AppCompatActivity {


    private SharedPreferences sharedPreferences;

    @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);

            if (sharedPreferences.getString("userid","").isEmpty()){

                Intent in=new Intent(getApplicationContext(), Login.class);

                startActivity(in);

                finish();

            }else {

                Intent in=new Intent(getApplicationContext(),SimpleTabsActivity.class);

                startActivity(in);

                finish();

            }

        }

}

