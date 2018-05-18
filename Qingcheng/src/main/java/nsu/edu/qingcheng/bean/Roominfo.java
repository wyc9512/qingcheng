package nsu.edu.qingcheng.bean;

public class Roominfo {
    private Integer roominfoId;

    private Integer residenceId;

    private String roominfoHouseType;

    private String roominfoDiscounts;

    private Integer roominfoSupportCount;

    private Float roominfoPrice;

    private String roominfoPic;

    private String roominfoName;

    public Integer getRoominfoId() {
        return roominfoId;
    }

    public void setRoominfoId(Integer roominfoId) {
        this.roominfoId = roominfoId;
    }

    public Integer getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(Integer residenceId) {
        this.residenceId = residenceId;
    }

    public String getRoominfoHouseType() {
        return roominfoHouseType;
    }

    public void setRoominfoHouseType(String roominfoHouseType) {
        this.roominfoHouseType = roominfoHouseType == null ? null : roominfoHouseType.trim();
    }

    public String getRoominfoDiscounts() {
        return roominfoDiscounts;
    }

    public void setRoominfoDiscounts(String roominfoDiscounts) {
        this.roominfoDiscounts = roominfoDiscounts == null ? null : roominfoDiscounts.trim();
    }

    public Integer getRoominfoSupportCount() {
        return roominfoSupportCount;
    }

    public void setRoominfoSupportCount(Integer roominfoSupportCount) {
        this.roominfoSupportCount = roominfoSupportCount;
    }

    public Float getRoominfoPrice() {
        return roominfoPrice;
    }

    public void setRoominfoPrice(Float roominfoPrice) {
        this.roominfoPrice = roominfoPrice;
    }

    public String getRoominfoPic() {
        return roominfoPic;
    }

    public void setRoominfoPic(String roominfoPic) {
        this.roominfoPic = roominfoPic == null ? null : roominfoPic.trim();
    }

    public String getRoominfoName() {
        return roominfoName;
    }

    public void setRoominfoName(String roominfoName) {
        this.roominfoName = roominfoName == null ? null : roominfoName.trim();
    }
}