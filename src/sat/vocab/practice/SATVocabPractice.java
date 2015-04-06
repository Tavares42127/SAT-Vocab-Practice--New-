
package sat.vocab.practice;

import java.util.Scanner;

/**
 *
 * @author Brandon Tavares
 * 
 */

public class SATVocabPractice {
    public static int numberOfQuestions = 30;
    
private static Scanner scanner = new Scanner( System.in );
    
public static void main(String[] arg) throws Exception {
    int score = 0;
    int numberOfQuestionsMissed = 0;
    int numberOfQuestionsCorrect = 0;
    int overallScore = 0;
  
    
      
 String[] wordList = {
     "Labrynth",
     "Cower",
     "Counterfeit",
     "Talisman",
     "Abrasive",
     "Covert",
     "Abhor",
     "Nullify",
     "Enigma",
     "Laceration",
     "Finish",
     "Defenestrate",
     "Tawdry",
     "Reprieve",
     "Ephemeral",
     "Tentative",
     "Cryptic",
     "Rescind",
     "Abstain",
     "Acrid",
     "Poignant",
     "Acrophobia",
     "Hieroglyphs",
     "Retention",
     "Hinder",
     "Obsolete",
     "Erratic",
     "Portend",
     "Revere",
     "Bulwark"
    };
 String[] definitions = {
"n: 1. an intricate combination of paths or passages in which it is difficult to find one's way or to reach the exit.",
"v: 1. to crouch, as in fear or shame.",
"adj: 1. made in imitation so as to be passed off fraudulently or deceptively as genuine; not genuine; forged.",
"n: 1. a stone, ring, or other object, engraved with figures or characters supposed to possess occult powers and worn as an amulet or charm.",
"adj: 1. tending to annoy or cause ill will; overly aggressive.",
"adj: 1. concealed; secret; disguised.",
"v: 1. to regard with extreme repugnance or aversion; detest utterly; loathe; abominate.",
"v: 1. to render or declare legally void or inoperative.",
"n: 1. a puzzling or inexplicable occurrence or situation.",
"n: 1.  a rough, jagged tear.",
"v: 1. to bring (something) to an end or to completion; complete",
"v: 1. to throw (a person or thing) out of a window.",
"adj: 1. (of finery, trappings, etc.) gaudy; showy and cheap.",
"v: 1. to delay the impending punishment or sentence of (a condemned person).",
"adj: 1. lasting a very short time; short-lived; transitory.",
"adj: 1. of the nature of or made or done as a trial, experiment, or attempt; experimental.",
"adj: 1. mysterious in meaning; puzzling; ambiguous.",
"v: 1. to abrogate; annul; revoke; repeal.",
"v: 1. to hold oneself back voluntarily, especially from something regarded as improper or unhealthy (usually followed by from).",
"adj: 1. sharp or biting to the taste or smell; bitterly pungent; irritating to the eyes, nose, etc.",
"adj: 1. keenly distressing to the feelings.",
"n: 1. a pathological fear of heights.",
"n: 1. a figure or symbol with a hidden meaning.",
"n: 1. the act or power of remembering things; memory.",
"v: 1. to cause delay, interruption, or difficulty in; hamper; impede.",
"adj: 1. no longer in general use; fallen into disuse.",
"adj: 1. deviating from the usual or proper course in conduct or opinion; eccentric; queer.",
"v: 1. to indicate in advance; to foreshadow or presage, as an omen does.",
"v: 1. to regard with respect tinged with awe; venerate.",
"n: 1. a wall of earth or other material built for defense; rampart."};

 score = 0;
 System.out.println( "Welcome to the SAT Vocabulary Practice Game!" );
 System.out.println( "Your Current Score Is " + score );
 System.out.println("Here's The First Question!");
    int i;
 for (i=0; i<numberOfQuestions; i++){
 System.out.println("-----------------------------");
 System.out.println(definitions[i]);
 String userAnswer = scanner.nextLine();
if (userAnswer.equalsIgnoreCase(wordList[i])){
    System.out.println("Correct!"); 
    score++;
    System.out.println("Your Score Is: " + score);
    numberOfQuestionsCorrect++;
} //Ends If Loop
else{
    System.out.println("Incorrect!");
    System.out.println("Your Score Is: " + score);    
    numberOfQuestionsMissed++;
}
 } //Ends For Loop
 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
 System.out.println("You Missed " + numberOfQuestionsMissed + " Questions!");
 System.out.println("Your Final Score Out of 30 is " + score);
}//Ends Main Class
}//Ends Class



