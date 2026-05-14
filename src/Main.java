import java.time.YearMonth;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//Задача 1
        byte a = 0;
        short b = 150;
        int c = 300000;
        long d = 3000000000L;
        float e = 3.1234567f;
        double f = 0.0000004321;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

//Задача 2
        float g = 27.12f;
        long h = 987678965549L;
        float i = (float) 2.786;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

//Задача 3
        byte studentNumbClass1 = 23;
        byte studentNumbClass2 = 27;
        byte studentNumbClass3 = 30;
        short paper = 480;
        int studentNumbAll = studentNumbClass1 + studentNumbClass2 + studentNumbClass3;
        System.out.println("На каждого ученика рассчитано " + paper / studentNumbAll + " листов бумаги");
// Задача 4
        byte capacityPerMin = 16 / 2;
        int capacity20 = capacityPerMin * 20;
        System.out.println("За 20 минут машина произвела " + capacity20 + " штук бутылок");
        int capacityPerHour = capacityPerMin * 60;
        int capacityPerDay = capacityPerHour * 24;
        System.out.println("За 1 день машина произвела " + capacityPerDay + " штук бутылок");
        int capacityFor3Days = capacityPerDay * 3;
        System.out.println("За 3 дня машина произвела " + capacityFor3Days + " штук бутылок");
        int daysInMonth = YearMonth.of(2026, 5).lengthOfMonth();
        int capacityPerMonth = capacityPerDay * daysInMonth;
        System.out.println("За месяц машина произвела " + capacityPerMonth + " штук бутылок");
//Задача 5
        int cansTotal = 120;
        int cansWhitePerClass = 2;
        int cansBrownPerClass = 4;
        int numberOfClasses = cansTotal / (cansWhitePerClass + cansBrownPerClass);
        int numberOfWhiteCans = cansWhitePerClass * numberOfClasses;
        int numberOfBrownCans = cansBrownPerClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhiteCans + " банок белой краски и " + numberOfBrownCans + " банок коричневой краски");

//Задача 6
        int bananaWeight = 80;
        int milkWeight = 105;
        int icecreamWeight = 100;
        int eggWeight = 70;
        int bananas = bananaWeight * 5;
        int milk = milkWeight * 2;
        int icecream = icecreamWeight * 2;
        int eggs = eggWeight * 4;
        int recipe = bananas + milk + icecream + eggs;
        float recipeKg = (float) recipe / 1000;
        System.out.println("Вес спортзавтрака равен " + recipe + " грамм");
        System.out.println("Вес спортзавтрака равен " + recipeKg + " кг");
//Задача 7
        int goal = 7000;
        int prog1 = 250;
        int prog2 = 500;
        int daysProg1 = goal / prog1;
        int daysProg2 = goal / prog2;
        int daysAverage = (daysProg1 + daysProg2) / 2;
        System.out.println(daysProg1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(daysProg2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(daysAverage + " день может потребоваться в среднем на похудение");
//Задача 8
        int salaryMash = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        int yearSalaryMash = salaryMash * 12;
        int yearSalaryDen = salaryDen * 12;
        int yearSalaryKris = salaryKris * 12;
        double newSalaryMash = salaryMash + salaryMash * 0.1;
        double newSalaryDen = salaryDen + salaryDen * 0.1;
        double newSalaryKris = salaryKris + salaryKris * 0.1;
        double diffSalaryMash = newSalaryMash * 12 - yearSalaryMash;
        double diffSalaryDen = newSalaryDen * 12 - yearSalaryDen;
        double diffSalaryKris = newSalaryKris * 12 - yearSalaryKris;
        System.out.println("Маша теперь получает " + newSalaryMash + " рублей. Годовой доход вырос на " + diffSalaryMash + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на " + diffSalaryDen + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + diffSalaryKris + " рублей");

    }
}