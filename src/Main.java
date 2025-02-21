public class Main {
    public static void main(String[] args) {
// Задание 1
        int propInt = 2_000_000_000;
        byte propByte = 100;
        short propShort = 30000;
        long propLong = 9_000_000_000_000_000_000L;
        float propFloat = 1.0f;
        double propDouble = 1.0;

        System.out.println(       "Значение переменной propInt с типом int равно " + propInt +
                                "\nЗначение переменной propByte с типом byte равно " + propByte +
                                "\nЗначение переменной propShort с типом short равно " + propShort +
                                "\nЗначение переменной propLong с типом long равно " + propLong +
                                "\nЗначение переменной propFloat с типом float равно " + propFloat +
                                "\nЗначение переменной propDouble с типом double равно " + propDouble +
                                "\n") ;
//Задача 2

        float propertyFloat1 = 27.12f;
        long propertyLong = 987_678_965_549L;
        float propertyFloat2 = 2.786f;
        char propertyChar1 = 569;
        short propertyShort = -159;
        char propertyChar2 = 27897;
        byte propertyByte = 67;


//Задача 3
        byte numberOfStudentsLP = 23; // Людмила Павловна
        byte numberOfStudentsAS = 27; // Анна сергеевна
        byte numberOfStudentsEA = 30; // Екатерина Андреевна

        int numberOfSheets = 480; //Количество листов

        int numberOfSheetsPerPerson = numberOfSheets/ (numberOfStudentsAS +
                numberOfStudentsEA + numberOfStudentsLP); //количество листов бумаги на одного ученика

        System.out.println("На каждого ученика рассчитано " + numberOfSheetsPerPerson + " листов бумаги\n");

//Задача 4

        byte numberOfBottlesPerMinute = 16 / 2; //производительность машины в минуту
        int numberOfBottlesInTwentyMinutes = numberOfBottlesPerMinute * 20; //произвела машина за 20 минут
        int numberOfBottlesPerDay = numberOfBottlesPerMinute * 60 * 24; //произвела машина за 1 день
        int numberOfBottlesInThreeDays = numberOfBottlesPerDay * 3; //произвела машина за 3 дня
        int numberOfBottlesPerMonth = numberOfBottlesPerDay * 30; //произвела машина за 1 месяц (30 дней)

        System.out.println("За 20 минут машина произвела " + numberOfBottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + numberOfBottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + numberOfBottlesInThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + numberOfBottlesPerMonth + " штук бутылок\n");

//Задача 5

        byte numberOfRooms = 120 / ( 2 + 4 );
        int numberOfWhitePaint = numberOfRooms * 2;
        int numberOfBrownPaint = numberOfRooms * 4;

        System.out.println("В школе, где " + numberOfRooms + " классов, нужно " + numberOfWhitePaint +
                " банок белой краски и " + numberOfBrownPaint + " банок коричневой краски");

//Задача 6

        byte gramInOneBanana = 80; //грамм в одном банане
        byte gramIn100mlOfMilk = 105;//грамм в 100 мл молока
        byte gramInOneIce = 100;//грамм в одном брикете мороженного
        byte gramInOneEgg = 70;//грамм в одном яйце

        //общая масса в блюде
        int weightOfGram =  5 * gramInOneBanana + 2 * gramIn100mlOfMilk + 2 * gramInOneIce + 4* gramInOneEgg;
        float weightOfKG = (float) weightOfGram/ 1000;

        System.out.println("Всего блюда получилось " + weightOfGram + " гр");
        System.out.println("В килограммах " + weightOfKG + " кг\n");

//Задание 7

        int weight = 7000; // вес который необходимо сбросить в граммах
        int minWeight = 250; // минимум грамм похудения за день
        int maxWeight = 500; // максимум грамм похудения за день

        int minDays = weight / maxWeight; //минимум дней для похудения
        int maxDays = weight / minWeight; // максимум дней для похудения

        int averageDays = (minDays + maxDays) / 2; // среднее количество дней

        System.out.println("максимум потребуется " + maxDays + " дней для похуения на 7 кг");
        System.out.println("минимум потребуется " + minDays + " дней");
        System.out.println("В среднем потребуется " + averageDays + " дней\n");

//Задание 8
        byte interest = 10;
        int salaryMasha = 67_760; //зп маши в месяц
        int salaryDen = 83_690; //зп дена в месяц
        int salaryKris = 76_230; //зп кристины в месяц

        //Зарплата в месяц после повышения
        int newSalaryMasha = salaryMasha * (100 + interest)/100;
        int newSalaryDen = salaryDen * (100 + interest)/100;
        int newSalaryKris = salaryKris * (100 + interest)/100;

        //годовая прибавка к зарплате
        int annualIncreaseMasha = (newSalaryMasha - salaryMasha) * 12;
        int annualIncreaseDen = (newSalaryDen - salaryDen) * 12;
        int annualIncreaseKris = (newSalaryKris - salaryKris) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
                + annualIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на "
                + annualIncreaseDen + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на "
                + annualIncreaseKris + " рублей");

    }
}