import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gold extends Actor
{
    /**
     * Act - do whatever the Gold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        GreenfootImage gold=new GreenfootImage("gold.jpg");
        gold.scale(25,25);
        this.setImage(gold);
        if(getOneObjectAtOffset(0,0,Player.class)!=null){
        getWorld().removeObject(this);
        Player.giveGold(20);
        }
    }    
}
