/**
 * 
 */
package edu.westga.cs3211.discountFinder.model;

/**
 * the item class
 * @author oumar diallo
 *
 */
public class Item {
	private String itemName;
	private double originalPrice;
	
	/**
	 * Instantiates a new item.
	 *
	 * @param name the name
	 * @param price the price
	 */
	public Item(String name, double price) {
		this.itemName = name;
		this.originalPrice = price;
	}

	/**
	 * Gets the original price.
	 *
	 * @return the original price
	 */
	public double getOriginalPrice() {
		return this.originalPrice;
	}

	/**
	 * Gets the item name.
	 *
	 * @return the item name
	 */
	public String getItemName() {
		return this.itemName;
	}

}
