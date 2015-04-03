/*
 * The MIT License
 *
 * Copyright 2015 dabockster.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package edu.plu.cs.controllers;

import edu.plu.cs.models.SHA1ExampleModel;
import edu.plu.cs.views.SHA1ExampleView;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author dabockster
 */
public class SHA1ExampleController {
    
    private SHA1ExampleModel model;
    private SHA1ExampleView view;
    
    public SHA1ExampleController(){
        model = new SHA1ExampleModel();
        view = new SHA1ExampleView(this);
    }
    
    public void inputMessage(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string to be hashed: ");
        String message = keyboard.nextLine();
        model.setMessage(message);
    }
    
    public String getSHA1(){
        String message = model.getMessage();
        //byte[] toBeHashed = message.getBytes("UTF-8");
        
        String hex = DigestUtils.sha1Hex(message);
        
        model.setHex(hex);
        return model.getHex();
    }
    
    public String getSHA256(){
        String message = model.getMessage();
        String hex = DigestUtils.sha256Hex(message);
        model.setHex(hex);
        return model.getHex();
    }
    
    public void displayHash(String algorithm){
        String toPrint = "";
        
        if (algorithm.equals("SHA-1")){
            getSHA1();
            String hex = model.getHex();
            StringBuilder sb = new StringBuilder();
            sb.append("Hash: ");
            sb.append(hex);
            toPrint = sb.toString();
        }
        
        if (algorithm.equals("SHA-256")){
            getSHA256();
            String hex = model.getHex();
            StringBuilder sb = new StringBuilder();
            sb.append("Hash: ");
            sb.append(hex);
            toPrint = sb.toString();
        }
        
    }
    
}
