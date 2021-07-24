package CNPM;



public class AdapterPatternDemo {
	private ActionListernerCommand openDoc;
	private ActionListernerCommand saveDoc;
	public AdapterPatternDemo (ActionListernerCommand openDoc, ActionListernerCommand saveDoc)
	{
		this.openDoc = openDoc;
		this.saveDoc = saveDoc;
	}
	public void clickOpenDoc ()
	{
		System.out.println ("Open document");
		openDoc.execute();
	}
	public void clickSaveDoc ()
	{
		System.out.println ("Save document");
		saveDoc.execute();
	}
}

