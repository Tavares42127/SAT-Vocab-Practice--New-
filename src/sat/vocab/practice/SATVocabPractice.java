package sat.vocab.practice;

/**
 *
 * @author Brandon Tavares
 * 
 */
//<<<<<<< HEAD
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Scanner;
//=======

//>>>>>>> origin/master
//import java.util.Random;
public class SATVocabPractice 
{
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
public class Reader 
{
    public void main(String[] args)
    {
        List<user> list = new ArrayList<user>();
        File file = new File("Words.txt");
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readline()) != null)
            {
                String[] SplitedString = line.split("|");
                Word word = new Word();
                word.setName(splitedString[0]);
                word.setScore(Integer.parseInt(splitedString[1]))
            }
        }
    }
}        
    }
    //static void suffleArray(int[] ar){
      //Random rnd = new Random();
        //for (int i = ar.length - 1; i > 0; i--)
        //{
            //int index = rnd.nextInt(i + 1);
          //int a = ar[index];
            //ar[index] = ar[i];
            //ar[i] = a;
        //}
    //}
        //}
    

