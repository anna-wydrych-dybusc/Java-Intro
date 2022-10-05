public class Lesson3 {
    public static void main(String[] args) {

        String location = "New York";

        greeting("Mexico city");

        int degreesC = 32;
        weatherInterpreter(4);
        weatherInterpreter(degreesC);

        printPhoto(30, 40, true);

        Lesson3 newLesson3 = new Lesson3();
        newLesson3.nonStatic();

    }

    public int nonStatic(){

        int returnedLikes = likePhoto(0, "Nice color!", false);
        int totalLikes = likePhoto(returnedLikes, "I like it", true);

        admission(135.5);

        int rollOne = rollDice();
        int rollTwo = rollDice();
        System.out.println("Roll 1: " + rollOne);
        System.out.println("Roll 2: " + rollTwo);

        return totalLikes;

    }

    public static void greeting(String location){
        // greet a specific location
        System.out.println("Hello, " + location);
    }

    public static void weatherInterpreter(int temperature){
        if (temperature > 30){
            System.out.println("It's hot outside!");
        } else if (temperature < 5) {
            System.out.println("Brr, consider wearing a jacket.");
        }else {
            System.out.println("Not too hot, not too cold.");
        }
    }

    public static void printPhoto(int width, int height, boolean inColor){
        System.out.println("Width = "+ width + " cm");
        System.out.println("Height =" + height + " cm");
        if (inColor){
            System.out.println("Print is full color.");
        } else {
            System.out.println("Print is black and white.");
        }
    }

    public int likePhoto(int currentLikes, String comment, boolean like){
        //print out comment ald who is commenting
        System.out.println("Feedback: " + comment);
        if (like){
            //increase number of likes by 1
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number od likes: " + currentLikes);
        return currentLikes;
    }

    public String admission(double height){
        String passText;
        //check height reqs
        if (height > 120){
            passText = "You pass the height requirements.";
        }else {
            passText = "Sorry, you do not pass.";
        }
        System.out.println(passText);
        return passText;

    }

    public int rollDice(){
        //random number between 0 and almost 1
        double randomNumber = Math.random();

        //change range to 0 to almost 6
        randomNumber = randomNumber * 6;

        //shift range up one
        randomNumber = randomNumber + 1;

        //cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6
        int randomInt = (int) randomNumber;

        //return statement
        return randomInt;
    }

    /*
    Write a Java function named calculateTip(). The access modifier should be public,
    it should have a return type of double, and it should take as input a double parameter
    representing the cost of a meal at a restaurant. And finally, it should return a double equal
    to 15% of the cost parameter.
    */

    public double calculateTip(double mealCost){
        double tip = mealCost * 0.15;
        return tip;
    }

    /*
    Write a Java function called nametagText(). The access modifier should be public, the
    return type should be String, and it should take a String parameter called name. In the
    body of the function, return the String “Hello, my name is ” with the name parameter added
    to the end. (Hint: use String concatenation.)
     */
    public String nametagText(String name){
        String nameText = "Hello, my name is " + name;
        return nameText;
    }

    /*
    Define two functions. The first should be called fahrenheitToCelsius(). It should be
    a public function with return type double that takes a double argument that represents a
    temperature in Fahrenheit degrees. It should return the equivalent temperature in Celsius
    degrees. (To convert from Fahrenheit to Celsius, use the formula C = (F − 32) × 5/9.)

    Next, define a function called printTemperature(). It should be public, it should have a
    return type of void, and it should take a double parameter that represents a temperature in
    Fahrenheit degrees. This function should print “F: ” followed by the Fahrenheit parameter,
    then “C: ” followed by the equivalent value in Celsius degrees. Use the first function you
    defined to calculate the appropriate Celsius value inside the second function.

    Bonus challenge: write javadoc comments for both functions.
    */

    /**
     * Converts from Fahrenheit to Celsius degrees.
     * @param f Temperature in degrees Fahrenheit.
     * @return Equivalent temperature in degrees Celsius.
     */
    public double fahrenheitToCelsius(double f){
       return (f -32) * 5/9;
    }


    /**
     * Prints a temperature in both Fahrenheit and Celsius degrees.
     * @param f Temperature in degrees Fahrenheit.
     */
    public void printTemperature(double f){

        System.out.println("F: " + f + ", C: " + fahrenheitToCelsius(f) );
    }

    /*
    Define a function called monopolyRoll(). This function provides a random result based on
    the dice-rolling rules for the board game Monopoly. In Monopoly, players roll two six-sided
    dice to determine their move. If they roll the same value on both dice, this is called “rolling
    doubles,” and it means they go again. In our simplified version, the dice-roll function should
    behave like this:
    1. Generate two random integers in the 1 to 6 range.
    2. If the numbers are not the same, return the sum.
    3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
    and return the sum of all 4 numbers.

    Hint: to make your code neater, you can define a second function that generates a random
    integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not
    need to keep repeating that code.
    */

    public int diceRoll(int sides){
        // draw lots a random number
        double randomNumber = Math.random() * sides;
        // ad 1 for receive range starts from 1
        randomNumber = randomNumber + 1;
        // cast to integer and return
        return (int) randomNumber;
    }

    public int monopolyRoll(){
        // two random dice rolls
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        // sum of dice rolls
        int totalRoll = roll1 + roll2;
        if (roll1 == roll2){
            int roll3 = diceRoll(6);
            int roll4 = diceRoll(6);
            totalRoll = totalRoll + roll3 + roll4;
        }
        return totalRoll;
    }


}
