package info.androidhive.materialtabs.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.fragments.OneFragment;


public class ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ss );
        Thread background = new Thread() {

            public void run() {

                try {

                    // Thread will sleep for 5 seconds

                    sleep(3*1000);

                    // After 5 seconds redirect to another intent

                    //Intent i=new Intent(getBaseContext(),Login.class);

                    Intent i=new Intent(getBaseContext(), ControlClass.class);
                    startActivity(i);

                    //Remove activity

                    finish();

                } catch (Exception e) {

                }

            }

        };

        // start thread

        background.start();

    }
}



