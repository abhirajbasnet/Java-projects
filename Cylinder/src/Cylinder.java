public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height >= 0){
            this.height = height;
        }else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        double volume = getArea() * height;
        //System.out.println("The volume of the cylinder is " + volume);
        return volume;
    }
}
