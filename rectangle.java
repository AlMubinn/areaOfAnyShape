class rectangle extends Shape{
    rectangle(int base , int height){
     super(base, height);
    }
    @Override
    void area(){
        double r = base*height;
        System.out.println("Rectangle Area: "+r);
    }
}
