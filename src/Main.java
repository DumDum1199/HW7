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

        int allDistance = 42195;
        int distance = 0;
        do {
            int a = allDistance-distance;
            System.out.println("Держитесь! Осталось "+a+" метров");
            distance +=500;
        } while (distance<=allDistance);

        for (int distance2=0; distance2 <= allDistance; distance2 += 500) {
            int b = allDistance-distance2;
            System.out.println("Держитесь! Осталось "+b+" метров");
        }

        //Задача 3//
        int money = 1101;
        int days = 1;
        int dailyPayment = 100;
        while (money>0){
            if(days%5==0) {
                days++;
                continue;
            }
            money-=100;
            if (money<dailyPayment) continue;
            days++;
        }
        System.out.println(days);

        int money2 = 1101;
        int days2 = 1;
        for (;money2>=dailyPayment;days2++){
            if(days2%5==0){
                continue;
            }
            money2-=dailyPayment;
        }
        System.out.println(days2-1);

        //Задача 4//
        int month = 0;
        double total = 0;
        do{
            month++;
            total+=15000;
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
            if(overheats==3){
                break;
            }
            minute++;
            if(minute%10==0){
                overheats++;
                minute+=2;
                System.out.println("Зарядка прекращена. Текущий заряд: "+charge+" %");
                continue;
            }
            charge+=2;
        }
        System.out.println("Время зарядки составило "+minute+" минут");
    }
}