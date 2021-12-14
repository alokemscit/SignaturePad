package com.aloke.signpad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aloke.signaturepad.SilkySignaturePad;

public class MainActivity extends AppCompatActivity {
private SilkySignaturePad spad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}