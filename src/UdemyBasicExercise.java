import java.util.Scanner;


public class UdemyBasicExercise {

    static String[] name = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        testName();
        listOfGuests(name);
        do {
            displayMenu();
            int option = getOption();
            if (option == 1) {
                listOfGuests(name);
            } else if (option == 2) {
                addGuest();
            } else if (option == 3) {
                deleteName();
            else if (option == 4) {
                    insertNameInAParticulerPosition();
                }}
            else if (option == 5) {
                renameName();
            }
            else if (option == 6) {
                exit();
                break;
            }
        } while (true);
    }


    public static void listOfGuests(String[] name) {
        String[] nameTemp = new String[name.length];
        int ti = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                nameTemp[ti] = name[i];
                ti++;
            }
        }
        name = nameTemp;

        System.out.println("__________________\nGuests Lists:");
        boolean isEmpty = true;
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                System.out.println((i + 1) + ". " + name[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guess list is empty.");
        }
        // return name;
    }
    public static void displayMenu() {
        System.out.println("_______________________\nMENU\n");
        System.out.println(" 1 - See the list of guests.");
        System.out.println(" 2 - Add new guest.");
        System.out.println(" 3 - Delete guest. ");
        System.out.println(" 4 - Delete and add guest by name or number. ");
        System.out.println(" 5 - Rename guest. ");
        System.out.println(" 6 - Exit.");
    }


    public static int getOption() {
        System.out.println("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    public static void addGuest() {
        System.out.println("_____________________\nEnter new guest name");
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                name[i] = scanner.nextLine();
                break;
            }
        }
    }

    public static void deleteName() {
        System.out.println("_________________\nDeleting");
        System.out.println("Enter name or number in the list of guest for deleting: ");
        int deleteNameNum = scanner.nextInt();
        if (deleteNameNum >= 1 && deleteNameNum <= 10 && name[deleteNameNum - 1] != null) {
            name[deleteNameNum - 1] = null;
        }
        else{
            System.out.println("There's no guest with that number");
        }
    }

    public static void insertNameInAParticulerPosition(){


    }

    public static void renameName(){
        System.out.println("_________________\nRename");
        System.out.println("Enter name for rename: ");
        String oldName = scanner.nextLine();

        for (int i = 0; i < name.length; i++) {
            if(name[i] != null && name[i].equals(oldName)){
                System.out.println("Enter right name: ");
                name[i] = scanner.nextLine();
                break;
            }else {
                System.out.println("The name you entered is not in the list.");
            }

        }
    }


        // String deleteName = scanner.next();
        //for (int i = 0; i < name.length; i++) {
        //    if (name[i] != null && name[i].equals(deleteName)) {
        //        name[i] = null;
        //        break;
        //    }
        //  }


    public static void exit() {
        System.out.println("Exiting .... ");
    }

    public static void testName() {
        name[0] = "Vlad";
        name[1] = "Olga";
        name[2] = "Evgeny";
        name[3] = "mama";
        name[4] = "Andrey";
        name[5] = "papa";

    }
}


// sortirovka log2 sortirovka log2 sortirovka log2 sortirovka log2 sortirovka log2 sortirovka log2 sortirovka log2 sortirovka log2
        /*
        int randomNumber;
        int secondGuess;
        int counter = 1;
        int indexInMassive = 0;
        int[] triedNum = new int[26];
        String higherLower;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guessing game");
        System.out.println("Enter number ");
        int myNumber = scanner.nextInt();


        for (int j = 0; j < triedNum.length; j++) {


            do {
                randomNumber = ThreadLocalRandom.current().nextInt(1, 50);
                triedNum[indexInMassive++] = randomNumber;
                for (int i = 0; i < indexInMassive; i++) {
                    if (triedNum[i] == randomNumber) {
                        randomNumber = ThreadLocalRandom.current().nextInt(1, 50);
                        System.out.println("we are inside 1, computer tried: " + triedNum[i]);
                    }
                    System.out.println("we are inside 2. What we have: " + triedNum[i]);
                }
                System.out.println("Is your number: " + randomNumber);
                higherLower = scanner.next();
                if (higherLower.equals("higher")) {
                    triedNum[indexInMassive++] = randomNumber;
                    randomNumber = randomNumber * 2;

                } else if (higherLower.equals("lower")) {
                    triedNum[indexInMassive++] = randomNumber;
                    randomNumber = randomNumber / 2;

                } else if (higherLower.equals("correct")) {
                    System.out.println("Your number was " + randomNumber + "\nThank you for playing!");
                }
            } while (myNumber != randomNumber && randomNumber < 51);
            System.out.println("Your number was " + randomNumber + "\nThank you for playing!");
            System.out.println("Computer tried: " + Arrays.toString(triedNum));
        }
    }
}
// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY
        /*
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println(randomNumber);
        System.out.println("Guess what is the random number");
        int guessNumber = scanner.nextInt();
       // while (guessNumber !=randomNumber){
            do {
                if (guessNumber > randomNumber) {
                    System.out.println("very high. Try again");
                    guessNumber = scanner.nextInt();
                } else if (guessNumber < randomNumber) {
                    System.out.println("very low. Try again");
                    guessNumber = scanner.nextInt();
                }

            } while (guessNumber != randomNumber);
        System.out.println(" You got it right " + randomNumber);
        }
    }
//}
// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY

        /*
        System.out.println("All question true or false. ");
        int howManyQuestions = 5;
        Scanner scanner = new Scanner(System.in);
        String[] questions = new String[howManyQuestions];
        questions[0] = "Is it true that all animals can swim? ";
        questions[1] = "Is it true that all animals can breath? ";
        questions[2] = "Is it true that all animals have teeth? ";
        questions[3] = "Any question? ";
        questions[4] = "Just type false? ";
        Boolean[] rightAnswers = new Boolean[howManyQuestions];
        rightAnswers[0] = true;
        rightAnswers[1] = true;
        rightAnswers[2] = true;
        rightAnswers[3] = true;
        rightAnswers[4] = false;
        Boolean[] studentAnswer = new Boolean[howManyQuestions];
        int countStudentAnswers = 0;
        for (int i = 0; i < howManyQuestions; i++) {
            System.out.println(questions[i]);
            studentAnswer[i] = scanner.nextBoolean();
        }
       // for (int i = 0; i < howManyQuestions; i++) {
       //     System.out.println(studentAnswer[i]);
       // }
        for (int i = 0; i < howManyQuestions; i++) {
            if(rightAnswers[i] == studentAnswer[i] ){

                countStudentAnswers++;
            }
            else{
               // System.out.println(questions[i] + " " + rightAnswers[i]);
                System.out.println("The question \" "  + questions[i] + " \" is " + rightAnswers[i] + ". You got it wrong.");
            }
        }
        System.out.println("You get " + countStudentAnswers + " out of " + howManyQuestions);
    }

}

    /*
// UDEMY PUZIREK  UDEMY PUZIREK  UDEMY PUZIREK  UDEMY PUZIREK  UDEMY PUZIREK  UDEMY PUZIREK  UDEMY PUZIREK  UDEMY PUZIREK

        public static void main(String[] args) {
        double[] raceLapTime = new double[]{9.022, 8.0, 681.989, 2872.0, 3.0, 12.005, 100.00, 54.1789, 262.18782, 12.0001};
        double[] temp = new double[1];
        for (int i = 0; i < raceLapTime.length - 1; i++) {
            for (int j = 0; j < raceLapTime.length - 1; j++) {


                if (raceLapTime[j] >= raceLapTime[j + 1]) {
                    temp[0] = raceLapTime[j];
                    raceLapTime[j] = raceLapTime[j + 1];
                    raceLapTime[j + 1] = temp[0];
                }
            }

        }
        System.out.println(Arrays.toString(raceLapTime));
    }

 */

// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY
 /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number: ");
        int num = scanner.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 5);
        int count = 0;
        //    if (num != randomNumber) {
        do {
            if (num > randomNumber) {
                System.out.println("Entered number is greater than random number\nEnter new number: ");
                num = scanner.nextInt();
            } else if (num < randomNumber) {
                System.out.println("Entered number is less than random number\nEnter new number: ");
                num = scanner.nextInt();
            } else if (num == randomNumber) {
                System.out.println("You got it");
            }
            count++;
        }
            while (num != randomNumber) ;
            System.out.println("You got it\n You guessed: " + count + " times.");
*/

// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY
/*
        Scanner scanner = new Scanner(System.in);
        String pw = "shark50";
        String tryGuessPW;
        do {
            System.out.println("Enter your pw ");
            tryGuessPW = scanner.next();
        }
            while (!pw.equals(tryGuessPW)) ;
            System.out.println("Access Approved");
*/

// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY
   /*
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("Let's try to guess from 1 to 5 ");
        int guessingNumber = scanner.nextInt();
        if (guessingNumber == randomNumber) {
            System.out.println("Correct! Aren't you lucky");
        } else {
            System.out.println("try again ");
            {
                System.out.println("Let's try second guess from 1 to 5 ");
                int guessingNumber2 = scanner.nextInt();
                if (guessingNumber2 == randomNumber) {
                    System.out.println("Correct! Aren't you lucky");
                } else {
                    System.out.println("try again ");
                    {
                        System.out.println("Let's try third guess from 1 to 5 ");
                        int guessingNumber3 = scanner.nextInt();
                        if (guessingNumber3 == randomNumber) {
                            System.out.println("Correct! Aren't you lucky");
                        }
                        else {
                            System.out.println("Let's go to sleep");
                    }
                }
            }
        }
       */

// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY


/*
public static int[][] result = new int[10][];
public static void main(String[] args) {
               for (int j = 0; j < result.length; j++) {
            result[j] = new int[j+1];
                   for (int i = 0; i < result.length; i++) {
                       result[i][j] = [i][j+1];
                   }
                   System.out.println(Arrays.toString(result[j]));
        }
        }

 */

    /*
// UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY UDEMY
// random students and marks

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter highest score: ");
        int highestScore = scanner.nextInt();
        int count = 0;

        System.out.print("Enter a number of students: ");
        int x = scanner.nextInt();
        // System.out.println(x);
        String[] studentsName = new String[x];
        for (int i = 0; i < x; i++) {
            studentsName[i] = "Student " + count++;
        }
        System.out.println(Arrays.toString(studentsName));
        randomScore(x, highestScore);

        // необъодимо преобрзовать два массива в строку
    }


    public static int[] randomScore(int x, int highestScore) {
        int[] randomScore = new int[x];
        for (int i = 0; i < x; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, highestScore);
            randomScore[i] = randomNumber;
        }
        System.out.println(Arrays.toString(randomScore));
        return randomScore;
    }

}*/



