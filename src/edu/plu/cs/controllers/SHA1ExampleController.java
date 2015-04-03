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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dabockster
 */
public class SHA1ExampleController {
    
    private SHA1ExampleModel model;
    private SHA1ExampleView view;
    private MessageDigest digest;
    
    public SHA1ExampleController(){
        model = new SHA1ExampleModel();
        view = new SHA1ExampleView(this);
        hashInit();
    }
    
    private void hashInit(){
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SHA1ExampleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inputMessage(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string to be hashed: ");
        String message = keyboard.nextLine();
        model.setMessage(message);
    }
    
    public void getSHA1(){
        
    }
}
