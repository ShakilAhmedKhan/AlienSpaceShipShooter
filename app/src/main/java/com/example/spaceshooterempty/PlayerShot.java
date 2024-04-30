package com.example.spaceshooterempty;

        import android.content.Context;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;

public class PlayerShot {
    Bitmap player_shot;
    Context context;
    int shx, shy;
    public PlayerShot(Context context, int shx, int shy){
        this.context = context;
        player_shot = BitmapFactory.decodeResource(context.getResources(),R.drawable.player_shot);
        this.shx = shx;
        this.shy = shy;
    }

    public Bitmap getShot(){
        return player_shot;
    }
}
