package com.wfy.frescodemo;

import android.app.Activity;;
import android.os.Bundle;

public class MainActivity extends Activity {

//    private SimpleDraweeView draweeView;
//    private String URL = "http://10.0.2.2:8080/zhbj/10002/1452327318UU91.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void material() {
       /* SnackBar snackBar = new SnackBar(this, "SnackBar", "SnackBarButton", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SnackBar", Toast.LENGTH_SHORT).show();
            }
        });
        snackBar.show();

        ColorSelector colorSelector = new ColorSelector(this, Color.BLACK, new ColorSelector.OnColorSelectedListener() {
            @Override
            public void onColorSelected(int color) {
                Toast.makeText(MainActivity.this, color + "", Toast.LENGTH_SHORT).show();
            }
        });
        colorSelector.show();*/
    }

    private void fresco() {
        /*Uri uri = Uri.parse(URL);
        draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);*/
    }
}
