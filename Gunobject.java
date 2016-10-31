import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Gunobject
{
    String gunName;
    int bullet;
    public Gunobject(String gunName, int bullet){
        this.gunName = gunName;
        this.bullet = bullet;
    }
    public String getgunName(){
        return gunName;
    }
    public int getBullet(){
        return bullet;
    }
    public void addBullet(int bullet){
    this.bullet +=bullet;
    }
    public void useBullet(){
    this.bullet--;
    }
}
