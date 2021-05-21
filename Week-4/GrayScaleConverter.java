/**
 * Create a gray scale version of an image by setting all color components of each pixel to the same value.
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
	//I started with the image I wanted (inImage)
	public ImageResource makeGray(ImageResource inImage) {
		//I made a blank image of the same size
		ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
		//for each pixel in outImage
		for(Pixel pixel : outImage.pixels()){
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			int average = (inPixel.getRed()+ inPixel.getGreen()+ inPixel.getBlue())/3;
			pixel.setRed(average);
			pixel.setGreen(average);
			pixel.setBlue(average);
		}
			return outImage;
	}

	public void testGray() {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource ir = new ImageResource(f);
			ImageResource gray = makeGray(ir);
			gray.draw();
			gray.setFileName("gray-" + ir.getFileName());
			gray.save();
		}
	}
	public static void main(String[] args){
		GrayScaleConverter grayScaleConverter = new GrayScaleConverter();
		grayScaleConverter.testGray();
	}
}
