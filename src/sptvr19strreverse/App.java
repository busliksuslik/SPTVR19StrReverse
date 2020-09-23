/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19strreverse;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    final private Scanner scan = new Scanner(System.in); 
    void run(){
        String input = scan.nextLine();
        char[] inputch = input.toCharArray();
        char[] outputch = new char[input.length()];
        for (int i = 0; i < input.length();i++){
            outputch[i] = inputch [input.length()-i-1];
        }
        String output = new String(outputch);
        System.out.println(output);
    }
    
}
