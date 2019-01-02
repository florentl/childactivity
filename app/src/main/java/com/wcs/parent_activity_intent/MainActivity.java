package com.wcs.parent_activity_intent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.elyot.parent_activity_intent.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button mainBtn = findViewById( R.id.mainBtn );
        final Intent i = new Intent(this , MyTabActivity.class  );
        mainBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(i, 1);
            }
        } );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Toast.makeText(getApplicationContext(), data.getStringExtra( "tab_index" ),
                Toast.LENGTH_SHORT).show();
    }
}
