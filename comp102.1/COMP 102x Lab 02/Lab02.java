
import java.util.Scanner;
public class Lab02
{
    public static void main(String[] args) 
    {
    float width;
    float height;
    float area;
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the width of the triangle: ");
    width = in.nextInt();
    System.out.print("Enter the height of the triangle: ");
    height = in.nextInt();
    
    area = ((width * height)/2);
    
    System.out.println("The area of a triangle is: " + area);
    
   }
}
