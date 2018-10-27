package openpulse.sppabe.contentmanagementapi.entities;

public class User {
    private String userID;
    private String userFirstName;
    private String userSecondName;
    private String userAddress;
    private String userNIC;
    private String userMobileNo;

    public User(){
    }

    public User(String userID, String userFirstName, String userSecondName, String userAddress, String userNIC,
                String userMobileNo){
        super();
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userSecondName = userSecondName;
        this.userAddress = userAddress;
        this.userNIC = userNIC;
        this.userMobileNo = userMobileNo;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserSecondName() {
        return userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserNIC() {
        return userNIC;
    }

    public void setUserNIC(String userNIC) {
        this.userNIC = userNIC;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }
}
