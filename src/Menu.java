import Entity.Travel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
    static Scanner scanner;

    public Menu() {
    }
    public static void mainMenu() {
        System.out.println("Выберите действие: \n1. Показать все рейсы; \n2. Добавить рейс; \n3. Удалить рейс;\n4. Поиск рейсов;\n 5. Выход из программы.");
    }


    public static void printMenu(ArrayList<Travel>travel) {
        int i = 1;
        Iterator var2 = travel.iterator();

        while(var2.hasNext()) {
            Travel bus = (Travel) var2.next();
            int var1001 = i++;
            System.out.println("Рейс № " + var1001 + "\n" + bus.toString());
        }

    }
    public static Travel searchMenu(ArrayList<Travel> travel) {
        Travel result = null;
        String textSearch = "";
        System.out.println("Введите информацию о рейсе: ");
        textSearch = scanner.nextLine();
        Iterator var3 = travel.iterator();

        while(var3.hasNext()) {
            Travel bus = (Travel) var3.next();
            if (bus.getNumber_bus().equals(textSearch) || bus.getRoad().equals(textSearch) || bus.getMiddle().equals(textSearch) || bus.getTime().equals(textSearch) || bus.getDays().equals(textSearch) || bus.getFree_places().indexOf(textSearch)> -1) {
                result = bus;
                System.out.println(bus);
                break;
            }
        }

        if (result == null) {
            System.out.println("данный рейс не найден");
            return result;
        } else {
            return result;
        }
    }


    public static Travel addMenu() {
        Travel result = new Travel();
        System.out.println("Введите Номер рейса: ");
        result.setNumber_bus(scanner.nextLine());
        System.out.println("Введите маршрут: ");
        result.setRoad(scanner.nextLine());
        System.out.println("Введите пункты промежуточной посадки: ");
        result.setMiddle(scanner.nextLine());

        System.out.println("Введите время отправления автобуса(пример: 00.00) : ");
        result.setDays(scanner.nextLine());
        System.out.println("Введите кол-во свободных мест: ");
        result.setFree_places(scanner.nextLine());
        return result;


    }
    public static void deleteMenu(ArrayList travel) {
        System.out.println("Введите номер рейса для удаления");
        int busNumber = scanner.nextInt();
        if (busNumber >= 1 && busNumber <= travel.size()) {
            travel.remove(busNumber - 1);
            System.out.println("Рейс был успешно удален из базы.");
        } else {
            System.out.println("Неверный номер рейса! ");
        }

    }
    static {
        scanner = new Scanner(System.in);
    }

}

