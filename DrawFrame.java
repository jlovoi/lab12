
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.GRAY, true);
        
        // Ears:
        RightTriangle innerEar1 = new RightTriangle(new Point(260, 180), 40, 120, Color.PINK, true);
        RightTriangle innerEar2 = new RightTriangle(new Point(540, 180), -40, 120, Color.PINK, true);
        RightTriangle outerEar1 = new RightTriangle(new Point(253, 180), 60, 140, Color.GRAY, true);
        RightTriangle outerEar2 = new RightTriangle(new Point(547, 180), -60, 140, Color.GRAY, true);
        
        // Eyes:
        Oval leftPupil = new Oval(new Point(330, 225), 25, 60, Color.BLACK, true);
        Oval leftEye = new Oval(new Point(330, 225), 50, 70, Color.WHITE, true);
        Oval rightPupil = new Oval(new Point(470, 225), 25, 60, Color.BLACK, true);
        Oval rightEye = new Oval(new Point(470, 225), 50, 70, Color.WHITE, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300), 30, Color.BLACK, true);
        
        // Mouth & Tongue:
        PolyLine mouthL = new PolyLine(new Point(300, 315), new Point(400, 350), 40, Color.BLACK, true);
        PolyLine mouthR = new PolyLine(new Point(500, 315), new Point(400, 350), 40, Color.BLACK, true);
        Oval tongue = new Oval(new Point(420, 380), 35, 70, Color.RED, true);

        // Collar:
        Oval collar = new Oval(new Point(400, 500), 450, 50, Color.BLUE, true);
        Circle pendant = new Circle(new Point(400, 500), 80, Color.RED, true);
        Circle etch = new Circle(new Point(400, 500), 60, Color.WHITE, false);
        
        // Square around the dog:
        Circle outer = new Circle(new Point(400, 300), 725, Color.BLACK, false);
        Square s = new Square(new Point(400, 300), 510, Color.BLUE, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outerEar1);
        drawPanel.addShape(innerEar1);
        drawPanel.addShape(outerEar2);
        drawPanel.addShape(innerEar2);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(rightPupil);
        drawPanel.addShape(nose);
        drawPanel.addShape(mouthL);
        drawPanel.addShape(mouthR);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collar);
        drawPanel.addShape(pendant);
        drawPanel.addShape(etch);
        drawPanel.addShape(outer);
        drawPanel.addShape(s);
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
    	
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
