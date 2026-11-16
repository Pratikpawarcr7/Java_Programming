
/*
    Program Name : Check Divisibility by 3 & 5

    Description :
    Accept a number from the user and check whether
    it is divisible by 5 using a Boolean function.

    Function Name : CheckDivisible()

    Return Type : bool
*/
import java.util.*;

class Chk_Divisible {
    public int iNo;

    public Chk_Divisible(int A) {

        iNo = A;
    }

    public boolean Divisible() {

        if (((iNo % 3) == 0) && ((iNo % 5) == 0)) {
            return true;
        } else {
            return false;
        }

    }
}

public class Program_05 {
    public static void main(String Arr[]) {

        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        boolean bFlag = false;

        System.out.println("Enter the Number : ");
        iValue1 = sobj.nextInt();

        Chk_Divisible dobj = new Chk_Divisible(iValue1);

        bFlag = dobj.Divisible();

        if (bFlag == true) {

            System.out.println(iValue1 + " Is Divisible By 3 and 5");
        } else {
            System.out.println(iValue1 + " Is Not Divisible By 3 and 5");
        }

        sobj.close();

    }
}