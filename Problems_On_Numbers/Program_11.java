/*
   Write a C program to display numbers from 1 to N.
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

class Program_11 {
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