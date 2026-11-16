
/*
    Program Name : Display Numbers from 1 to 10

    Description :
    Write a Java program to create a user-defined function named Display() that displays numbers from 1 to 10
    using a for loop.

    Function Name : Display()

    Logic :
    1. Initialize a counter variable iCnt.
    2. Use a for loop starting from 1.
    3. Repeat the loop until iCnt reaches 10.
    4. Display each number using printf().

    Main Function :
    Call the Display() function from main().
*/
import java.util.*;

class Display {
    public int iNo1;

    public Display(int A) {
        iNo1 = A;
    }

    public void DisplayX() {
        int iCnt = 0;

        System.out.println("Numbers Are : ");
        for (iCnt = 1; iCnt <= 10; iCnt++) {

            System.out.println(iCnt);
        }
    }
}

class Program_01 {
    public static void main(String Arr[]) {

        int iValue1 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue1 = sobj.nextInt();

        Display dobj = new Display(iValue1);
        dobj.DisplayX();

        sobj.close();

    }
}