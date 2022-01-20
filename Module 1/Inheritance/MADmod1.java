package Inheritance;

public class MADmod1{

    public static void main(String[] args){
        // Requirement One
        double testVar = 5;
        double testResult = testMethod(testVar);
        System.out.println("The result of testMethod after passing " + testVar + " is: " + testResult);
        System.out.println("----");

        //Requirement Two
        Focus myCar = new Focus();
        myCar.drive();
        myCar.park();
        System.out.println(myCar.getYear());
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getType());
        System.out.println(myCar.getTireSize());
    }

    private static double testMethod(double x){
        return x*2.1;
    }
}

