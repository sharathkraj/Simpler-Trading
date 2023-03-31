package screenShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Step_definitions.Step_definitions_Login;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class imageCompare {

	public static void options() throws IOException, InterruptedException {
		
		 
		  String expectedImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Options.jpg";
		  String actualImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Options.jpg";
		  
		  File expectedImageFile = new File(expectedImagePath);
		  File actualImageFile = new File(actualImagePath);

		  BufferedImage expectedImage = ImageIO.read(expectedImageFile);  
		  BufferedImage actualImage = ImageIO.read(actualImageFile);

		  ImageDiffer imgDiff = new ImageDiffer();

		  ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		  if (diff.hasDiff()) {
		   System.out.println("Images are NOT same");
		  } else {
		   System.out.println("Images are same");
		  }
		
	}
	

	
	
	public static void bookmark() throws IOException, InterruptedException {
		
		 
		  String expectedImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Bookmark.jpg";
		  String actualImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Bookmark.jpg";
		  
		  File expectedImageFile = new File(expectedImagePath);
		  File actualImageFile = new File(actualImagePath);

		  BufferedImage expectedImage = ImageIO.read(expectedImageFile);  
		  BufferedImage actualImage = ImageIO.read(actualImageFile);

		  ImageDiffer imgDiff = new ImageDiffer();

		  ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		  if (diff.hasDiff()) {
		   System.out.println("Images are NOT same");
		  } else {
		   System.out.println("Images are same");
		  }
		
	}

	public static void bookmark_remove() throws IOException, InterruptedException {
		
		 
		  String expectedImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Removebookmark.jpg";
		  String actualImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Removebookmark.jpg";
		  
		  File expectedImageFile = new File(expectedImagePath);
		  File actualImageFile = new File(actualImagePath);

		  BufferedImage expectedImage = ImageIO.read(expectedImageFile);  
		  BufferedImage actualImage = ImageIO.read(actualImageFile);

		  ImageDiffer imgDiff = new ImageDiffer();

		  ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		  if (diff.hasDiff()) {
		   System.out.println("Images are NOT same");
		  } else {
		   System.out.println("Images are same");
		  }
		
	}
	
	public static void Home_search() throws IOException, InterruptedException {
		
		 
		  String expectedImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Homesearch.jpg";
		  String actualImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\Homesearch.jpg";
		  
		  File expectedImageFile = new File(expectedImagePath);
		  File actualImageFile = new File(actualImagePath);

		  BufferedImage expectedImage = ImageIO.read(expectedImageFile);  
		  BufferedImage actualImage = ImageIO.read(actualImageFile);

		  ImageDiffer imgDiff = new ImageDiffer();

		  ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		  if (diff.hasDiff()) {
		   System.out.println("Images are NOT same");
		  } else {
		   System.out.println("Images are same");
		  }
		
	}
	
	
//	public static void compare() throws IOException, InterruptedException {
//		
//		 
//		  String expectedImagePath = "C:\\Users\\fbdev\\OneDrive\\Desktop\\simpler\\bookmark.jpg";
//		  String actualImagePath = "C:\\Users\\fbdev\\Videos\\screen\\bookmark.jpg";
//		  
//		  File expectedImageFile = new File(expectedImagePath);
//		  File actualImageFile = new File(actualImagePath);
//
//		  BufferedImage expectedImage = ImageIO.read(expectedImageFile);  
//		  BufferedImage actualImage = ImageIO.read(actualImageFile);
//
//		  ImageDiffer imgDiff = new ImageDiffer();
//
//		  ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
//
//		  if (diff.hasDiff()) {
//		   System.out.println("Images are NOT same");
//		  } else {
//		   System.out.println("Images are same");
//		  }
//		
//	}

}
