import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        GreenfootImage gun=new GreenfootImage("Gun1.png");
        gun.scale(25,15);
        this.setImage(gun);
        if(getOneObjectAtOffset(0,0,Player.class)!=null){
        getWorld().removeObject(this);
        Player.giveGun("gun",20);
        }
    }    
}
