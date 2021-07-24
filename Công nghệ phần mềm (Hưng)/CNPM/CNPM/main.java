package CNPM;

public class main {
	public static void main (String[] args)
	{			
		Document doc = new Document();
		ActionListernerCommand clickOpen = new ActionOpen(doc);
		ActionListernerCommand clickSave = new ActionSave(doc);
		AdapterPatternDemo adapterpatterndemo = new AdapterPatternDemo(clickOpen, clickSave);
		adapterpatterndemo.clickOpenDoc();
		adapterpatterndemo.clickSaveDoc();
	}
}

