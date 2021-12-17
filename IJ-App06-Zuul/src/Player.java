import java.util.ArrayList;

/**
 * This class ....
 */
public class Player
{
    private String name;

    private int lives;

    private Item item;

    private int score = 0;

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

    /**
     * If the item is an item of treasure inclrease
     * the score
     * @param item
     */
    public void addItem(Item item)
    {
        this.item = item;

        if(item.getItemType()==ItemType.Treasure)
        {
            score += item.getValue();
        }
        else if(item.getItemType()==ItemType.Drink)
        {
            energy += 10;
        }
    }
}
