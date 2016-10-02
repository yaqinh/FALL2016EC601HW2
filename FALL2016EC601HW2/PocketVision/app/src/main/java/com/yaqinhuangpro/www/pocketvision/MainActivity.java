package com.yaqinhuangpro.www.pocketvision;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.yaqinhuangpro.www.pocketvision.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Login button */
    public void onButtonTap(View v){
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "log in success",
                Toast.LENGTH_LONG);
        myToast.show();

        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File photo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "picture.jpg");
        startActivity(intent);
    }
}
