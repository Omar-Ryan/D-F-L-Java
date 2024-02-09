import java.util.Scanner;

/**
 * LearnJava
 */
public class LearnJava {

    public static void main(String[] args) {
        /*
         * 
         * try (Scanner input = new Scanner(System.in)) {
         * int Length, Width, Area;
         * System.out.println("enter length");
         * Length = input.nextInt();
         * System.out.println("enter width");
         * Width = input.nextInt();
         * Area = Length * Width;
         * System.out.printf("the area = %d", Area);
         * }
         */

        /*
         * 
         * try (Scanner inputDetails = new Scanner(System.in)) {
         * String firstName, lastName;
         * int age;
         * System.out.println("Enter Your first Name");
         * firstName = inputDetails.nextLine();
         * System.out.println("Enter Your last Name");
         * lastName = inputDetails.nextLine();
         * System.out.println("Enter Your Age");
         * age = inputDetails.nextInt();
         * System.out.printf("my name %s\n", firstName);
         * System.out.printf("my Last name %s\n", lastName);
         * System.out.printf("my age %d\n", age);
         * // System.out.println("Name = " + firstName + " " + lastName);
         * // System.out.println("Age = " + age);
         * }
         */

        /*
         * 
         * try (Scanner inputNum = new Scanner(System.in)) {
         * int num1, num2, result;
         * String numOperation;
         * // System.out.println("Enter the number of operation 1|2|3 ");
         * System.out.println("Enter the number of operation +|-|** ");
         * numOperation = inputNum.nextLine();
         * switch (numOperation) {
         * case "+":
         * System.out.println("Enter The Number-1");
         * num1 = inputNum.nextInt();
         * System.out.println("Enter The Number-2");
         * num2 = inputNum.nextInt();
         * result = num1 + num2;
         * System.out.println("The result-1 = " + result);
         * break;
         * case "-":
         * System.out.println("Enter The Number-1");
         * num1 = inputNum.nextInt();
         * System.out.println("Enter The Number-2");
         * num2 = inputNum.nextInt();
         * if (num1 >= num2) {
         * result = num1 - num2;
         * System.out.println("The result-2 = (+) " + result);
         * } else {
         * result = num2 - num1;
         * System.out.println("The result-2 = (-) " + result);
         * }
         * break;
         * case "**":
         * System.out.println("Enter The Number");
         * num1 = inputNum.nextInt();
         * result = num1 * num1;
         * System.out.println("the result-3 = " + result);
         * break;
         * default:
         * System.out.println("the number invalid");
         * break;
         * }
         * }
         */
        /*
         * try (Scanner letters = new Scanner(System.in)) {
         * System.out.println("Enter the letter");
         * char letter = letters.next().charAt(0);
         * switch (letter) {
         * case 'o':
         * case 'a':
         * case 'e':
         * case 'i':
         * case 'u':
         * System.out.println("The Letter is Vowel");
         * break;
         * default:
         * System.out.println("The Letter is not Vowel");
         * break;
         * }
         * };
         */

        /*
         * try (Scanner inputTicket = new Scanner(System.in)) {
         * int weightBag, priceOfIncWeight = 0, numOfPassengers, totalIncWeight,
         * totalPrice = 0;
         * 
         * System.out.println("Enter Numbers of passengers");
         * numOfPassengers = inputTicket.nextInt();
         * 
         * for (int i = 1; i <= numOfPassengers; i++) {
         * 
         * System.out.println("Enter Type of ticket f|b|e");
         * char typeOfTicket = inputTicket.next().charAt(0);
         * switch (typeOfTicket) {
         * case 'f':
         * case 'F':
         * System.out.println("Enter The weight of bag for passenger no. " + i);
         * weightBag = inputTicket.nextInt();
         * if (weightBag > 30) {
         * priceOfIncWeight = (weightBag - 30) * 10;
         * totalPrice += priceOfIncWeight;
         * }
         * System.out.println("The price of increment weight = " + priceOfIncWeight +
         * " $");
         * break;
         * case 'b':
         * case 'B':
         * System.out.println("Enter The weight of bag for passenger no. " + i);
         * weightBag = inputTicket.nextInt();
         * if (weightBag > 25) {
         * priceOfIncWeight = (weightBag - 25) * 10;
         * totalPrice += priceOfIncWeight;
         * }
         * System.out.println("The price of increment weight = " + priceOfIncWeight +
         * " $");
         * break;
         * case 'e':
         * case 'E':
         * System.out.println("Enter The weight of bag for passenger no. " + i);
         * weightBag = inputTicket.nextInt();
         * if (weightBag > 20) {
         * priceOfIncWeight = (weightBag - 20) * 10;
         * totalPrice += priceOfIncWeight;
         * }
         * System.out.println("The price of increment weight = " + priceOfIncWeight +
         * " $");
         * break;
         * 
         * default:
         * System.out.println("the type ticket not found please check again");
         * break;
         * }
         * }
         * totalIncWeight = totalPrice / 10;
         * System.out.println("the total increment weight A1 = " + totalIncWeight +
         * " KG");
         * System.out.println("the total price of all increment weight A1 = " +
         * totalPrice + " $");
         * }
         */

        int arrNum[] = { 7, -11, 8, 4, -2, 5, 1, -9 };
        int sum = 0, count = 0, average;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > 0) {
                sum += arrNum[i];
                count++;
            }
        }
        average = sum / count;
        System.out.println("the sum = " + sum);
        System.out.println("the average = " + average);

        try (Scanner valueList = new Scanner(System.in)) {

            int[][] arrNumbers = new int[5][3];
            int sumArr = 0;

            // Input Numbers
            // fillArray(arrNumbers)
            // or
            System.out.println("the Array is fill");
            for (int i = 0; i < arrNumbers.length; i++) {
                for (int j = 0; j < arrNumbers[0].length; j++) {
                    System.out.println("Enter the Number :" + i + "=>" + j);
                    arrNumbers[i][j] = valueList.nextInt();
                }
            }
            // print Numbers
            // printArray(arrNumbers)
            // or
            System.out.println("the Array print");
            for (int i = 0; i < arrNumbers.length; i++) {
                for (int j = 0; j < arrNumbers[0].length; j++) {
                    System.out.println(arrNumbers[i][j]);
                }
            }

            // Sum Number from Array
            for (int i = 0; i < arrNumbers.length; i++) {
                for (int j = 0; j < arrNumbers[0].length; j++) {
                    sumArr += arrNumbers[i][j];
                }
            }
            System.out.println("the sum = " + sumArr);
        }
    }

}
// Used Class
/*
 * static Scanner valueList = new Scanner(System.in); // move top the main
 * public static void fillArray(int[][] list) {
 * for (int i = 0; i < list.length; i++) {
 * for (int j = 0; j < list[0].length; j++) {
 * System.out.println("Enter the Number :" + i + "=>" + j);
 * list[i][j] = valueList.nextInt();
 * }
 * }
 * }
 * //
 * public static void printArray(int[][] list) {
 * for (int i = 0; i < list.length; i++) {
 * for (int j = 0; j < list[0].length; j++) {
 * System.out.println(list[i][j]);
 * }
 * }
 * }
 */
