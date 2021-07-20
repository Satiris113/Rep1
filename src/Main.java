import Exclusion.OperationExclusion;
import Exclusion.ValueExclusion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        String numval1 = scanner.next();
        final String operation = scanner.next();
        String numval2 = scanner.next();
        try {
            if ((Rome.romeToInt(numval1) == 0) && (Rome.romeToInt(numval2) == 0)) {
                System.out.println(Operations.result(Integer.parseInt(numval1), Integer.parseInt(numval2), operation));
            } else {
                System.out.println(Rome.intToRome(Operations.result(Rome.romeToInt(numval1), Rome.romeToInt(numval2), operation)));
            }
        }
        catch (ValueExclusion valE){
            System.out.println("Числа не верны!");
        }
        catch (OperationExclusion operE){
            System.out.println("Операция не верна!");
        }



    }


}
