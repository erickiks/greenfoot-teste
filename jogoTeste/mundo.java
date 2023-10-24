import greenfoot.*; 

/**
 * Write a description of class mundo here.
 * @erickkjl  
 * @0.1 Alpha
 */
public class mundo extends World
{

    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 576, 1); 
        prepare();
    }
    private GreenfootSound bgMusic = new GreenfootSound("musga.mp3");
    public void started()
    {
        bgMusic.playLoop();
    }

    public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        doomguy doomguy = new doomguy();
        addObject(doomguy,221,388);
        pyramid_head pyramid_head = new pyramid_head();
        addObject(pyramid_head,771,376);
        Counter counter = new Counter();
        addObject(counter,223,146);
        Counter counter2 = new Counter();
        addObject(counter2,768,135);
    }
}
