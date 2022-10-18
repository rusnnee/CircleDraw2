import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class Drawing extends Canvas
{
    private Frame f;
    private Circle circ;

    private Rect rect;

    public Drawing(){

        Point pCirc = new Point(200,200);
        Color cCirc = new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        int r = 100;
        circ = new Circle(pCirc, cCirc, r);


        Point pRect = new Point(100,100);
        Color cRect = new Color(0x229965);// The RGB number comprises three bytes: red, green and blue
        int wRect = 100;
        int hRect = 40;
        rect = new Rect (pRect, cRect, wRect, hRect);


        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
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
    }

    public void paint (Graphics g){
        circ.draw(g);
        rect.draw(g);
    }
}
