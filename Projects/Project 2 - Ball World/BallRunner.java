
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * This is the BallRunner class. This class creates a canvas and loads ball into it. that move and collides
 */
public class BallRunner
{
    static int i = 0;
    /**
     * This method uses a ball bot array to find where in said array an index ihas a value of null and has space for a ball to be lodaed in
     * @param BallBot[] This is the array to be loaded in
     */
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        //set the default value
        int ret = ballBotArray.length;
        //traverse the array
        for(int i = 0;i<ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                ret = i;
            }
        }
        return ret;
    }
    /**
     * This method calculates the distance between two points
     */
    public double distanceBetweenPoints (TGPoint point1, TGPoint point2){
        //returns the calculation
        return (Math.sqrt((Math.pow(point1.x-point2.x, 2))+(Math.pow(point1.y-point2.y, 2))));
    }
    /**
     * Takes to ballBots in and returns the value of one of them to bounce off of
     */
    public BallBot ballBotToBounceOff (BallBot ballBot, BallBot[] ballBotArray){
        boolean C1 = false;
        boolean C2 = false;
        BallBot ret = null;
        BallRunner ballRunner = new BallRunner();
        for(int i = 0; i<ballBotArray.length; i++){
            BallBot otherBallBot = ballBotArray[i];
            if(ballBot !=null && otherBallBot != ballBot && otherBallBot != null){
                double currentDistance = ballRunner.distanceBetweenPoints(ballBot.getPoint(), otherBallBot.getPoint());
                if(currentDistance <= (ballBot.getRadius()+otherBallBot.getRadius())){
                    C1 = true;
                }
                double nextDistance = ballRunner.distanceBetweenPoints(ballBot.forwardPoint(), otherBallBot.getPoint());
                if(nextDistance <= currentDistance){
                    C2=true;
                }
                if(C1 ==true &&C2 ==true){
                    ret = otherBallBot;
                    System.out.println("returning otherBallBot");
                }
            }
        }
        return ret;
    }
    /**
     * Checks if the entrance is clear by taking in an entrance point and a ballBot
     */
    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
        //default value
       boolean ret = true;
       BallRunner ballRunner = new BallRunner();
       //traverse the array
       for(int i = 0; i< ballBotArray.length; i++){
           //checks if the ballBot is null
            if(ballBotArray[i] != null){
                TGPoint ballPos = ballBotArray[i].getPoint();
                
                double dist = ballRunner.distanceBetweenPoints(ballPos, entrancePoint); 
                if(dist < (2 * ballBotArray[i].getRadius())){
                    //new value if the distance is less than than double the radius
                    ret = false;
                }
            }
       }
       return ret;
    }
    /**
     * This is the first method to run.
     */
    public static void run(){
        BallWorld ballWorld = new BallWorld(700,700);
        TGPoint startpoint = new TGPoint(0,0);
        BallBot[] ballArray = new BallBot[50];
        BallRunner ballRunner = new BallRunner();
        int b;
        //runs infinetly
        while(true){
            //this chunk checks that all the array has all indexs filled
            if(ballRunner.findFreeBallBotIndex(ballArray) < ballArray.length){
               if(ballRunner.entranceClear(ballArray, startpoint)){
               b =ballRunner.findFreeBallBotIndex(ballArray);
               ballArray[b] = new BallBot(ballWorld, startpoint, Math.random()*360, (int)(Math.random() * 25));
               if(ballArray[b] != null){
                   ballArray[b].setPixelsPerSecond(100);
                   ballArray[b].setColor((int)(Math.random() * 25));
               }
            }}
            // Runs the code and checks if the ball can move forward
            for(int a = 0; a<ballArray.length; a++){
                if(ballArray[a] != null){
                    if(ballArray[a].canMoveForward(ballWorld)){
                       if(ballRunner.ballBotToBounceOff(ballArray[a], ballArray) == null){
                            ballArray[a].moveForward();
                       }else{
                           ballArray[a].setHeading((Math.random()*360));
                       }
                    }else{
                        ballArray[a].setHeading((Math.random()*360));
                    }
                }
            }
        }
    }
    public static void actOne(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint startpoint = new TGPoint(0,0);
        BallBot ball = new BallBot(ballWorld, startpoint, 0.0, 25);
        while(i != 1){
            if(ball.canMoveForward(ballWorld)){
                ball.moveForward();
            }else{
                ball.setHeading(ball.getHeading() + 90);
            }
        }
    }
}
