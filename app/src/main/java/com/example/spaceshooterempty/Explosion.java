package com.example.spaceshooterempty;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[3];
    int explosionFrame;
    int eX, eY;

    public Explosion(Context context, int eX, int eY){
        explosion[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion1);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion2);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion3);
        explosionFrame = 0;
        this.eX = eX;
        this.eY = eY;
    }

    public Bitmap getExplosion(int explosionFrame) {
        //return explosion[explosionFrame];
        int index = explosionFrame % explosion.length; //shysofts
        return explosion[index];//shysofts
    }
}
