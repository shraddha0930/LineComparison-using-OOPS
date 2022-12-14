package day8Practiceproblem.LineComparisonUsingOOPS;

public class CompareLine extends EqualCheck{

    public void compareTo(double linelength1, double linelength2)
    {
        if (linelength1 == linelength2) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (linelength1 > linelength2) {
            System.out.println("Line 1 is greater than to Line 2");
        } else {
            System.out.println("Line 2 is greater than to Line 1");
        }

    }

    public static void main(String[] args) {
        CompareLine obj = new CompareLine();
        obj.EqualCheck();
        obj.compareTo(obj.linelength1,obj.linelength2);

    }

}