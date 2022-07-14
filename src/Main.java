public class Main {
    public static void main(String[] args) {
        //Задание 1

        byte firstValue = 7;
        System.out.println(firstValue);
        short secondValue = 243;
        System.out.println(secondValue);
        int thirdValue = 356_765;
        System.out.println(thirdValue);
        long fourthValue = 4563L;
        System.out.println(fourthValue);
        float fifthValue = 1.9345f;
        System.out.println(fifthValue);
        double sixthValue = 5.78321;
        System.out.println(sixthValue);
        boolean seventhValue = 10 < 5;
        System.out.println(seventhValue);
        char eighthValue = 43;
        System.out.println(eighthValue);

        //Задание 2

        double firstBoxer = 78.2;
        double secondBoxer = 82.7;

        double summResult = firstBoxer + secondBoxer;
        double diffResult = secondBoxer - firstBoxer;
        System.out.println("Общий вес двух бойцов " + summResult + " кг");
        System.out.println("Разница между весами бойцов " + diffResult + " кг");
    }
}