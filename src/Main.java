public class Main {
    public static void main(String[] args) {
        leapYear1();
        application();
        delivery();
    }

    public static void leapYear1() {
        int leapYear = 100;
        if (leapYear % 4 == 0 || leapYear % 100 == 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " Год високосный");
        } else {
            System.out.println(leapYear + " Год не високосный");

        }
    }

    public static void application() {
        int year = 2016;
        int operatingSistem = 0;
        if (operatingSistem == 0) {
            if (year <= 2015) {
                System.out.println("Установите облегченную версию для андроид по ссылке");
            }
            if (year >= 2015) {
                System.out.println(" Установите версию для андроид по ссылке");
            }

        }
        if (operatingSistem == 1) {
            if (year <= 2015) {
                System.out.println("Установите облегченную версию для айфон по ссылке");
            }

            if (year >= 2015) {
                System.out.println(" Установите версию для айфон по ссылке");
            }
        }

    }

    public static void delivery() {
        int distance = 220;
        if (distance <= 20) {
            System.out.println(" Доставка 1 день");
        }
        if (distance > 20 && distance <= 60) {
            System.out.println(" Доставка 2 дня");
        }
        if (distance > 60 && distance <= 100) {
            System.out.println(" Доставка 3 дня");
        }
        if (distance >= 100) {
            System.out.println(" Доставка невозможна");
        }

    }
}


