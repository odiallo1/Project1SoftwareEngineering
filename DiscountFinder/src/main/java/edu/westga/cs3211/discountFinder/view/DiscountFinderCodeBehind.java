package edu.westga.cs3211.discountFinder.view;


import edu.westga.cs3211.discountFinder.model.Discount;
import edu.westga.cs3211.discountFinder.viewModel.DiscountFinderViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;

public class DiscountFinderCodeBehind {


    @FXML
    private ListView<Discount> discountList;

    
    @FXML
    private TextField filterTextBox;

    @FXML
    private Button addFilterButton;


    @FXML
    private Button clearFilterButton;
    
    @FXML
    private Label labelText;
    
    private DiscountFinderViewModel vm;
    
    public DiscountFinderCodeBehind() {
    	this.vm = new DiscountFinderViewModel();
    }
    
    @FXML
    public void initialize() {
    	this.discountList.itemsProperty().set(this.vm.discountListProperty()); 
    	this.discountListListener();
    	this.filterTextBoxListener();
    	String[] words = {"apple", "milk", "cinnamon"};
    	TextFields.bindAutoCompletion(this.filterTextBox, words);
    }
    
    @FXML
    void handleAddFilter(ActionEvent event) {
    	this.discountList.itemsProperty().set(this.vm.filter(this.filterTextBox.getText()));

    }
    
    @FXML
    void handleClearFilter(ActionEvent event) {
    	this.initialize();
    }
    
    private void discountListListener() {
    	this.discountList.itemsProperty().addListener((observable, oldValue, newValue) -> {
			if (observable.getValue().isEmpty()) {
				this.labelText.visibleProperty().set(true);
			} else {
			
				this.labelText.visibleProperty().set(false);
			}
		});
    }
    
    private void filterTextBoxListener() {
    	this.filterTextBox.textProperty().addListener((observable, oldValue, newValue) -> {
    		if (observable.getValue().isEmpty()) {
    			this.addFilterButton.disableProperty().set(true);
    		} else {
    			this.addFilterButton.disableProperty().set(false);
    		}
    	});
    }
    
    
    

}

