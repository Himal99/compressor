package com.file.compressor;// Java Program to Capture full
// Image of Screen
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;

public class Screenshot {
    public static final long serialVersionUID = 1L;
    public static void main(String[] args)
    {
        try {
            Thread.sleep(120);
            Robot r = new Robot();

            // It saves screenshot to desired path
            String path = "C:\\Users\\Himal Rai\\Desktop\\test.jpg";

            // Used to get ScreenSize and capture image
            Rectangle capture =
                    new Rectangle(new Dimension(200,200));
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
