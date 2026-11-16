/*
    Program Name : Display Numbers up to N

    Description :
    Write a Java program to accept one integer number from the user and display all numbers from 1
    up to the entered number using a for loop.

    Function Name : Display()

    Parameter : iNo - Accepts an integer number.

    Logic :
    1. Initialize the counter variable iCnt to 0.
    2. Start the for loop from 1.
    3. Repeat the loop until iCnt is less than
       or equal to iNo.
    4. Display each number using printf().
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
        for (iCnt = 1; iCnt <= iNo1; iCnt++) {

            System.out.println(iCnt);
        }
    }
}

class Program_02 {
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