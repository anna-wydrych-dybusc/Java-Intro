public class Lesson4 {
    public static void main(String[] args) {



    }
    //choose a random number
    public int rollDice(int sides){
        double randomNumber = Math.random() * sides;
        randomNumber = randomNumber + 1;
        return (int) randomNumber;
    }
    //check how many roll you should do to achieve the same numbers on 5 dices
    public int keepRolling(){
        int dice1 = rollDice(6);
        int dice2 = rollDice(6);
        int dice3 = rollDice(6);
        int dice4 = rollDice(6);
        int dice5 = rollDice(6);
        int countRoll = 1;
        while (dice1 != dice2 && dice2 != dice3) && (dice4 != dice5){
            //we need to re-roll
            dice1 = rollDice(6);
            dice2 = rollDice(6);
            dice3 = rollDice(6);
            dice4 = rollDice(6);
            dice5 = rollDice(6);
            countRoll = countRoll + 1;
        }
        return countRoll;
    }

    /**
     * caunt an amount of blocks you need to build a pyramid which have some levels.
     * @param levels counts levels which have a pyramid
     * @return number of all blocks you need to build a pyramid
     */
    public int countBlocks(int levels){
        int numberOfBlocks = 0;
        for(int i = 1; i <= levels ; i++){
            numberOfBlocks = numberOfBlocks + i*i;
        }
        return numberOfBlocks;
    }

    /**
     * Print the even numbers between 2 and 10
     */
    public void evenNumbers(){
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }

    /**
     * WiFi search
     */
    public void searchWiFi(){
        for (int i = 1; i <=10 ; i++) {
            boolean wifiAvailable = checkWifi();
            if(wifiAvailable){
                System.out.println("Wifi found");
                break;  //ends loop if Wifi is found
            }

        }
    }

    /**
     * Roll a dice till you get 6 then you win
     * but if you get 3 you lose
     */
    public boolean rollASix(){
        int dice = rollDice(6);
        while (dice !=6){
            dice = rollDice(6);
                    if (dice == 3)
                        break;
        }
        if (dice == 6) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * in the game every bet is doubled if you lose,
     * if you win bet is the same.
     * You want to end the game if you have 1200$.
     */
    public int martingale() {
        int money = 1000;
        int target = 1200;
        int bet = 10;
        while (money > bet) {
            boolean win = play();
            if (win) {
                money += bet;
                bet = 10;
                if(money == target){
                    break;
                }
            } else {
                money -= bet;
                bet *= 2;
            }

        }
        return money;
    }
/*
    //define array
    String [] newsOutlet ={"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Aljazeera"};
    double lucky = Math.random();
    //Multiply by 10 to get a fractional number between 0-10
    lucky *= 10;
    //cast to integer to get an integer number between 0-9
    int luckyIndex = (int) lucky;
    System.out.println(newsOutlet[luckyIndex]);
*/

    public double calculateAverage(double [] temperatures){
        //figure out how many parameters are stored in the array
        int size = temperatures.length;
        // the same as length:
        //if (10<size){
        //    System.out.println(temperatures[10]);
        //}

        //add up the items inside the array
        double total = 0;
        for (int i = 0; i < size; i++) {
            //access every single item in the temperature array
            total += temperatures[i];
        }
        double average = total/size;
        return average;
    }

    /**
     * Searches an array speed for the fastest (smallest) value.
     * @param speed array of speeds
     * @return double the fastest speed found
     */
    public double search(double [] speed){
        // check the length of array and put it into the size variable
        int size = speed.length;
        //min remember the smallest number in the cell
        //initialize it to very first item in array
        double min = speed[0];
        //search for the next and next speed in cells
        for (int i = 1; i < size ; i++) {
            //is this value smaller than our minimum value
            if (speed[i]<min){
                // if it is true then save this value in min variable
                min = speed[i];
            }
        }
        return min;
    }

    //find the longest name in the array
    public String findLongestName(String [] names){
        int size = names.length;
        String longestName = names[0];
        for(int i = 0; i < size; i++){
            if(longestName.length() < names[i].length()){
                longestName = names[i];
            }
        }
        return longestName;
    }

    //calculate average of one subject (all row)
    public static double englishAverage(int [] [] grades){
        int total = 0;
        for (int i = 0; i < 5 ; i++) {
            total += grades[3][i];
        }
        double average = total/5.0;
        return average;
    }

    //calculate average of one student (all column)
    public static double englishAverage(int [] [] grades, int student){   //it contains 2D array and student index
        int subject = grades.length;
        int total = 0;
        for (int i = 0; i < subject ; i++) {
            total += grades[i][student];
        }
        double average = total/ (double) subject;
        return average;
    }

    /* Complete the factorial() function below. It should return the product of all the numbers
    from 1 to the parameter n. For example, factorial(5) should return 120 because 1 x 2 x
    3 x 4 x 5 = 120. Think about what kind of loop you want to use to accomplish this.
    */
    public int factorial (int n){
        int factorial = 1;
        for (int i = 1; i < n ; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /* Complete the code in this function to find and return the lowest index in the String array stringArray
    that the String target occurs. If the String target does not occur in stringArray, -1 should be returned.
    Starting code:
    public int indexOfFirstOccurrence(String[] stringArray, String target)
    {
    return -1;
    }
    As an example of how this function should work, this code should print 1, because the word
    “Java” appears at index 1.
    String[] sentence = {"Learning", "Java", "is", "fun."};
    int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
    System.out.println(indexOfWordJava);

    Hint: you cannot compare two Strings using the == operator! This will be false unless
    the two Strings are actually the same String object, not just two Strings with the same
    letters. To check whether two Strings have the same letters, use the equals() method:
    if (myString1.equals(myString2)). */

    public int indexOfFirstOccurrence(String[] stringArray, String target){
        int size = stringArray.length;
        for (int i = 0; i <size ; i++) {
            if (stringArray[i].equals(target)){
                return i;
            }
        }
        return -1;

    }

    /*
    A savings account yields 5% interest annually. This Java function is designed to determine
    how many years it will take for you to have $1,000,000 on deposit given an initial value. The
    parameter represents the initial deposit, and the function should return an integer number
    of years before there will be $1,000,000 or more in the account. Write a loop to determine
    the number of years, and return that value.
    (Hint: Do we know how many times this loop needs to iterate? Does this mean a for loop
    or a while loop is more appropriate?)
     */

    public int yearsTilOneMillion(double initialBalance) {
        initialBalance= 1000.00;
        double totalBalance;

        for (int i = 0; i < 1000000; i++) {
            double interest = initialBalance * 0.05;
            int numberOfYears = i;
            totalBalance = initialBalance + interest;
                if (totalBalance > 1000000){
                    return numberOfYears;
                }
        }
        return 0;
    }
    // best solution
    public int yearsTilOneMillion(double initialBalance){
        int years = 0;
        double balance = initialBalance;
        while(balance < 1000000){
            years++;
            balance = balance * 1.05;
        }
        return years;
    }

    /*
    Complete the Java function below to print out all the Strings
    in the String array parameter in reverse order.
    (The String at the highest index should be printed first,
    then the String at the next highest index, and so on.
    The String at index 0 should be printed last.)
    */

    public void printInReverse(String[] stringArray) {
        int size = stringArray.length;
        for (int i = 0; i < size  ; i++) {
            /*
            When i has its smallest possible value, 0, the expression
            below will be the length of the string array minus one,
            which is the highest index. When i has its largest possible
            value, stringArray.length - 1, this expression will be
            0, which is the the lowest index.
             */
            int indexToPrint = size - 1 -i;
            System.out.println(stringArray[indexToPrint]);
        }
    }
        /* A neater way to solve this would be to structure the for loop differently. For loop variables
            do not need to begin at 0, and do not always need to go up by one. This loop is structured
            so that the loop variable i begins at the largest index and decreases by 1 every time the
            loop iterates. (The syntax i-- is shorthand for i = i - 1;.)
         */
        public void printInReverse2(String[] stringArray) {

            for (int i = stringArray.length; i >=0 ; i--) {
                System.out.println(stringArray[i]);
            }

        }

        /*
        function below finds the range covered by an integer array.
        Inside the function, find the smallest value in the parameter array,
        and find the largest value, and return the largest value minus the smallest value.
        If the array has length 0, return -1.
        */

    public int findRange(int[] intArray) {
        int size = intArray.length;
        if (size == 0){
            return -1;
        }
        int smallestValue = intArray[0];
        int largestValue = intArray[0];
        for (int i = 0; i < size ; i++) {
            if (intArray[i]<smallestValue){
                smallestValue = intArray[i];
            }
            if(intArray[i]>largestValue){
                largestValue = intArray[i]
            }
        }
            return largestValue - smallestValue;
    }

    public int diceRoll(int sides){
        // draw lots a random number
        double randomNumber = Math.random() * sides;
        // ad 1 for receive range starts from 1
        randomNumber = randomNumber + 1;
        // cast to integer and return
        return (int) randomNumber;
    }

    /*
    in Monopoly, if a player rolls doubles three times in a row, they go
    to “jail.” Modify your function to keep track of the number of rolls made so far. If three
    consecutive doubles are rolled, return -1 instead of continuing to roll.
     */
    public int monopolyRoll(){
        // two random dice rolls
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        // sum of dice rolls
        int totalRoll = roll1 + roll2;
        int rollSoFar = 1;
        while (roll1 == roll2){
            //Here, we return -1 if doubles have been rolled too many times in row.
            if(rollSoFar >=3) return -1;
            int roll1 = diceRoll(6);
            int roll2 = diceRoll(6);
            totalRoll = totalRoll + roll1 + roll2;
            rollSoFar = rollSoFar + 1;
        }
        return totalRoll;
    }

    /*
    Optional challenge 2: in the last lesson, you learned about while loops and for loops as a
way to make a computer program repeat. There is another method for making a program
repeat using only functions called recursion. A “recursive” function is one which calls itself
inside itself. See if you can write the monopolyRoll() function by calling monopolyRoll()
inside the function itself to handle the case where further rolls are made.
     */

    public int monopolyRoll() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        if (roll1 != roll2) {
            return roll1 + roll2;
        } else {
//In the case where the two rolls are equal, we want to
//return the current roll plus the return value of another
//call to monopolyRoll(). This is called making a
//recursive call. The recursive call will handle making
//additional rolls, and recursive calls will keep getting
//made until a roll is made where the two values are not
//equal.
            return roll1 + roll2 + monopolyRoll();
        }
    }

}
