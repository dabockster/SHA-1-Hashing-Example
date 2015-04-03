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
package edu.plu.cs.views;

import edu.plu.cs.controllers.SHA1ExampleController;

/**
 *
 * @author dabockster
 */
public class SHA1ExampleView {
    
    private SHA1ExampleController controller;
    private String defaultMessage;
    
    public SHA1ExampleView(SHA1ExampleController controller){
        this.controller = controller;
        defaultMessage = "SAMPLE TEXT";
    }
    
    public void appendToView(String message){
        if (message.equals("")){
            System.out.println(defaultMessage);
        }
        
        System.out.println(message);
    }    
}
