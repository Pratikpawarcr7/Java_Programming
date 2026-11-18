
/*
    Program Name : Display Factors of a Number
    Description  : Accept a number and display the Perfect Number.
    Function     : DisplayFactor()
*/
import java.util.*;;

class Chk_Factors {

    public int iNo;

    public Chk_Factors(int A) {
        iNo = A;
    }

    public boolean Diplay_Factors() {

        int iCnt = 1;
        int iSum = 0;

        System.out.println("Factors of " + iNo + " Are : ");
        for (iCnt = 1; iCnt < iNo; iCnt++) {

            if (iNo % iCnt == 0) {

                System.out.println(iCnt);
                iSum = iSum + iCnt;

            }

        }

        System.out.println("Addition : " + iSum);

        if (iSum == iNo) {
            return true;
        } else {
            return false;
        }

    }

}

public class Program_09 {
    public static void main(String args[]) {

        int iValue = 0;
        boolean iRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Chk_Factors dobj = new Chk_Factors(iValue);
        iRet = dobj.Diplay_Factors();

        if (iRet == true) {
            System.out.println(iValue + " is a Perfect Number ");
        } else {
            System.out.println(iValue + " is a Not Perfect Number ");
        }

        sobj.close();

    }
}