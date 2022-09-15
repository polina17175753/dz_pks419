public class Main {
    public static void main(String[] args) {
        Tool[] tools = new Tool[3];
        tools[0] = new Drum(2);
        tools[1] = new Guitar(4);
        tools[2] = new Tube(27);

        for(Tool tool:tools){
            tool.play();
        }
    }
}