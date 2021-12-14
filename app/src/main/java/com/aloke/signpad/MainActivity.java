package com.aloke.signpad;
import android.app.Activity;
import android.os.Bundle;
import com.aloke.signaturepad.SilkySignaturePad;
public class MainActivity extends Activity {
private SilkySignaturePad spad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}

