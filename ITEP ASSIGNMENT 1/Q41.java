class CylinderVolume {
    public static void main(String args[]) {

        double diameter = 30;
        double height = 50;
        double pi = 3.14;

        double radius = diameter / 2;
        double volume = pi * radius * radius * height;

        System.out.println("Volume of the cylinder = " + volume + " cm^3");
    }
}
