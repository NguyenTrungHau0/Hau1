package CNPM;



public class ActionOpen implements ActionListernerCommand {
	private Document doc;
	public ActionOpen(Document doc)
	{
		this.doc = doc;
	}
	public void execute()
	{
		doc.open();
	}
}
