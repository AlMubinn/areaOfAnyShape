class circle extends Shape{

 circle(int base , int height){
  super(base,base);
   }
   @Override
   void area(){
   double r =Math.PI*base*base;
   System.out.println("Circle Area: "+r);
   }

}
