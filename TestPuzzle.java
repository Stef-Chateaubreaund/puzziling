import java.util.ArrayList;

//get numbers 1 to 20 and shows 10
public class TestPuzzle{
    public static void main(String[] args){
        Puzzle generator = new Puzzle();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);


        System.out.println(generator.getRandomLetter());
        // System.out.println(generator.getRandomLettterWithArray());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet());
    }
}
