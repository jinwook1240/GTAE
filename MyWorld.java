import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int resolution_x = 1366;
    int resolution_y = 768;
    Mapper mapper = new Mapper(10,21,resolution_x,resolution_y,new Map1());
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 
        mapper.start();
        GreenfootImage map=new GreenfootImage("map.png");
        setBackground(map);
        
        GreenfootImage playerimage=new GreenfootImage("player1_1.png");
        playerimage.scale(40,20);
        Player player = new Player();
        player.setImage(playerimage);
        
        GreenfootImage gunimage=new GreenfootImage("Gun1.png");
        gunimage.scale(25,15);
        Gun gun = new Gun();
        gun.setImage(gunimage);
        
        
        GreenfootImage goldimage=new GreenfootImage("gold.jpg");
        goldimage.scale(25,25);
        Gold gold = new Gold();
        gold.setImage(goldimage);
        
        
        addObject(player,100,100);
        addObject(gun,300,600);
        addObject(gold,800,600);
    }
    
    public void stopped(){
        mapper.stop();
    }
    
}
