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
 import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class X {
    public static void main(String[] args) {
    File f = new File("Words.txt");
        try{
            ArrayList<String> lines = get_arraylist_from_file(f);
            for(int x = 0; x < lines.size(); x++){
                System.out.println(lines.get(x));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Done");

    }
    public static ArrayList<String> get_arraylist_from_file(File f) 
        throws FileNotFoundException {
        Scanner s;
        ArrayList<String> list = new ArrayList<String>();
        s = new Scanner(f);
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
        return list;
    }
}   
}
