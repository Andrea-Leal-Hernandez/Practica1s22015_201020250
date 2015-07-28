/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Andrea
 */
public class Hongos {
    
    int x;
    int y;
    int width;
    int height;
    boolean bo;
    Image im;
    
    
    
    public void Sprite(int x, int y){
        this.x = x;
        this.y =y;
        bo = true;   
    }
    
    protected void getImageDimensions(){
        width = im.getWidth(null);
        height = im.getHeight(null);
    }
    
    protected void loadImage(String noimagen){
       ImageIcon imai = new ImageIcon(noimagen);
        im = imai.getImage();
    }
    
    protected boolean isVisible(){
       return bo;
    }
    
    public Rectangle getBounds(){
       return new Rectangle(x,y,width,height);
    }
    
    public Image getImage(){
       return im;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
