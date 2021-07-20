public enum Rome {
    I(1, "I"),
    IV(4, "IV"),
    V(5, "V"),
    IX(9, "IX"),
    X(10, "X"),
    XL(40, "XL"),
    L(50,"L"),
    XC(90, "XC"),
    C(100,"C"),
    CD(400, "CD"),
    D(500,"D"),
    CM(900, "CM"),
    M(1000,"M");


    private final int num;
    private final String i;



    Rome(int num, String i) {
        this.num = num;
        this.i = i;
    }

    public String getRome() {
        return i;
    }

    private static String getRomeNumWithInt(int num) {
        Rome rN[] = Rome.values();
        for (int i = 0; i < rN.length; i++) {
            if(rN[i].getNum() == num){
                return rN[i].getRome();
            }
        }
        return null;
    }

    public int getNum() {
        return num;
    }
    private static int getNumWithChar(String romeNum) {
        Rome rN[] = Rome.values();
        for (int j = 0; j < rN.length ; j++) {
            if (rN[j].getRome().equals(romeNum)){
                return rN[j].getNum();
            }
        }
        return 0;
    }


    public static int romeToInt(String num){
        Rome rN[] = Rome.values();
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            if(i == 0 || Rome.getNumWithChar(String.valueOf(num.charAt(i))) <= Rome.getNumWithChar(String.valueOf(num.charAt(i-1)))) {
                result += Rome.getNumWithChar(String.valueOf(num.charAt(i)));
            } else {
                result += Rome.getNumWithChar(String.valueOf(num.charAt(i))) - 2 * Rome.getNumWithChar(String.valueOf(num.charAt(i-1)));
            }
        }
        return result;
    }

    public static String intToRome(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += Rome.M.getRome();
            input -= 1000;        }
        while (input >= 900) {
            s += Rome.CM.getRome();
            input -= 900;
        }
        while (input >= 500) {
            s += Rome.D.getRome();
            input -= 500;
        }
        while (input >= 400) {
            s += Rome.CD.getRome();
            input -= 400;
        }
        while (input >= 100) {
            s += Rome.C.getRome();
            input -= 100;
        }
        while (input >= 90) {
            s += Rome.XC.getRome();
            input -= 90;
        }
        while (input >= 50) {
            s += Rome.L.getRome();
            input -= 50;
        }
        while (input >= 40) {
            s += Rome.XL.getRome();
            input -= 40;
        }
        while (input >= 10) {
            s += Rome.X.getRome();;
            input -= 10;
        }
        while (input >= 9) {
            s += Rome.IX.getRome();;
            input -= 9;
        }
        while (input >= 5) {
            s += Rome.V.getRome();;
            input -= 5;
        }
        while (input >= 4) {
            s += Rome.IV.getRome();;
            input -= 4;
        }
        while (input >= 1) {
            s += Rome.I.getRome();;
            input -= 1;
        }
        return s;
    }
}
