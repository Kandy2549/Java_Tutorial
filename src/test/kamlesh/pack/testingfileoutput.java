package test.kamlesh.pack;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.Math;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class testingfileoutput {

	 public static void main(String[] args) throws IOException {

         //Read Image to a byte array
         BufferedImage bImage = ImageIO.read(new File("E://kamlesh_23092018//Test//First1.jpg"));
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         ImageIO.write(bImage, "bmp", bos );
         byte [] data = bos.toByteArray();
         System.out.println("ground: " + data);

         BufferedImage bImage2 = ImageIO.read(new File("E://kamlesh_23092018//Test//First2.jpg"));
         ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
         ImageIO.write(bImage2, "bmp", bos2 );
         byte [] data2 = bos2.toByteArray();
         System.out.println("Back: " + data2);

         //byte [] data3 = (byte[]) (Math.abs(data2 - data)); // really wished this worked
         //System.out.println("Subtracted Bytes: " + data3);

        /* ByteArrayInputStream j = new ByteArrayInputStream(data3);
         BufferedImage bImage3;
         bImage3 = ImageIO.read(j)
         ImageIO.write(bImage3, "bmp", new File("Subtracted.bmp"));
         System.out.println("image created");*/



  }


}
