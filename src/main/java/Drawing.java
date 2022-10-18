import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class Drawing extends Canvas
{
    private Frame f;
    private Circle circ;

    public Drawing(){

        Point p = new Point(200,200);
        Color c = new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        int r = 100;

        circ = new Circle(p, c, r);

        f = new Frame("My Window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }

    public void paint (Graphics g){
        circ.draw(g);
    }
}
