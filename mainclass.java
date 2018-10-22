package homm;

public class mainclass
{
    private static Fenetre f;

    public static void main(String[] args) throws InterruptedException
    {
	// TODO Auto-generated method stub
	System.out.println("Salut le monde");
	f = new Fenetre();
	
	while(true)
	{
	    f.panel.repaint();
	    Thread.sleep(5);
	}
    }

}
