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
        
    public GImage textbox = new GImage("assets/ui/text_box.png");
    public GImage character;
    public GLabel name;
    public GLabel dialogue;
    
    public void drawtextbox (GCanvas canvas){        
        textbox.setSize(canvas.getWidth()-10, canvas.getHeight()/4);
        double x = (canvas.getWidth()-(canvas.getWidth()-5));
        double y = (canvas.getHeight()-(canvas.getHeight()/4));
        canvas.add(textbox, x, y);
    }
    
    public void writecharname(GCanvas canvas, String line){        
        if(name!=null){
            canvas.remove(name);
        }   
        int nameEnd2 = line.indexOf("_");
        String charaname = line.substring(0, nameEnd2);
        double x =textbox.getX()+30;
        double y =textbox.getY()+35;
        name = new GLabel(charaname);
        name.setFont("Dialog-25");
        name.setColor(Color.white);
        canvas.add(name, x, y);
        if(line.contains(":")){
            writetext (canvas, line);
        }
    }
    
    
    public void writetext (GCanvas canvas, String line){
        if(line.contains(":")){
            int textstart = line.indexOf(":")+1;
            int textend = line.indexOf("]")-1;
            String linetext = line.substring(textstart, textend);
            double x =textbox.getX()+30;
            double y2 =textbox.getY()+53;  
            if(dialogue!=null){
                canvas.remove(dialogue);  
            }       
            dialogue = new GLabel(linetext);
            dialogue.setFont("Dialog-20");
            dialogue.setColor(Color.white);
            canvas.add(dialogue, x, y2);
        }        
    }
    
    public void addchar(GCanvas canvas, String line){    
        //extracts name of character from string
    //    int nameEnd2 = line.indexOf("_");
    //    String charaname = line.substring(0, nameEnd2);
    //    writecharname(canvas, charaname);
        if(line.contains("_")){
            writecharname(canvas, line);
        }
        //extracts image name from string
        int nameEnd = line.indexOf(" ");
        String filename = line.substring(0, nameEnd);
        filename=("assets/char/" +filename);        
        character= new GImage(filename);
        character.setSize( character.getWidth()/1.5, character.getHeight()/1.5);
        
        
        //sets position of character leftscreen, midscreen, rightscreen
        if(line.contains("leftscreen")){
            canvas.add(character, -175, 0);
        }
        else if (line.contains("midscreen")){
            canvas.add(character, 0, 0);
        }
        else if (line.contains("rightscreen")){
            canvas.add(character, 175, 0);
        }
        
//        if(line.contains(":")){
//            writetext (canvas, line);
//       }
        
        character.sendBackward();
        
        if(textbox!=null){
            textbox.sendToFront();
        }       
        if(name!=null){
            name.sendToFront();            
        }       
        if(dialogue!=null){
            dialogue.sendToFront();        
        }        
    }
}
