import Entity.Travel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Travel> bus = new ArrayList();
        bus.add(new Travel("01А", "Краснодар - Белореченск", "Усть-Лабинск, с.Белое","12:30","Понедельник, Среда, Пятница, Воскресенье","12"));
        bus.add(new Travel("02А", "Краснодар - Майкоп", "Усть-Лабинск, Красногвардейское, Белореченск","8:50","Каждый день ","21"));
        bus.add(new Travel("03А", "Краснодар - Армавир", "Белореченск, Майкоп, Апшеронск","18:15","Понедельник, Пятница, Суббота","9"));
        bus.add(new Travel("01В", "Белореченск - Краснодар", "с.Белое, г.Усть-Лабинск","14:50","Понелельник, Среда, Пятница, Воскресенье","15"));
        bus.add(new Travel("02В", "Майкоп - Краснодар", "Белореченск, с.Красногвардейское, Белореченск","11:25","Понелельник, Среда, Пятница, Воскресенье","7"));

        Scanner scanner = new Scanner(System.in);

        int a = 1;


        byte menu;

        do {

            Menu.mainMenu();
            menu = scanner.nextByte();
            switch (menu) {
                case 1:
                    Menu.printMenu(bus);
                    break;
                case 2:
                    bus.add(Menu.addMenu());
                    break;
                case 3:
                    Menu.deleteMenu(bus);
                    break;
                case 4:
                    Menu.searchMenu(bus);
                    break;
                case 5:
                    System.out.println("Всего доброго :)");
                    break;
                default:
                    System.out.println("Такой пункт меню не найден");

            }

        }while (menu!=5);


    }
}