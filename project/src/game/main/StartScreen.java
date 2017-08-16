package game.main;

import acm.graphics.*;
import acm.program.*;
import game.interfaces.GameConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StartScreen extends GraphicsProgram implements GameConstants{
    
    private GImage screen = new GImage("assets/ui/text_box.png");
    public GLabel title = new GLabel("VN TITLE TEMPLATE");
    public GRoundRect startbutton= new GRoundRect(200, 50); 
    public GRoundRect selectscenebutton= new GRoundRect(200, 50);
    public GRoundRect exitbutton= new GRoundRect(200, 50);
    
    public void initstartscreen(GCanvas canvas){
        startscreen(canvas);
        start_game(canvas);
        selectscene(canvas);
        exit(canvas);
    }    
    
    public void startscreen(GCanvas canvas) {
        title.setFont("Calibri-50-Bold");
        canvas.add(title, (canvas.getWidth()/2)- 200, 100);        
    }

    public void start_game(GCanvas canvas) {
        GLabel label = new GLabel("Start Game");
        label.setFont("Dialog-30");
        startbutton.setFilled(true);
        startbutton.setColor(new Color(76, 137, 166));
        canvas.add(startbutton, (canvas.getWidth()/2)-100, 150);
        canvas.add(label, (canvas.getWidth()/2)-75, 185);
    }

    public void selectscene(GCanvas canvas) {
        GLabel label = new GLabel("Select Scene");
        label.setFont("Dialog-30");
        selectscenebutton.setFilled(true);
        selectscenebutton.setColor(new Color(76, 137, 166));
        canvas.add(selectscenebutton, (canvas.getWidth()/2)-100, 250);
        canvas.add(label, (canvas.getWidth()/2)-85, 285);        
    }
    
    

    public void exit(GCanvas canvas) {
        GLabel label = new GLabel("Exit");
        label.setFont("Dialog-30");
        exitbutton.setFilled(true);
        exitbutton.setColor(new Color(76, 137, 166));
        canvas.add(exitbutton, (canvas.getWidth()/2)-100, 350);
        canvas.add(label, (canvas.getWidth()/2)-25, 385);        
    }
    
}
