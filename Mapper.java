import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mapper<Map> extends Thread
{
    private int resolution_x, resolution_y;
    private Map map;
    private int x,y;
    public Mapper(int x,int y, int resolution_x, int resolution_y, Map map){//mapper 초기화, 현재 위치를 결정.
        this.x = x;
        this.y = y;
        this.resolution_x = x;
        this.resolution_y = y;
        this.map = map;
    }
    
    public void run(){
     while(true){
        
    }
    }
    GreenfootImage code(int map){//v:vertical h:horizontal
        return new GreenfootImage(new String());
    }
}
