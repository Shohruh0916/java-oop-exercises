package regularPolygon;
class RegularPolygan {
     int n;
     double side;
     double x;
     double y;

     RegularPolygan(){
         this.n=3;
         this.side=1;
         this.x=0;
         this.y=0;
     }
     RegularPolygan(int n,double side){
         this.side=side;
         this.n=n;
     }
     RegularPolygan(int n,double side,double x, double y){
         this.n=n;
         this.side=side;
         this.x=x;
         this.y=y;
     }
     double getPerimeter(){
        return n*side;
     }
     double getArea(){
         return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
     }
}
