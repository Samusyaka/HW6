import java.util.Scanner;

public class Civil extends AirTransport {
   static int passengers;//количество пассажиров
    boolean businessclass;//наличие бизнесс-класса


    public String details() {
        return super.details()+
                " Количество пассажиров: "+passengers;
//                " Наличие бизнесс-класса: "+businessclass+"\n";
    }

    public static void loadPassengers(){
        System.out.println("Введите количество пассажиров");
        Scanner scanner=new Scanner(System.in);
        float loading = scanner.nextFloat();
        if (passengers>=loading){
            System.out.println("Самолет загружен");
        }
        else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public void businessclass() {
        System.out.print(" Наличие бизнесс-класса");
        if (businessclass == true) {
            System.out.println(": имеется\n");
        } else {
            System.out.println(": отсутствует\n");
        }
    }

}
