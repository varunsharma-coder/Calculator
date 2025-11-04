import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vector {
  private double x;
  private double y;

  // constructor for the class 
  public Vector (double x, double y){
    this.x = x;
    this.y = y;
  }
  // getter method for x 
  public double getX(){
return x;
    
  }
  // getter method for y
public double getY(){
  return y;
}
    // Setter method for x coordinate
  public void setX(double x){
    this.x = x;
  }
  // Setter method for y coordinate
  public void setY(double y){
    this.y = y;
  }
// method to find distance of two vectors
  public double distance (Vector other){
    double dx = x - other.getX();
    double dy = y - other.getY();
    return Math.sqrt(dx * dx + dy * dx);
  }
  // override the toString method to get vector as a string
   @Override 

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}

