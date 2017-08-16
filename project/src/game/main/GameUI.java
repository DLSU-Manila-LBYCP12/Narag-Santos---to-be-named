package game.main;

import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameUI extends GraphicsProgram{
        
    private GImage textbox = new GImage("assets/ui/text_box.png");
    
    public void drawtextbox (GCanvas canvas){        
        textbox.setSize(canvas.getWidth()-10, canvas.getHeight()/4);
        double x = (canvas.getWidth()-(canvas.getWidth()-5));
        double y = (canvas.getHeight()-(canvas.getHeight()/3));
        canvas.add(textbox, x, y);
    }
    
    public void writetext (GCanvas canvas, String charname, String string){
        double h =textbox.getHeight();
        double w =textbox.getWidth();
        double x =textbox.getX()+30;
        double y =textbox.getY()+30;
        double x2 =textbox.getX()+50;
        double y2 =textbox.getY()+50;
        GLabel name = new GLabel(charname);
        name.setFont("Calibri-18-Bold");
        name.setColor(Color.white);
        canvas.add(name, x, y);
        GLabel text = new GLabel(string);
        text.setFont("Calibri-16");
        text.setColor(Color.white);
        canvas.add(text, x, y2);
    }
    
}
