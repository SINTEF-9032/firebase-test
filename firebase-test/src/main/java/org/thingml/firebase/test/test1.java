/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thingml.firebase.test;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author steffend
 */
public class test1 {
    public static void main(String[] args) { 
        try {
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setServiceAccount(new FileInputStream("Test1-a5c07d2e3189.json"))
                    .setDatabaseUrl("https://test1-932f2.firebaseio.com/")
                    .build();        
            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
}
