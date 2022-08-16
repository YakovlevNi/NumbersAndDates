import java.util.Scanner;

public class Main {
    private static final int TUCK_MAX_CAPACITY = 12;
    private static final int CONTAINER_MAX_CAPACITY = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        int truck = 1;
        int boxAmount = Integer.parseInt((String) boxes);
        int container = 1;
        int boxLeft = boxAmount;
        int i;

        if (boxAmount <= 0) {
            truck = 0;
            container = 0;
        } else if (boxAmount >= 1) {
            System.out.println("Грузовик: " + truck);
            System.out.println("\tКонтейнер: " + container);
            for (i = 1; i <= boxAmount; ++i) {
                boxLeft--;
                System.out.println("\t\tЯщик: " + i);
                if (i % (TUCK_MAX_CAPACITY * CONTAINER_MAX_CAPACITY) == 0 && boxLeft > 0) {
                    truck += 1;
                    System.out.println("Грузовик: " + truck);
                }
                if ((i % CONTAINER_MAX_CAPACITY) == 0 && boxLeft > 0) {
                    container += 1;
                    System.out.println("\tКонтейнер: " + container);
                }
            }
        }
        System.out.println("Необходимо:" + "\n" + "грузовиков - " + truck + " шт." + "\n" + "контейнеров - " + container + " шт.");
    }
}


// TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
// пример вывода при вводе 2
// для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
