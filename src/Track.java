import java.util.Scanner;

public class Track extends EarthTransport {
    double maxload;//грузоподъемность

    public String details() {

        return super.details()+
                " Максимальная грузоподъемность, т: "+maxload+"\n";
    }
    public void loadTrack(){
        System.out.println("Введите количество груза");
        Scanner scanner=new Scanner(System.in);
        float loading = scanner.nextFloat();
        if (maxload>=loading){
            System.out.println("Грузовик загружен");
        }
        else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}

