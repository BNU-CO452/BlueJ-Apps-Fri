import java.util.Random;
/**
 * Demonstrate the StockList and Product classes.
 * The demonstration becomes properly functional as
 * the StockList class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified by Derek Peacock
 * @version 2021-11-12
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));
        stock.add(new Product(104, "Samsung Galaxy S20"));
        stock.add(new Product(105, "Apple iPhone 12"));
        stock.add(new Product(106, "Google Pixel 4A"));
        stock.add(new Product(107, "Samsung Galaxy S20"));
        stock.add(new Product(108, "Apple iPhone 12"));
        stock.add(new Product(109, "Google Pixel 4A"));
        stock.add(new Product(110, "Google Pixel 4A"));        
        
        
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    /**
     * Thise method will buy different quantities of
     * each of the products in the stock list.
     */
    private void buyProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 100; id <= 110; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               quantity = generator.nextInt(20);
               stock.buyProduct(id, quantity);
            }
        }
    }

    /**
     * Thise method will sell different quantities of
     * each of the products in the stock list.
     */    
    private void sellProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 100; id <= 110; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               quantity = generator.nextInt(20);
               stock.sellProduct(id, quantity);
            }
        }
        
    }    
}