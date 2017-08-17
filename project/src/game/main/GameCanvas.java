package game.main;

import game.interfaces.*;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import game.chapters.Chapter1;
import java.awt.Color;
import java.awt.event.MouseListener;

public class GameCanvas extends GCanvas implements GameConstants {
    
    private GImage textbox = new GImage("assets/ui/text_box.png");
    private Chapter1 chapter1 = new Chapter1();
    private GameUI ui = new GameUI();
    
    public void init(){
        
    }    
    
    public void startchapter (int i){
        chapter1.scenemod(i);
        chapter1.scene1(this);

    }
}
