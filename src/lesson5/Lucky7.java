package lesson5;

import TerminalIO.KeyboardReader;

public class Lucky7 {

    public static void main(String[] args) {

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int besturn, maxmoney = 0, n, money, turns = 1, total;
        besturn = 1;
        KeyboardReader reader = new KeyboardReader();
        n = reader.readInt("How much money are you starting with?  -->");
        money = n;
        while (true) {
            d1.roll();
            d2.roll();
            turns++;
            total = d1.getValue() + d2.getValue();
            if (total == 7) {
                money += 4;
            } else {
                money--;
            }
            if (maxmoney < money) {
                maxmoney = money;
                besturn = turns;
            }

            if (money == 0) {
                break;
            }

        }
        System.out.println("You started with $" + n);
        System.out.println("You are broke after " + turns + " turns.");
        System.out.println("You should have quit after turn " + besturn + " when you had " + maxmoney);

    }
}
