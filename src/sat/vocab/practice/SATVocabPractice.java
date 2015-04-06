package sat.vocab.practice;

/**
 *
 * @author Brandon Tavares
 * 
 */

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.Arrays;
import java.util.ArrayList;



public class SATVocabPractice {
    @SuppressWarnings("resource")
    
    public int totalWords = 30;
    
   public static void main(String[] args) throws Exception
   {
       
       
       ArrayList words = new ArrayList(); //Word arrays 
       ArrayList definitions = new ArrayList(); //Definition arrays. 
       
      //Build reader instance
      //Read data.csv
      //Default seperator is "|"
      //Default quote character is double quote
      //Start reading from line number 2 (line numbers start from zero)
      CSVReader reader = new CSVReader(new FileReader("C:/Users/Jordan/Documents/GitHub/SAT-Vocab-Practice--New-/src/sat/vocab/practice/Words.txt"), '|' , '"' , 0);
       
      //Read CSV line by line and use the string array as you want
      String[] nextLine;
      while ((nextLine = reader.readNext()) != null) {
         if (nextLine != null) {
            //Verifying the read data here
            System.out.println(Arrays.toString(nextLine));
            definitions.add(Arrays.toString(nextLine));
            words.add(Arrays.toString(nextLine));
         }
       }
            System.out.println(words); //Print the word list
            System.out.println(definitions); //Print the definitions
   }
} 

