/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 //Test

package sat.vocab.practice;

/**
 *
 * @author Brandon Tavares
 * 
 */

import java.util.Random;
//import java.util.Scanner;
public class SATVocabPractice {
    private String word;
    private String definition;
    
    public static void main(String[] args) {
        int[] questionNumbersSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        suffleArray(questionNumbersSorted); //Test
   
    public String getWord() //Get a word from the file
    {
        return word;
    }

    public void setWord(String word) //Set the word
    {
        this.word = word;
    }

    public String getDefinition() //Retrieve definition
    {
        return definition;
    }
        
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
