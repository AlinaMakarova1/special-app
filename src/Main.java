public class Main {
    public static void main(String[] args) {
        int CoffeAmount = 1250;

        int cocomilkAmound = 15;
        int sodamilkAmound = 10;

        int coppuciniMilkRequred = 60;
        int coppucinoCoffeRequred = 12;


        if (CoffeAmount >= coppucinoCoffeRequred && (cocomilkAmound || sodamilkAmound >= coppuciniMilkRequred) {
            System.out.println("Готовим капучино для вас!");
        } else {
            System.out.println("Ингредиентов недостаточно");
        }
    }
}
