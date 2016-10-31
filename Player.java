import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int hp;
    Gunobject gun[];
    int whichGun;
    static int gold=0;
    
    public static void giveGun(String gunname, int bullet){
        
    }
    public static void giveGold(int addgold){
        gold += addgold;
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage player=new GreenfootImage("player1_1.png");
        player.scale(40,20);
        this.setImage(player);
        if(Greenfoot.isKeyDown("up")){
            setRotation(0);
            setLocation(this.getX(),this.getY()-5);
        } if(Greenfoot.isKeyDown("down")){
            setRotation(180);
            setLocation(this.getX(),this.getY()+5);
        } if(Greenfoot.isKeyDown("left")){
            setRotation(90);
            setLocation(this.getX()-5,this.getY());
        } if(Greenfoot.isKeyDown("right")){
            setRotation(270);
            setLocation(this.getX()+5,this.getY());
        }
    }
}
