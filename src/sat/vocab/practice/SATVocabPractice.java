/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sat.vocab.practice;

/**
 *
 * @author Brandon Tavares
 * 
 */
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Random;
//import java.util.Scanner;
public class SATVocabPractice {
    
    
    public static void main(String[] args) {
        int[] questionNumbersSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        suffleArray(questionNumbersSorted);
    String currentWord;
        try
        {
            String host = "jdbc:derby://localhost:1527/SAT Vocab";
            String uName = "Tavares42127";
            String uPass = "Bmtr0cks";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            System.out.println("Connection Successful!");
            for (int i=0; i<=30; i++)
{
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT FROM WORDS WHERE WORDNUMBER =" + questionNumbersSorted[i] ;
        currentWord = con.String(sql);
        //System.out.println("The word number selected is"+ questionNumbersSorted[i]);
}
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
        
        for (int i = 0; i < questionNumbersSorted.length; i++)
        {
            System.out.print(questionNumbersSorted[i] + " ");
        }
        System.out.println();
        
    }
    static void suffleArray(int[] ar){
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
        }
    
//
