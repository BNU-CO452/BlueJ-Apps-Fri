import java.util.ArrayList;

/**
 * This class ....
 */
public class Player
{
    private String name;

    private int lives;

    private Item item;

    private ArrayList<Item> items;

    // This is a percentage
    private int energy;

    public Player(String name)
    {
        this.name = name;
        lives = 1;
        energy = 100;
    }

    public void increaseEnergy(int amount)
    {
        energy += amount;

        if(energy > 100)
            energy = 100;
    }

    public void decreaseEnergy(int amount)
    {
        energy -= amount;
        if(energy < 10)
        {
            lives = 0;
        }
    }

    public boolean isAlive()
    {
        return lives > 0;
    }
}
