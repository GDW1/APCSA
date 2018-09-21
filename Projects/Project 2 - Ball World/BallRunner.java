
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    static int i = 0;
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        int ret = 0;
        for(int i = 0;i<ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                ret = i;
            }
        }
        if(ret == 0){
            ret = ballBotArray.length;  
        }
        return ret;
    }
    public double distanceBetweenPoints (TGPoint point1, TGPoint point2){
        return (Math.sqrt((Math.pow(point1.x-point2.x, 2))+(Math.pow(point1.y-point2.y, 2))));
    }
    public BallBot ballBotToBounceOff (BallBot ballBot, BallBot[] ballBotArray){
        boolean C1 = false;
        boolean C2 = false;
        BallBot ret = null;
        for(int i = 0; i<ballBotArray.length; i++){
            BallBot otherBallBot = ballBotArray[i];
            if(ballBot !=null && otherBallBot != ballBot){
                double currentDistance = distanceBetweenPoints(ballBot.getPoint(), otherBallBot.getPoint());
                if(currentDistance <= (ballBot.getRadius()+otherBallBot.getRadius())){
                    C1 = true;
                }
                double nextDistance = distanceBetweenPoints(ballBot.forwardPoint(), otherBallBot.getPoint());
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
    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
       boolean ret = true;
       BallRunner ballRunner = new BallRunner();
       for(int i = 0; i< ballBotArray.length; i++){
            if(ballBotArray[i] != null){
                TGPoint ballPos = ballBotArray[i].getPoint();
                double dist = ballRunner.distanceBetweenPoints(ballPos, entrancePoint); 
                if(dist < (2 * ballBotArray[i].getRadius())){
                    ret = false;
                }
            }
       }
       return ret;
    }
    public static void run(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint startpoint = new TGPoint(0,0);
        BallBot[] ballArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while(true){
            if(ballRunner.findFreeBallBotIndex(ballArray) < ballArray.length){
               if(ballRunner.entranceClear(ballArray, startpoint)){
               ballArray[ballRunner.findFreeBallBotIndex(ballArray)] = new BallBot(ballWorld, startpoint, Math.random()*360, 25);
            }}
            for(int a = 0; a<ballArray.length; a++){
                if(ballArray[a] != null){
                    if(ballArray[a].canMoveForward(ballWorld)){
                        if(ballRunner.ballBotToBounceOff(ballArray[a], ballArray) == null){
                            ballArray[a].moveForward();
                       }else{
                           ballArray[a].setHeading(Math.random()*360);
                       }
                    }else{
                        ballArray[a].setHeading(Math.random()*360);
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
