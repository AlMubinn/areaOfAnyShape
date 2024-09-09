public abstract class Shape {
    int base;
    int height;
    Shape(int base, int height){
        this.base=base;
        this.height=height;
    }
    abstract void area();
}
