package game.main;

import acm.graphics.*;
import acm.program.*;
import acm.util.ErrorException;
import acm.util.*;
import game.interfaces.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainProgram extends Program implements GameConstants{
    
    private StartScreen startscreen = new StartScreen();
    private GameCanvas canvas = new GameCanvas();
    private GameUI gameui = new GameUI();
    
    public void init(){
        add(canvas);
        startscreen();
    }
    
    public void startscreen(){
        startscreen.initstartscreen(canvas);
        start_game();
        scene_Select();
        exit();
    }
    
    public void test(){
        add(canvas);
        start_game();
    }
    
    //starts game
    public void start_game(){        
        startscreen.startbutton.addMouseListener(new MouseAdapter(){        
        @Override
        public void mousePressed(MouseEvent e){
            startscreen.startbutton.setColor(Color.yellow);
        }
        @Override
        public void mouseReleased(MouseEvent e){
            startscreen.startbutton.setColor(new Color(76, 137, 166));
            canvas.removeAll();
            canvas.startchapter();
            
        }
        });
        
    }
    
    //scene selection
    public void scene_Select(){
        startscreen.selectscenebutton.addMouseListener(new MouseAdapter(){        
        @Override
        public void mousePressed(MouseEvent e){
            startscreen.selectscenebutton.setColor(Color.yellow);
        }
        @Override
        public void mouseReleased(MouseEvent e){
            startscreen.selectscenebutton.setColor(new Color(76, 137, 166));
        }
        });
        
    }
    
    //exits
    public void exit(){
        startscreen.exitbutton.addMouseListener(new MouseAdapter(){        
        @Override
        public void mousePressed(MouseEvent e){
            startscreen.exitbutton.setColor(Color.yellow);
        }
        @Override
        public void mouseReleased(MouseEvent e){
            startscreen.exitbutton.setColor(new Color(76, 137, 166));
            System.exit(0);             
        }
        });        
    }
    
    public static void main(String[] args) {
        new MainProgram().start();
    }
}

