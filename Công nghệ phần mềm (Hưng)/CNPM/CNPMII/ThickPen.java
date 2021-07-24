package CNPMII;

public class ThickPen implements Pen {
	final BrushSize brushSize = BrushSize.THICK;
	private String color = null;
	public void setColor (String color)
	{
		this.color = color;
	}
	public void draw (String content)
	{
		System.out.println ("Drawing Thick content in color : " + color);
	}
}
