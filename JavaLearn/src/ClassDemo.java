

class Box123 {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String args[]) {
        Box123 mybox = new Box123();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}
