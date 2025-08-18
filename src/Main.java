//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1//
        int firstFriday = 5;
        for (int i = firstFriday;i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        //Задача 2//
        int distance = 0;
        int allDistance = 42195;
        do {
            distance +=500;
            int a = allDistance-distance;
            System.out.println("Держитесь! Осталось "+a+"метров");
        } while (distance<(allDistance-500));

        for (;distance <= allDistance; distance += 500) {
            int b = allDistance-distance;
            System.out.println("Держитесь! Осталось "+b+"метров");
        }

        //Задача 3//
        int money = 2700;
        int days = 1;
        int dailyPayment = 100;
        while (money>dailyPayment){
            days++;
            if(days%5==0){
                continue;
            }
            money-=dailyPayment;
        }
        System.out.println(days-1);

        money=2700;
        for (days=1;money>dailyPayment;days++){
            if(days%5==0){
                continue;
            }
            money-=dailyPayment;
        }
        System.out.println(days-1);

        //Задача 4//
        int month = 0;
        int total = 0;
        do{
            total+=15000;
            month++;
            if(month%6==0){
                total+=total*0.07;
            }
           if(total>=12000000){
                break;
            }
        }while(true);
        System.out.println("Для накопления 12000000 нужно "+month+" месяцев");


        //Задача 5//
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge<100){
            minute++;
            if(minute%10==0){
                overheats++;
                continue;
            }
            if(overheats==3){
                break;
            }
            charge+=2;
        }
        System.out.println("Время зарядки составило "+minute+" минут");
    }
}