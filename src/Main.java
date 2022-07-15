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

        //Задание 3

        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;

        int resultBananas = bananas * 80;
        double resultMilk = milk * 1.05;
        int resultIceCream = iceCream * 100;
        int resultEggs = eggs * 70;

        double totalWeightGramms = resultBananas + resultMilk + resultIceCream + resultEggs;
        System.out.println("Общий вес этого спорт-завтрака " + totalWeightGramms + " грамм");

        double totalWeightKg = totalWeightGramms / 1000;
        System.out.println("Общий вес этого спорт-завтрака " + totalWeightKg + " килограмм");

        //Задание 4

        short weight1 = 250;
        short weight2 = 500;
        short finalWeight = 7000;

        int resultWeight1 = finalWeight / weight1;
        int resultWeight2 = finalWeight / weight2;
        int averageWeight = (resultWeight1 + resultWeight2) / 2;

        System.out.println("Спортсмену потребуется " + resultWeight1 + " дней, для того чтобы похудеть");
        System.out.println("Спортсмену потребуется " + resultWeight2 + " дней, для того чтобы похудеть");
        System.out.println("В среднем, спортсмену потребуется " + averageWeight + " день, для того чтобы похудеть");

        //Задание 5

        float masha = 67_760;
        float denis = 83_690;
        float kristina = 76_230;
        int percent = 10;

        //Высчитываем 10% от старого дохода
        float masha10 = (masha / 100) * percent;
        float denis10 = (denis / 100) * percent;
        float kristina10 = (kristina / 100) * percent;

        //Считаем новый ежемесячный доход каждого сотрудника
        float mashaResult = masha + masha10;
        float denisResult = denis + denis10;
        float kristinaResult = kristina + kristina10;

        //Получаем разницу старого и нового годового дохода Машы
        float oldIncomeMasha = masha * 12;
        float newIncomeMasha = mashaResult * 12;
        float differenceMasha = newIncomeMasha - oldIncomeMasha;

        //Получаем разницу старого и нового годового дохода Дениса
        float oldIncomeDenis = denis * 12;
        float newIncomeDenis = denisResult * 12;
        float differenceDenis = newIncomeDenis - oldIncomeDenis;

        //Получаем разницу старого и нового годового дохода Кристины
        float oldIncomeKristina = kristina * 12;
        float newIncomeKristina = kristinaResult * 12;
        float differenceKristina = newIncomeKristina - oldIncomeKristina;

        System.out.println("Маша теперь получает " + mashaResult + " рублей в месяц. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denisResult + " рублей в месяц. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaResult + " рублей в месяц. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}