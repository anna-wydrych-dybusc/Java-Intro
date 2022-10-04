public class Lesson2 {
    public static void main(String[] args) {
boolean isCold = true;
        if(isCold){
            //execute only if isCold is true
            System.out.println("It,s cold, wear a coat!");
        }

boolean isLightGreen = true;
boolean isLightYellow = false;
        if(isLightGreen) {
            //traffic light is green
            double carSpeed = 100; //km/h
            //nie można użyć zmiennej car speed poza nawiasami
            System.out.println("Drive");
            System.out.println("Speed is: " + carSpeed);
        }
        else if (isLightYellow) {
         //light is not green but is yellow
         System.out.println("Slow down.");
        }
        else {
            //light is either green nor yellow
            System.out.println("Stop");
        }

int ticketPrice = 10;
int age = 25;
boolean isStudent = true;
if (age <=15){
    //age is less than or equal to 15
    ticketPrice = 5;
} else if (age > 60) {
    //age is greater than 60
    ticketPrice = 5;
} else if (isStudent) {
    //they are a student
    ticketPrice = 5;
}

if(age<=15 || age>60 || isStudent){
    //all discount conditions are covered
    ticketPrice = 5;
}

boolean action = true;
boolean romance = true;
boolean horror = false;
boolean comedy = true;
if (action && romance){
    //include action and romance
    System.out.println("This movie includes action and romance.");
    if (comedy||horror){
        //everyone's preferences have been met!
        System.out.println("This also includes comedy or horror!");
    }
}

int rating = 4;
if(rating >=0 && rating<=5){
    //rating is 0-5
    if (rating <=2){
        //rating is less than or equal to 2
        System.out.println("What's the reason for your low rating?");
    }
    System.out.println("Thank you for your feedback.");
}

int passcode = 312;
String coffeeType;
if (passcode == 555){
    //espresso passcode
    coffeeType = "Espresso";
} else if (passcode == 312) {
    //vanilla latte passcode
    coffeeType = "Vanilla latte";
} else if (passcode == 629) {
    //drip coffee code
    coffeeType = "Drip coffee";
} else {
    //unknown passcode
    coffeeType = "Unknown";
}
System.out.println(coffeeType);

/* SWITCH STATEMENT
underneath code is the same
word "break" ending this part of code */

switch(passcode){
    case 555: coffeeType = "Espresso";
        break;
    case 312: coffeeType = "Vanilla latte";
        break;
    case 629: coffeeType = "Drip coffe";
        break;
    default: coffeeType = "Unknown";
        break;
}
System.out.println(coffeeType);

int month = 4; //should be a number 1-12
String  monthString;

switch (month){
    case 1: monthString = "January";
    break;
    case 2: monthString = "February";
    break;
    case 3: monthString = "March";
    break;
    case 4: monthString = "April";
    break;
    case 5: monthString = "May";
    break;
    case 6: monthString = "June";
    break;
    case 7: monthString = "July";
    break;
    case 8: monthString = "August";
    break;
    case 9: monthString = "September";
    break;
    case 10: monthString = "October";
    break;
    case 11: monthString = "November";
    break;
    case 12: monthString = "December";
    break;
    default: monthString = "Invalid month";
}
System.out.println(monthString);




int dogs = 1;
int cats = 2;
if (dogs > 0 && cats == 0){
    if (dogs >1){
        System.out.println("Dog lover");
    }else {
        System.out.println("Dog person");
    }
} else if (cats>0 && dogs == 0) {
    if (cats>1){
        System.out.println("Cat lover");
    }else {
        System.out.println("Cat person");
    }
    System.out.println("Meow!");
} else if (cats > 0 && dogs > 0) {
    if (dogs>cats){
        System.out.println("I guess you like dogs more");
    } else if (dogs == cats) {
        System.out.println("I guess you like both equally");
    }else {
        System.out.println("I guess you like cats more");
    }
} else {
    System.out.println("What, don't you like pets?");
}

/*  You are programming the behavior of an enemy in a video game. The enemy code has access
to two boolean variables, canSeePlayer and playerPoweredUp. canSeePlayer is true
when the enemy can see the player and false otherwise, and playerPoweredUp is true when
the player has found a special item that makes them impossible to defeat temporarily. Fill
in the correct conditions so that “Attack!” is printed when the enemy can see the player
and the player is not powered-up, “Run away!” is printed when the player is visible and is
powered-up, and finally, “Wander.” is printed if the player is not visible. */

boolean canSeePlayer = true;
boolean playerPoweredUp = false;
/* Remember, you can use a boolean variable as a condition directly. You do not need to write
if (canSeePlayer == true), you can just write if (canSeePlayer) */
if (canSeePlayer){
    if (!playerPoweredUp){
        System.out.println("Attack!");
    }else {
        System.out.println("Run away!");
    }
}else{
    System.out.println("Wander.");
}

/* Assume you have access to two boolean variables, isSnowing, and isRaining, and one
double variable, temperature. isSnowing is true when it’s snowing and false otherwise,
isRaining is true when it’s raining and false otherwise, and temperature gives the outdoor
temperature in degrees Fahrenheit. Write code that prints “Let’s stay home.” if it’s raining,
snowing, or below 50 degrees Fahrenheit (10 degrees Celsius), and prints “Let’s go out!”
otherwise.
Starting code:
Assume these can have any value:
boolean isSnowing = false;
boolean isRaining = true;
double temperature = 60.0;
TODO: print "Let’s stay home." if its raining, snowing or
below 50 degrees and print "Let’s go out!" otherwise.  */

boolean isSnowing = false;
boolean isRaining = true;
double temperature = 60.0;
if (isSnowing || isRaining || temperature < 50){
    System.out.println("Let's stay home.");
}else {
    System.out.println("Let's go out!");
}


/*Assume you have access to a double variable called time. Write code that assigns a different
value to the String variable timeOfDay based on the value of time in hours. If time is
between 5 and 12, including 5 but not including 12, set timeOfDay to “morning”. If time is
between 12 and 20, including 12 but not including 20, set timeOfDay to “daytime”. Finally,
if the time variable does not satisfy either condition, set timeOfDay to “night”.
Starting code:
Assume this could have any value between 0 and 24:
int time = 18;
String timeOfDay;
TODO: set timeOfDay to the correct String value. */

int time = 18;
String timeOfDay;

if ( time >= 5 && 12 > time){
    timeOfDay = "morning";
    System.out.println("morning");
} else if (12 <= time && time < 20) {
    timeOfDay = "daytime";
    System.out.println("daytime");
} else {
    timeOfDay = "night";
    System.out.println("night");
}

/* Assume you have access to an integer variable called dayOfTheWeek and a boolean variable
called holiday, which is true when it is a holiday and false on normal days. Write Java
code that prints “Wake up at 7:00” on weekdays that are not holidays, and prints “Sleep
in!” on weekends and holidays. For the variable dayOfTheWeek, use this key:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday
Starting code:
//Assume these could have any value: */
int dayOfWeek = 5;
boolean holiday = false;
if (dayOfWeek > 0 && dayOfWeek < 6){
    if (holiday == false){
        System.out.println("Wake up at 7:00");
    }
}else {
    System.out.println("Sleep in!");
}

if (dayOfWeek > 0 && dayOfWeek < 6 && !holiday){
    System.out.println("Wake up at 7:00");
}else {
    System.out.println("Sleep in!");
}

/* Assume the int variable dayOfWeek has some value, and that it follows this rule:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday
Declare a String variable called schedule and write a switch statement that gives schedule
a different value based on the day of the week. For Monday, give it the value “Gym in the
morning.” For Tuesday give it the value “Class after work.” For Wednesday, give it the value
“Meetings all day.” For Thursday give it the value “Work from home.” For Friday, give it
the value “Game night after work.” For Saturday and Sunday, give it the value “Free!” This
should also be the default value.
OR (optional): decide what to assign schedule for each day based on your own weekly
schedule!
Starting code:
//Assume this can have any value from 1 to 7:
int dayOfWeek = 1;
//TODO: declare a String variable called schedule.
//TODO: write a switch statement that give schedule a different
//value for each day of the week based on the dayOfWeek variable.
//Don’t forget to "break" after each case, and don’t forget to
//provide a default case! */

String schedule;
switch (dayOfWeek){
    case 1: schedule = "Gym in the morning.";
    break;
    case 2: schedule = "Class after work.";
    break;
    case 3: schedule = "Meetings all day.";
    break;
    case 4: schedule = "Work from home.";
    break;
    case 5: schedule = "Game night after work.";
    break;
    case 6: case 7: default: schedule = "Free!";
    break;
}



    }
}
