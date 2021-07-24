package CNPMII;

public class ThinPen implements Pen {
	final BrushSize brushSize = BrushSize.THIN;
	private String color = null;
	public void setColor (String color)
	{
		this.color = color;
	}
	public void draw (String content)
	{
		System.out.println ("Drawing Thing content in color : " + color);
	}
}
