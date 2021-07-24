package CNPMII;

public class MediumPen implements Pen {
	final BrushSize brushSize = BrushSize.MEDIUM;
	private String color = null;
	public void setColor (String color)
	{
		this.color = color;
	}
	public void draw (String content)
	{
		System.out.println ("Drawing Medium content in color : " + color);
	}
}
