
public class Point {
     public static void main (String[] args) {
        Point point = new Point(3,4);
        point.translate(1,3);
        point.scale(0.5,0.5);
        System.out.println("x ="+point.getX()+ ", y = "+ point.getY());
     }
     public double x;
     public double y;

     public Point(double x, double y){
         this.x=x;
         this.y=y;
     }
     public void translate(double dx, double dy){
        x=dx+x;
        y+=dy;
     }
     public  void scale(double sx, double sy){
         x*=sx;
         y*=sy;
     }
     public double getX(){
         return x;
     }
     public double getY(){
         return y;
     }
}
