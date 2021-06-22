public class EarthTransport extends Transport {
    int wheels;//кол-во колес
    double rashodfuel;//расход топлива

    public String details() {
        return super.details()+
                " Количество колес: " + wheels +"\n"+
                " Расход топлива, л/100км: " + rashodfuel+"\n";
    }
}