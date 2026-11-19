/*
  Write a C program to check whether a number is positive or negative.
*/

import java.util.*;;

class Chk_Factors {

    public int iNo;

    public Chk_Factors(int A) {
        iNo = A;
    }

    public void Diplay_Factors() {

        if (iNo > 0) {
            System.out.println(iNo + " is Positive Number ");
        } else {
            System.out.println(iNo + " is Nagative Number ");
        }
    }

}

public class Program_14 {
    public static void main(String args[]) {

        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Chk_Factors dobj = new Chk_Factors(iValue);
        dobj.Diplay_Factors();

        sobj.close();

    }
}