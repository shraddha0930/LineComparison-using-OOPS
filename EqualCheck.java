package day8Practiceproblem.LineComparisonUsingOOPS;

public class EqualCheck extends LineLength {
    double linelength1,linelength2;

    public void EqualCheck() {
        System.out.println("Line 1");
        linelength1 = LengthLine();
        System.out.println("Line 2");
        linelength2 = LengthLine();

        System.out.println("Lenght is line 1: "+linelength1);
        System.out.println("Lenght is line 2: "+linelength2);

        if (linelength1 == linelength2) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Both are Not Equal");
        }
    }

    public static void main(String[] args) {
        EqualCheck obj = new EqualCheck();
        obj.EqualCheck();
    }

}
