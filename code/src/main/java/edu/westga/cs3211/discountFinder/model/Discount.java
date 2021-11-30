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
    
<<<<<<< HEAD
    private Seller discountSeller;
    

=======
>>>>>>> release
    /**
     * Instantiates a new discount.
     *
     * @param item the item
     * @param discountPrice the discount price
<<<<<<< HEAD
     * @param discountSeller the discount seller
     */
    public Discount(Item item,  double discountPrice, Seller discountSeller) {
        this.item = item;
        this.discountPrice = discountPrice;
        this.discountSeller = discountSeller;
=======
     */
    public Discount(Item item,  double discountPrice) {
        this.item = item;
        this.discountPrice = discountPrice;
>>>>>>> release
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
    
<<<<<<< HEAD
	/**
	 * Gets the discount seller.
	 *
	 * @return the discount seller
	 */
	public Seller getDiscountSeller() {
		return this.discountSeller;
	}
    
=======
>>>>>>> release
    @Override
    public String toString() {
    	return "Item: " + this.item.getItemName() + " Discount Price " + this.discountPrice;
    }
<<<<<<< HEAD


=======
>>>>>>> release
}