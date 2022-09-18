/**
 * This code asks for the user to input two numbers. The numbers are then added
 * together, multiplied, and taken the average of. The addedAnswer is then
 * squared
 * and taken the square root of.
 */
public class AverageCalculator {
  public static void main(String[] args) {

    int[] numArr;

    int sum = 0;

    
    // ask user how many numbers they plan to insert in to the array
    System.out.printf("How many will you be entering?");

    // the user inputs a number. This is the number of items that will be placed in
    // the array
    int insertedNumber = TextIO.getInt();

    // declare array
    numArr = new int[ insertedNumber];

    makeArr(numArr, insertedNumber);

    System.out.printf("Here are the numbers that you entered: ");

    printNumbers(numArr);
    

    System.out.printf("%nThe average of your numbers is: %1.1f. %n" , findAverage(sum, insertedNumber, numArr));

  }

  // this method creates an array with all the numbers inputed by the user
  public static int[] makeArr(int [] numArr, int insertedNumber) {

    for (int i = 0; i < insertedNumber; i++) {
      System.out.printf("Enter number %d: %n", i);

      numArr[i] = TextIO.getlnInt();
    }
    
    return numArr;

  }

  // this method prints all of the numbers in the array
  public static void printNumbers(int [] numArr){
    for(int i=0; i< numArr.length; i++){
      System.out.printf(" %d ",numArr[i]);
    }
  }
  
  // this method adds each number that is in the array together and find the average
  public static double findAverage(int sum, int insertedNumber, int[] numArr){
    for(int i=0;i< numArr.length;i++){
      sum = sum + numArr[i];
    }

    System.out.printf("%nThe sum of your numbers is: %d. ", sum);
    double average = (double) sum/ (double) insertedNumber;

    return average;
  }
}
