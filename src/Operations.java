import Exclusion.OperationExclusion;
import Exclusion.ValueExclusion;

public class Operations {

    public static int result(int numval1, int numvual2, String operation) throws OperationExclusion, ValueExclusion {
        if((numval1 < 1) || (numval1 > 10) || (numvual2 < 1) || (numvual2 > 10)) {
            throw new ValueExclusion();
        }
        int res = 0;
        switch (operation) {
            case ("+"):
                res = Calculator.sum(numval1, numvual2);
                break;
            case ("-"):
                res = Calculator.sub(numval1, numvual2);
                break;
            case ("*"):
                res = Calculator.mul(numval1, numvual2);
                break;
            case ("/"):
                res = Calculator.del(numval1, numvual2);
                break;
            default:
                throw new OperationExclusion();

        }
        return res;
    }
}
