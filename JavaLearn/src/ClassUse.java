
public class ClassUse {
    public static void main(String args[]) {
        Box321 mybox = new Box321();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.printf("Volume is %.2f", vol);

    }
}

class Box321 {
    double width;
    double height;
    double depth;
}