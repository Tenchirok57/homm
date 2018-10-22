package homm;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre implements valeurs
{
    public JFrame window_game = new JFrame("Homm");
    public Panel panel = new Panel();

    private int mouseX, mouseY;
    private int radius = 100;

    public Fenetre()
    {
	window_game.setSize(iLargeur, iHauteur);
	
	window_game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window_game.setVisible(true);
	window_game.add(panel);
	panel.setVisible(true);
	window_game.addMouseMotionListener(new MouseMotionListener()
	{
	    
	    @Override
	    public void mouseMoved(MouseEvent e)
	    {
		// TODO Auto-generated method stub
		
		mouseX = e.getX();
		System.out.println("" + mouseX);
		mouseY = e.getY();
		System.out.println("" + mouseY);
		
	    }
	    
	    @Override
	    public void mouseDragged(MouseEvent e)
	    {
		// TODO Auto-generated method stub
		
	    }
	});
    }
    
    public class Panel extends JPanel
{
    @Override
    public void paint(Graphics g)
    {
        // TODO Auto-generated method stub
        super.paint(g);
        g.fillOval(mouseX-(radius/2), mouseY-(3*radius/4), radius, radius);  }
}

	
    
}
