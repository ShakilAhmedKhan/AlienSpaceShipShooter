package com.example.spaceshooterempty;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Shot {
    Bitmap shot;
    Context context;
    int shx, shy;
    public Shot(Context context, int shx, int shy){
        this.context = context;
        shot = BitmapFactory.decodeResource(context.getResources(),R.drawable.missiles);
        this.shx = shx;
        this.shy = shy;
    }

    public Bitmap getShot(){
        return shot;
    }
}
