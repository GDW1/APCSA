/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  /**Method for testing keepOnlyBlue*/
  public static void testKeepOnlyBlue(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testHorizontal(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  public static void testNegate(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negativePic();
    beach.explore();
  }
  public static void testGrayscale(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayScale();
    beach.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("gu.jpg");
    swan.edgeDetectionDiag(10);
    swan.explore();
  }
  public static void testMirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void seagullTester(){
    Picture snowman = new Picture("seagull.jpg");
    snowman.mirrorSeagull();
    snowman.explore();
  }
  public static void testCopy(){
    Picture snowman = new Picture("640x480.jpg");
    Picture stardust = new Picture("ZiggyStardust.jpg");
    Picture theDoof = new Picture("theDoof.jpg");
    Picture wizard = new Picture("Wizard.jpg");
    snowman.copy(stardust, 0, 300, 70, 70, 300, 300);
    snowman.copy(theDoof, 200, 100, 300, 300, 700, 500);
    snowman.copy(wizard, 0, 0, 0, 0, 300, 300);
    snowman.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testHorizontal();
    //testMirrorVerticalRightToLeft();
    // testZeroBlue();
    //testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorTemple();
    // testMirrorArms();
    // seagullTester();
    // testMirrorDiagonal();
    // testCollage();
    // testCopy();
     testEdgeDetection();
    // testEdgeDetection2();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}