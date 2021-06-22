public class AirTransport extends Transport {
    double flysize;//размах крыльев
    double minlenthtofly;//минимальный взлетный путь

    public String details() {
        return super.details() +
                " Размах крыльев, м: " + flysize +"\n"+
                " Минимальная длина взлетно-посадочной полосы, м: " + minlenthtofly+"\n";
    }

}
