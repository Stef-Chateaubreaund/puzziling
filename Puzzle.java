
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Puzzle{


    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <=10; i++) {
            random10.add(rand.nextInt(20) + 1);
        }

        return random10;
    }


    //retunr random letter of array of alphabet 
    public String getRandomLetter() {
        String[] myArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        Random rand = new Random();
        int randNumb = rand.nextInt(25);
        System.out.println(randNumb);
        // random letter selected
        String randLetter = myArray[randNumb];
        return randLetter;
}


    // generate a random set of 8 letters randomly 
        // run a loop for 8 times to get the random letter oito vezes vai procurar letras aleatorias
    public String generatePassword() {
         // start with a String variable to put the letters into comeca aqui com isso 
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }


}
    
