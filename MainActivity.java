package com.example.drawmyas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        draw ();
        setContentView(R.layout.activity_main);
    }
    public void draw(){

        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size and an appropriate format
        blankBitmap = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize our previously declared member object of type ImageView
        ourView = new ImageView(this);
        // Put our blank bitmap on ourView
        ourView.setImageBitmap(blankBitmap);

        // We now have a surface ready to draw on
        // But we need something to draw with

        // Declare an object of type Paint
        Paint paint;
        // Initialize it ready for painting our canvas
        paint = new Paint();

        // Make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Make the brush blue
        paint.setColor(Color.argb(255,  26, 128, 182));
        // We can change this around as well

        // Declare an object of type Bitmap
        Bitmap bitmappentol;
        // Initialize it using the bob.png file
        bitmappentol = BitmapFactory.decodeResource(this.getResources(), R.drawable.pentol);
        // Now draw bob to our canvas
        canvas.drawBitmap(bitmappentol,360 , 640, paint);

        //Make Title
        paint.setColor(Color.argb(255,255,0,0));
        paint.setTextSize(28);
        canvas.drawText("Gambar pentol",120,40,paint);

        // Draw a line
        canvas.drawLine(300,300,300,700,paint);
        canvas.drawLine(600,600,600,700,paint);

        // Draw a circle
        canvas.drawCircle(350,250,75,paint);

        // Change the brush color
        paint.setColor(Color.argb(255,  249, 129, 0));

        // Draw a rectangle
        canvas.drawRect(360,750,0,800,paint);

        // Back to onCreate method to set our canvas as the view

    }
}
