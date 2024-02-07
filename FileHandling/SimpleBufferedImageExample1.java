package FileHandling;

    import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

    public class SimpleBufferedImageExample1 {

        public static void main(String[] args) {
            int width = 300;
            int height = 200;

            // Create a BufferedImage with specified width and height
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // Get graphics context from the image
            Graphics g = bufferedImage.getGraphics();

            // Draw a red rectangle on the image
            g.setColor(Color.BLUE);
            g.fillRect(50, 50, 200, 100);

            // Dispose of the graphics context
            g.dispose();

            // Save the image to a file
            try {
                File outputfile = new File("example.png");
                ImageIO.write(bufferedImage, "png", outputfile);
                System.out.println("Image saved successfully.");
            } catch (IOException e) {
                System.err.println("Error saving image: " + e.getMessage());
            }
        }
    }




