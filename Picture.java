
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("black");

        // Draw my picture
        Circle c = new Circle(100, 230, 90, Canvas.getColor("blue"));
        c.makeVisible();
        Arc b = new Arc(200, 0, 0, 30, 120, Canvas.getColor("yellow"));
        b.makeVisible();
        Triangle a = new Triangle(90, 120, 200, 200, Canvas.getColor("magenta"));
        a.makeVisible();
        Rect d = new Rect(100, 300, 400, 450, Canvas.getColor("red"));
        d.makeVisible();

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}