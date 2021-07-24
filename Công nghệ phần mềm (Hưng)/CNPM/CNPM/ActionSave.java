package CNPM;

public class ActionSave implements ActionListernerCommand {
	private Document doc;
	public ActionSave (Document doc)
	{
		this.doc = doc;
	}
	public void execute()
	{
		doc.save();
	}
}
