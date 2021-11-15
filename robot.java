import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    private int speed;
    private int batteryLevel;
    private boolean isAwesome;
    private int moves=0;
    public robot(int a,int b,boolean c){
        this.speed =a;
        this.batteryLevel = b;
        this.isAwesome=c;
    
    
    
    }
    public String toString(){
        return("Speed: "+speed+" Battery Level: "+batteryLevel+" Is Awesome: "+isAwesome);
        
    }
    
    
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count =0;
    public void act() 
    {
        // Add your action code here.
        //int count =0;
        count = count+1;
        if (batteryLevel>0){
            count = count+1;
            move(speed);
            //move(speed);
            //move(speed);
            if (count%3==0){
                batteryLevel = batteryLevel-1;
            }
            
            /*if (robot.getX()>300){
                turn(90);
            }
            */
            //System.out.println(batteryLevel);
            //System.out.println(count);
            //System.out.println(Actor.getY());
            if (isAtEdge()){
                turn(180);
                move(1);
                turn(270);
                
            }
        }
        if (batteryLevel==1&& count%3 ==0){
            System.out.println("Battery needs charging!");
        }
        
        
    }    
}
