import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
   An icon that contains a moveable shape.
*/
public class ShapeIcon implements Icon
{
  
   public ShapeIcon(int width, int height)
   {
       this.width = width;
       this.height = height;
       myArray = new ArrayList<MoveableShape>();
 
   }
   
   public void addShape(MoveableShape shape) 
   {
     myArray.add(shape);
   }
     
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }
   
   public void paintIcon(Component c, Graphics g, int x, int y)
   {
     for (MoveableShape s : myArray)
     { Graphics2D g2 = (Graphics2D) g;
       s.translate(1,0);
       s.draw(g2);
        
     }      
   }

   private int width;
   private int height;
   private ArrayList<MoveableShape> myArray;
   

}

