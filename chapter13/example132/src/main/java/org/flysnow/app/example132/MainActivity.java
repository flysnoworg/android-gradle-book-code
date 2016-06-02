package org.flysnow.app.example132;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld helloWorld = new HelloWorld();

        ((TextView)findViewById(android.R.id.text1)).setText(helloWorld.getHelloWorld());
    }

}
