public class Aspirant  extends Student {
    String nauchnayaRabota;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String nauchnayaRabota) {
        super(firstName, lastName, group, averageMark);
        this.nauchnayaRabota = nauchnayaRabota;
    }
    @Override
    int getscolarship() {
        return averageMark == 5 ? 20000 : 18000;

    }
}
