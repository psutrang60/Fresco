package com.example.fresco;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private SimpleDraweeView sdvImage;
    private SimpleDraweeView roundBorderImage;
    private SimpleDraweeView circleImage;
    private SimpleDraweeView fullCustomImage;
    private void findViews() {
        button = (Button) findViewById(R.id.button);
        sdvImage = (SimpleDraweeView) findViewById(R.id.sdv_image);
        roundBorderImage = (SimpleDraweeView) findViewById(R.id.round_border);
        circleImage = (SimpleDraweeView) findViewById(R.id.circle);
        fullCustomImage = (SimpleDraweeView) findViewById(R.id.full_custom_image);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        findViews();
        final Uri imageUri = Uri.parse("https://lh3.googleusercontent.com/-voUmhKJzNHc/VSJaPfSJ2pI/AAAAAAAABKw/-oFVzRZxI40/w140-h105-p/fresh_green_grass_bokeh-wallpaper-1024x768.jpg");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sdvImage.setImageURI(imageUri);
                roundBorderImage.setImageURI(imageUri);
                circleImage.setImageURI(imageUri);
                fullCustomImage.setImageURI(imageUri);
            }
        });
    }
}
