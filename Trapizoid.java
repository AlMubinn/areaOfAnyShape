public class Trapizoid extends Shape{

    int base2;
    Trapizoid(int base,int height,int base2){
        super(base,height);
        this.base2=base2;
    }
    void area (){
        double r = ((base+base2)*height)/2;
        System.out.println("Trapizoid Area: " +r);

    }
}
