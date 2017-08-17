package game.chapters;

import acm.graphics.*;
import acm.program.*;
import acm.util.ErrorException;
import adt.myLinkedList.*;
import game.main.GameUI;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Chapter1 extends GraphicsProgram{
    
    private GameUI ui = new GameUI();
    private MyLinkedList<String> text = new MyLinkedList<String>();
    private int linenumber = 1;
    
    private GImage city1 = new GImage("assets/bg/city1.jpg");
        
    public void scenemod(int i){
        linenumber = i;
    }
    
    public void readfile (){
		BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader("assets/text/chapter1.txt"));
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }

        try {
            int i=1;
            while (true) {
                String line = rd.readLine();
                if (line == null) {
                    break;
                }
                else if ("".equals(line)) {
                    break;
                }
                else if (line.contains("0")) {
                    break;
                }
                text.add(line);
                println(text.get(i));
                i++;
            }
            rd.close();
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }
    }
 
    
    public void scene1(GCanvas canvas){
        readfile();
        double x = canvas.getWidth();
        double y = canvas.getHeight(); 
        city1.setSize(x,y);
        canvas.add(city1, 0, 0);        
        ui.drawtextbox(canvas);
        clicktextbox(canvas);
//        int i=1;
//        while (i<text.size()){
//            String line = text.get(i);
//           if(line.contains("png")){
//                int nameEnd = line.indexOf(" ");
//		String Name = line.substring(0, nameEnd);       
//                println("line" +i+ "contains png");
//                println("line is" +line);
//                println(Name);
//                ui.addchar(canvas, line);
//            }
//            else {
//                
//            }
//            
//           i++;
//        }
    }
    
    public void clicktextbox(GCanvas canvas){        
        ui.textbox.addMouseListener(new MouseAdapter(){        
        @Override
        public void mousePressed(MouseEvent e){
        }
        @Override
        public void mouseReleased(MouseEvent e){
            if(linenumber<=text.size()){
                String line = text.get(linenumber);
            if(line.contains("png")){
                int nameEnd = line.indexOf(" ");
		String Name = line.substring(0, nameEnd);       
                println("line" +linenumber+ "contains png");
                println("line is" +line);
                println(Name);
                ui.addchar(canvas, line);
            }
            else if(line.contains(":")){
                ui.writetext(canvas, line);
            }            
            linenumber++;    
            }                  
        }
        });
        
        
        
    }
    
    
    
}
