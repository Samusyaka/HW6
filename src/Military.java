public class Military extends AirTransport {
    boolean katapultsystem;//наличие системы катапультирования
    int rocket = 3;//количество ракет

    public String details() {
        return super.details() +
                " Количество ракет: " + rocket + "\n" +
                " Наличие системы катапультирования: " + katapultsystem + "\n";
    }

    public void pifpaf() {
        System.out.println("Начальное количество боеприпасов: "+rocket);
        while (rocket > 0) {
            rocket--;
            System.out.println("Ракета пошла, остаток боеприпасов: "+rocket);
        }

        if (rocket == 0) {
            System.out.println("Боеприпасы закончились");
        }
    }

    public void katapultsystem() {
        System.out.println("Проверка системы катапультирования");
        if (katapultsystem == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
