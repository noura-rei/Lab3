package exo8;

public class Wall {
    private double height ;
    private double width ;
    public Wall(){
        this.height = 0;
        this.width = 0;
    }
    public Wall(double w,double h){
        if(h<0) this.height = 0 ;
        if(w<0) this.width = 0 ;
        this.height = h ;
        this.width = w ;
    }

    public double getWidth(){
        return this.width ;
    }

    public double getHeight(){
        return this.height ;
    }

    public void setWidth(double w){
        if(w<0) this.width=0;
        else this.width = w;
    }
    public void setHeight(double h){
        if(h<0) this.height = 0;
        else this.height = h;
    }
    public double getArea(){
        return this.height*this.width;
    }

    public static void main(String[] args){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
