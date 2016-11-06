/**
 * Write a description of class ActConnector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActConnector<Actor>  
{
    // instance variables - replace the example below with your own
    private int x;
    private Actor actor;

    /**
     * Constructor for objects of class ActConnector
     */
    public ActConnector(Actor actor){
        this.actor = actor;
    }

    public void move(int distance){
       //콜백으로 다시 제작. 제너릭 필요 없음.
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
