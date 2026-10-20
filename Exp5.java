// basil206
class Area {
    double findArea(double r){ return 3.14*r*r; }
    double findArea(double l,double b){ return l*b; }
    double findArea(double b,double h,boolean tri){ return 0.5*b*h; }
}
class OverloadDemo {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Circle: "+a.findArea(5));
        System.out.println("Rectangle: "+a.findArea(4,6));
        System.out.println("Triangle: "+a.findArea(3,7,true));
    }
}
