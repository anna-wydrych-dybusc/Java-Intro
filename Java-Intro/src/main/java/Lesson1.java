public class Lesson1 {
    public static void main(String[] args) {
        int passengers;
        passengers = 0;
        passengers = passengers + 5;
        passengers = passengers - 3;
        passengers = passengers - 1 + 5;
        System.out.println(passengers);

        String driver;
        driver = "Hamish";
        int letters = driver.length();
        System.out.println(letters);

        driver = driver.toUpperCase();
        System.out.println(driver);

        String driverFirstName;
        driverFirstName = "Hamish";
        String driverLastName;
        driverLastName = "Blake";
        String driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops +1;
        fare = fare +3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println("The bus made $"+fare+" after "+stops+" stops.");

        String language = "java";
        String feeling = "Love";
        feeling = feeling.toLowerCase();
        language = language.toUpperCase();
        System.out.print("I " + feeling + " " + language);

        int x =2+3;
        int y =4-5;
        int z =x*y;
        System.out.println(z);


        double paid = 10;
        double change = 3.25;
        double tip1 = (paid-change)*0.2;
        double tip2 = paid - change *0.2;
        System.out.println("Tip1 " +tip1+" is not tip2 " +tip2);

        /*the following code estimates the number of students, that will sign up for course*/
        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
//cast to integer
        int approx = (int) future;
        System.out.println(approx);

        int a = 5;
        int b = 2;
        double div = a/b;
        System.out.println(div);
        double accurate = (double) a/b;
        System.out.println(accurate);

// problems part 1
        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance);

        System.out.println(2.0 * (5/2));

        int day = 25;
        String month = "february";
        System.out.println("My birthday is in " + day + "th of " +month);

        String firstName = "Anna";
        String lastName = "Wydrych-Dybuść";
        String fullName = firstName + " " + lastName;
        int numberOfLetters = fullName.length();
        System.out.println("Hello, my name is " +fullName+ ".");
        System.out.println(("There are "+numberOfLetters+ " letters in my name."));

        double fahrenheit = 67.0;
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println(celsius);


    }
}
