/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule3.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfonso.valdez
 */
public class ExceptionTest {
    
    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        
        try {
            test.getFile("nameOfFile.txt");
        } catch (IOException ex) {
            Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getFile(String nameFile) throws IOException{
        boolean isCreated = false;
        File f = new File(nameFile);
        if(f.exists()){
            isCreated = f.createNewFile();
        }
    }
}
