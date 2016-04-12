import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      
      JFrame frame = new JFrame();

      final MoveableShape shape1
            = new CarShape(0, 0, CAR_WIDTH);
      final MoveableShape shape2
            = new CarShape(0, 60, CAR_WIDTH);
      
      ShapeIcon icon = new ShapeIcon(ICON_WIDTH, ICON_HEIGHT);
      
      icon.addShape(shape1);
      icon.addShape(shape2);
        
      final JLabel label = new JLabel(icon);
      //frame.setLayout(new FlowLayout());
      frame.add(label);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(800,200));
      frame.setVisible(true);

      final int DELAY = 10;
      // Milliseconds between timer ticks
      javax.swing.Timer t = new javax.swing.Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               label.repaint();
            }
         });
      t.start();
   }
   
   
   
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}