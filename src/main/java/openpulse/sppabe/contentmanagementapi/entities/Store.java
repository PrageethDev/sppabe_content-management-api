package openpulse.sppabe.contentmanagementapi.entities;

public class Store {
    private String storeID;
    private String userID;
    private String storeName;
    private String storeDescription;

    public Store(){
    }

    public Store(String storeID, String userID, String storeName, String storeDescription){
        super();
        this.storeID = storeID;
        this.userID = userID;
        this.storeName = storeName;
        this.storeDescription = storeDescription;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }
}
