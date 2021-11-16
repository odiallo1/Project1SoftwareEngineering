/**
 * 
 */
package edu.westga.cs3211.discountFinder.model;
/**
 * the discount class
 * @author oumar diallo
 * 
 */
public class Discount {
    private Item item;
    
    private double discountPrice;
    
    /**
     * Instantiates a new discount.
     *
     * @param item the item
     * @param discountPrice the discount price
     */
    public Discount(Item item,  double discountPrice) {
        this.item = item;
        this.discountPrice = discountPrice;
    }

    /**
     * Gets the item.
     *
     * @return the item
     */
    public Item getItem() {
        return this.item;
    }

    /**
     * Gets the discount price.
     *
     * @return the discount price
     */

    public double getDiscountPrice() {
        return this.discountPrice;
    }
    
    @Override
    public String toString() {
    	return "Item: " + this.item.getItemName() + " Discount Price " + this.discountPrice;
    }
}