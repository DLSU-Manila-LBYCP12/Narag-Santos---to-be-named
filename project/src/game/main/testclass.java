/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.main;

import acm.program.*;
import acm.util.ErrorException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import adt.myLinkedList.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testclass extends ConsoleProgram {

    private MyLinkedList<String> text = new MyLinkedList<String>();

    private void readWordFile() {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader("assets/text/test.txt"));
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }

        try {
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
                println(line);
                TimeUnit.SECONDS.sleep(1);
            }
            rd.close();
        } catch (IOException ex) {
            throw new ErrorException(ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(testclass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void init() {
        readWordFile();
    }

    public static void main(String[] args) {
        new testclass().start();
    }
}
