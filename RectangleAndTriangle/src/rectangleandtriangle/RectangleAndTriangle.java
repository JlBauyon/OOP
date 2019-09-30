/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleandtriangle;

/**
 *
 * @author BESSLABSS
 */import java.util.Scanner;
public class RectangleAndTriangle {

    /**
     * @param args the command line arguments
     */
  public static void main(String [] args){
        Box box = new Box(0,0,0);
        
        box.boxA();
        
        
        System.out.println("Box a: " + box.toString());
        System.out.println("Box a surface area: "+ box.getArea());
        
        
        
        box.boxB();
        System.out.println("Box b: " + box.toString());
        System.out.println("Box b surface area: "+ box.getArea());
        
        System.out.println("Check if Box a and Box b are equal? " + box.equals());
        
        IsoscelesRight test = new IsoscelesRight(3);
        Geometric4Tester tst = new Geometric4Tester();
        
        System.out.println("IsoscelesRight c" + test.toString());
        System.out.println("IsoscelesRight c area: " + test.getArea());
        
        
        System.out.println("IsoscelesRight d" + test.toString());
        System.out.println("IsoscelesRight d area: " + test.getArea());
        
        
        
        System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + test.equals());
    }
    
    
        //end of main method
    
    
    
    //rectangle2 method
    
    public static class Rectangle2{
        int area, a, b, c;
        String ans;
        
        public int getArea(){
            area = a*b*c;
            return area;
        }
        
        public String toString(){
            return "[Box: length = " + b + ",width = " + a +", height = " + c + "]";
        }
        
    } //end of rectangle2
    
    
    
    //box class subclass of rectangle
    public static class Box extends Rectangle2{
        private int height;
        
        public Box(int l, int w, int h){
            Rectangle2 box = new Rectangle2();
        }
        
        public int getHeight(){
            return height;
        }
        
        public int getArea(){
            area = (2*a*b) + (2*b*c) + (2*c*a);
            return area;
        }
        
        public int boxA(){
            a = 3;
            b = 2;
            c = 4;
            return a + b + c;
        }
        
        public int boxB(){
            a = 7;
            b = 4;
            c = 4;
            return a + b + c;
        }
        
        public String equals(){
            if (boxA() == boxB()){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
        
    }
    
    //end of box class
  
    
    //Triangle class
    public static class Triangle{
        double equalSide = 3, area, sideC;
        String ans;
        
        public String equals(){
            if (equalSide == equalSide){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
    
        public double getArea(){
            area = (equalSide*equalSide)/2;
            return area;
        }
        
    } // end of triangle
    //isosceles class subclass of triangle
    public static class IsoscelesRight extends Triangle {
        
        public IsoscelesRight(double equalSize){
            
        }
        
        public double getEqualSide(){
            return equalSide;
        }
        
        public double getNotEqualSide(){
            sideC = equalSide*Math.sqrt(2);
            return sideC;
        }
        
        public String toString(){
            return "[IsoscelesRight: equal_side = " + getEqualSide() + ",not_equal side = " + getNotEqualSide();
        }
    }
    //end of isoceles
    
    public static class Geometric4Tester{
        
        public Geometric4Tester(){
            IsoscelesRight tst = new IsoscelesRight(3);
            tst.equalSide = 3.0;
        }
    }

}
