public abstract class Transport {
    public static void main(String[] args) {
//-------------------------------------------
//      Легковые авто
        Car car = new Car();
            car.cartype = "Хэтчбэк";
            car.brand = "Peugeot";
            car.maxspeed = 180;
            car.passengers = 4;
            car.powerhp = 120;
            car.rashodfuel = 7;
            car.massa=1360;

        System.out.println(car.details());
//        System.out.println(car.;);
       car.trace();
//--------------------------------------------
//      Грузовой транспорт
        Track track = new Track();
              track.brand="Volvo";
              track.maxload=20;
              track.massa=7000;
              track.powerhp=500;
              track.rashodfuel=30;
              track.maxspeed=110;
              track.wheels=16;
        System.out.println(track.details());
//--------------------------------------------
//      Гражданский воздушный
        Civil civil=new Civil();
        civil.businessclass=true;
        System.out.println(civil.details());
        civil.businessclass();
//--------------------------------------------
//      Военный воздушный
        Military military=new Military();
        System.out.println(military.details());
        military.pifpaf();
        military.katapultsystem();

    }

    double powerhp;//мощность, лс
    double maxspeed;//максимальная скорость
    int massa;//масса ТС
    String brand;//производитель


    public String details() {
        return " Производитель: " + brand +"\n"+
                " Максимальная скорость, км/ч: " + maxspeed +"\n"+
                " Масса, кг: " + massa +"\n"+
                " Мощность, кВт: " + kwatt() +"\n"+
                " Мощность, ЛС: " + powerhp+"\n";
    }

    public double kwatt() {
        double powerkwt = 0.74 * powerhp;
        return powerkwt;
    }


}

