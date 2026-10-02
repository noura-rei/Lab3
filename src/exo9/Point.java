package exo9;
//import Math ;

public class Point {
    private int x ;
    private int y ;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x ;
    }
    public int getY(){
        return this.y ;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public double distance(Point y){
        double d1 = Math.pow(y.x-this.x,2);
        double d2 = Math.pow(y.y-this.y,2);
        return Math.sqrt(d1+d2) ;
    }
    public double distance(int x,int y){
        double d1 = Math.pow(x-this.x,2);
        double d2 = Math.pow(y-this.y,2);
        return Math.sqrt(d1+d2) ;
    }

    public static void main(String[] args){
        Point p1 = new Point(1,2) ;
        Point p2 = new Point(3,5) ;
        System.out.println(p1.distance()) ;
        System.out.println(p1.distance(p2));
    }
}
