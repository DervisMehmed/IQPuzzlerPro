package ıqpuzzlerpro;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


/**
 *
 * 
 */
public class Piece4 extends  Pieces {
    
   Circle arrayOfCircles[];
    Shape shape3;
    public Shape createPiece() {
        
        int circleNumberX = 3 ;
        int circleNumberY = 2;
        int circleNumber = circleNumberX + circleNumberY ;
        arrayOfCircles = new Circle[circleNumber] ;
        int radius = 50 ;
        int diameter = radius + radius  ;
        int distance = diameter ;
        //array e ilk atılan sol alt olmalıdır
        //Yan yana cirlelar için SADECE
         for(int i=0;i<circleNumberX;i++)
         { 
          arrayOfCircles[i]=createCircle(radius,150.0f+distance,50.0f);
          distance = distance + diameter; 
          System.out.println("x"+i);
         }
         distance = diameter;

          for(int i=circleNumberX;i<circleNumber;i++)
         {
          arrayOfCircles[i]=createCircle(radius,150.0f+distance,50.0f+diameter);
          distance = distance + diameter + diameter;
          System.out.println("y"+i);
         }

         shape3 = createUnion(arrayOfCircles);
         shape3.setFill(Color.CADETBLUE);
         //handlerELİF ( shape3, arrayOfCircles );
         return shape3;
     
    }
    public void detectIntersection( Rectangle rec1, double[][] arx, double[][] ary, int row, int col, boolean[][] arf  ){
        //handlerZeynepHande ( shape3, arrayOfCircles, rec1, arx, ary, row, col, arf ); 
    }
}