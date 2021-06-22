import java.util.Scanner;

public class Car extends EarthTransport {
    String cartype; //тип кузова
    int passengers; //кол-во пассажиров

    public String details() {
        return super.details() +
                " Количество пассажиров: " + passengers + "\n" +
                " Тип кузова: " + cartype + "\n";
    }

//    private double factrashodfuel(double trace) {
//        double factrashodfuel = (rashodfuel * trace / 100) * 2;
//        return factrashodfuel;
//    }

    public void trace() {
        System.out.println("Введите время поездки: ");
        Scanner scanner=new Scanner(System.in);
        double time = scanner.nextDouble();
        double trace = time * maxspeed;
        double factrashodfuel=trace/100*rashodfuel;
        System.out.println("За время " + time + " ч, автомобиль " + brand + ", двигаясь с максимальной скоростью " + maxspeed +" км/ч проедет \n"
                + trace + " км и израсходует " + factrashodfuel + " литров топлива.\n");
    }


}


