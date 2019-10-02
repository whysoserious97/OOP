package Labs.Lab2.Task1;
public class Box {
   public double height;
   public double width;
   public double depth;

    public Box () {

        this.height = this.width = this.depth = 1;
    }

    public Box (double num) {

        this.height = this.width = this.depth = num;
    }

    public Box (double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getVolume() {
        return this.height*this.width*this.depth;
    }

    public double getArea() {
        return 2*(this.height*this.width + this.width*this.depth + this.width*this.depth);
    }
}
