package com.company.models;

import com.company.interfaces.Payable;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private Crowns pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, Crowns pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }



    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Crowns getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(Crowns pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public Crowns getPayableAmount() {

        return pricePerItem.multiply(quantity);
    }


    @Override
    public String toString() {
        return String.format("\nInvoice:\nPart number: %s\nDescription: %s\nQuantity: %s\nPrice per item: %s\nTotal: %s",
                this.getPartNumber(), this.getPartDescription(), this.getQuantity(), this.getPricePerItem(), this.getPayableAmount());
    }


}

