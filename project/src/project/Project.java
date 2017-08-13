/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Gershom Narag/Cellix Santos
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class Project extends GraphicsProgram{

    private ProjectCanvas canvas;
    
    public void init(){
        canvas = new ProjectCanvas();
        add(canvas);
    }
    
    public void start_game(){
        
    }
    
    public void scene_Select(){
        
    }
    
    public void exit(){
        
    }
    
    public static void main(String[] args) {
        new Project().start();
    }
    
}
