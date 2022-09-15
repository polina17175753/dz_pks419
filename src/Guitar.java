public class Guitar implements Tool {
    int NumberOfStrings;
    Guitar( int NumberOfStrings){ this.NumberOfStrings = NumberOfStrings;}
    @Override
    public void play() {
        System.out.printf("Играет Гитара, количество струн: %s %s ", NumberOfStrings, "  ");
    }
}
