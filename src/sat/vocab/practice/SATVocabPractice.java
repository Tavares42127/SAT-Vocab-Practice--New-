
package sat.vocab.practice;

/**
 *
 * @author Brandon Tavares
 * 
 */

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.Arrays;

public class SATVocabPractice {
    @SuppressWarnings("resource")
   public static void main(String[] args) throws Exception
   {
       
      //Build reader instance
      //Read data.csv
      //Default seperator is comma
      //Default quote character is double quote
      //Start reading from line number 2 (line numbers start from zero)
      CSVReader reader = new CSVReader(new FileReader("C:/Users/Jordan/Documents/GitHub/SAT-Vocab-Practice--New-/src/sat/vocab/practice/Words.txt"), '|' , '"' , 0);
       
      //Read CSV line by line and use the string array as you want
      String[] nextLine;
      while ((nextLine = reader.readNext()) != null) {
         if (nextLine != null) {
            //Verifying the read data here
            System.out.println(Arrays.toString(nextLine));
         }
       }
   }
} 
