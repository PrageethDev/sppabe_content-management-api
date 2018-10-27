package openpulse.sppabe.contentmanagementapi.entities;

import org.springframework.data.annotation.Id;


public class Item {
    @Id
    private String itemID;
    private String storeID;
    private String itemName;
    private String itemPrice;
    private String itemDescription;

    public Item(){
    }


    public Item(String itemID, String storeID, String itemName, String itemPrice, String itemDescription){
        super();
        this.itemID = itemID;
        this.storeID = storeID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
