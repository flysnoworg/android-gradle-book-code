package org.flysnow.app.example93;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] sharedLibraryNames = getPackageManager().getSystemSharedLibraryNames();
        StringBuilder resultBuild = new StringBuilder();
        for(String name:sharedLibraryNames){
            resultBuild.append(name);
            resultBuild.append("\n");
        }
        ((TextView)findViewById(android.R.id.text1)).setText(resultBuild);
        HttpClient  httpClient = new DefaultHttpClient();
    }

}
