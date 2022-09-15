public class Drum implements Tool{
    int Size;
    Drum( int Size){ this.Size = Size;}
    @Override
    public void play() {
        System.out.printf("Играет барабан, размер: %s %s", Size, "  ");
    }
    @Override
    public String toString() {
        return "Drum{" +
                "size='" + Size + '\'' +
                '}';
    }
}
