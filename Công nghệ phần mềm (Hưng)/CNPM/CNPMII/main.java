package CNPMII;

public class main {
	public static void main(String[] args) 
    {
        Pen redThinPen = PenFac.getThickPen("RED"); 
        redThinPen.draw("Hello World !!");
         
        Pen yellowThinPen = PenFac.getMediumPen("YELLOW"); 
        yellowThinPen.draw("Hello World !!");
         
        Pen blueThinPen = PenFac.getThinPen("BLUE");      
        blueThinPen.draw("Hello World !!");
         
        System.out.println(redThinPen.hashCode());
        System.out.println(yellowThinPen.hashCode()); 
        System.out.println(blueThinPen.hashCode());
    }
}
