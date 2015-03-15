package com.example.marie.takephotoes_makestories;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Story extends ActionBarActivity {
private static final int CAM_REQUEST1=1313;
    private static final int CAM_REQUEST2=1314;
    private static final int CAM_REQUEST3=1315;


    ImageView Iview2,Iview1,Iview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);



        Iview1 = (ImageView) findViewById(R.id.imageView1);

        Iview1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // request your webservice here. Possible use of AsyncTask and ProgressDialog
                // show the result here - dialog or Toast
               Intent CameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               startActivityForResult(CameraIntent, CAM_REQUEST1);
            }

        });


        Iview2 = (ImageView) findViewById(R.id.imageView2);

        Iview2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // request your webservice here. Possible use of AsyncTask and ProgressDialog
                // show the result here - dialog or Toast
                Intent CameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(CameraIntent, CAM_REQUEST2);
                        }

        });


        Iview3 = (ImageView) findViewById(R.id.imageView3);

        Iview3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // request your webservice here. Possible use of AsyncTask and ProgressDialog
                // show the result here - dialog or Toast
                Intent CameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(CameraIntent, CAM_REQUEST3);
            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_story, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
if(requestCode ==CAM_REQUEST1){

    Bitmap thnail = (Bitmap) data.getExtras().get("data");

   Iview1.setImageBitmap(thnail);

}
        if(requestCode ==CAM_REQUEST2){

            Bitmap thnail = (Bitmap) data.getExtras().get("data");

            Iview2.setImageBitmap(thnail);

        }

        if(requestCode ==CAM_REQUEST3){

            Bitmap thnail = (Bitmap) data.getExtras().get("data");

            Iview3.setImageBitmap(thnail);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
