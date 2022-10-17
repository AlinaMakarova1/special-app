public class Main {
    public static void main(String[] args) {
        int CoffeAmount = 1250;
        int MilkAmount = 10;

        int coppuciniMilkRequred = 60;
        int coppucinoCoffeRequred = 15;


        if (CoffeAmount >= coppucinoCoffeRequred && MilkAmount >= coppuciniMilkRequred) {
            System.out.println("Готовим капучино для вас!");
        } else {
            System.out.println("Ингредиентов недостаточно");
        }
    }
}
