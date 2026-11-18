
/*
    Program Name : Display Factors of a Number
    Description  : Accept a number and display the Addition of all its factors.
    Function     : DisplayFactor()
*/
import java.util.*;;

class Chk_Factors {

    public int iNo;

    public Chk_Factors(int A) {
        iNo = A;
    }

    public int Diplay_Factors() {

        int iCnt = 1;
        int iSum = 0;

        System.out.println("Factors of " + iNo + " Are : ");
        for (iCnt = 1; iCnt < iNo; iCnt++) {

            if (iNo % iCnt == 0) {

                System.out.println(iCnt);
                iSum = iSum + iCnt;

            }

        }
        return iSum;
    }

}

public class Program_08 {
    public static void main(String args[]) {

        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Chk_Factors dobj = new Chk_Factors(iValue);
        iRet = dobj.Diplay_Factors();

        System.out.println("Addition is " + iRet);

        sobj.close();

    }
}