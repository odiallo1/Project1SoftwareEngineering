package edu.westga.cs3211.discountFinder.testViewModel;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discountFinder.model.Discount;
import edu.westga.cs3211.discountFinder.model.Item;
import edu.westga.cs3211.discountFinder.model.Seller;
import edu.westga.cs3211.discountFinder.viewModel.DiscountFinderViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

class testFilterStore {

	@Test
	void testNoDiscountsForStore() {
		
		DiscountFinderViewModel viewM = new DiscountFinderViewModel();
		ObservableList<Discount> oneDiscount = viewM.filterStore("Sam's Club");
		
		Assert.assertEquals(true, oneDiscount.isEmpty());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void testSomeDiscountsForStore() {
		Item oranges = new Item("oranges", 20.35);
		Seller aldi = new Seller("Aldi", 30218);
		Discount fifth = new Discount(oranges, 15.67, aldi);
		ArrayList<Discount> orangeDiscount = new ArrayList<Discount>();
		
		ObservableList<Discount> orange = FXCollections.observableArrayList(orangeDiscount);
		
		DiscountFinderViewModel viewM = new DiscountFinderViewModel();
		ObservableList<Discount> oneDiscount = viewM.filterStore("Wal-Mart");
		
		Assert.assertEquals("Wal-Mart", oneDiscount.get(0).getDiscountSeller().getSellerName());
		Assert.assertEquals(11.67, oneDiscount.get(0).getDiscountPrice(), .1);
		Assert.assertEquals(true, oneDiscount.get(0).toString().contains("apple"));
		Assert.assertEquals(30215, oneDiscount.get(0).getDiscountSeller().getZipCode());
		
	}

}
