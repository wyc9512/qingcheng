package nsu.edu.qingcheng.bean;

public class Menuscenic {
    private Integer menuscenicId;

    private String menuscenicName;

    private String menuscenicIntroduce;

    private String menuscenicPic;

    private Float menuscenicPrice;

    private String menuscenicPlace;

    private String menuscenicTime;

    private String menuscenicPolicy;

    private String menuscenicTraffic;

    private String menuscenicQrCode;

    public Integer getMenuscenicId() {
        return menuscenicId;
    }

    public void setMenuscenicId(Integer menuscenicId) {
        this.menuscenicId = menuscenicId;
    }

    public String getMenuscenicName() {
        return menuscenicName;
    }

    public void setMenuscenicName(String menuscenicName) {
        this.menuscenicName = menuscenicName == null ? null : menuscenicName.trim();
    }

    public String getMenuscenicIntroduce() {
        return menuscenicIntroduce;
    }

    public void setMenuscenicIntroduce(String menuscenicIntroduce) {
        this.menuscenicIntroduce = menuscenicIntroduce == null ? null : menuscenicIntroduce.trim();
    }

    public String getMenuscenicPic() {
        return menuscenicPic;
    }

    public void setMenuscenicPic(String menuscenicPic) {
        this.menuscenicPic = menuscenicPic == null ? null : menuscenicPic.trim();
    }

    public Float getMenuscenicPrice() {
        return menuscenicPrice;
    }

    public void setMenuscenicPrice(Float menuscenicPrice) {
        this.menuscenicPrice = menuscenicPrice;
    }

    public String getMenuscenicPlace() {
        return menuscenicPlace;
    }

    public void setMenuscenicPlace(String menuscenicPlace) {
        this.menuscenicPlace = menuscenicPlace == null ? null : menuscenicPlace.trim();
    }

    public String getMenuscenicTime() {
        return menuscenicTime;
    }

    public void setMenuscenicTime(String menuscenicTime) {
        this.menuscenicTime = menuscenicTime == null ? null : menuscenicTime.trim();
    }

    public String getMenuscenicPolicy() {
        return menuscenicPolicy;
    }

    public void setMenuscenicPolicy(String menuscenicPolicy) {
        this.menuscenicPolicy = menuscenicPolicy == null ? null : menuscenicPolicy.trim();
    }

    public String getMenuscenicTraffic() {
        return menuscenicTraffic;
    }

    public void setMenuscenicTraffic(String menuscenicTraffic) {
        this.menuscenicTraffic = menuscenicTraffic == null ? null : menuscenicTraffic.trim();
    }

    public String getMenuscenicQrCode() {
        return menuscenicQrCode;
    }

    public void setMenuscenicQrCode(String menuscenicQrCode) {
        this.menuscenicQrCode = menuscenicQrCode == null ? null : menuscenicQrCode.trim();
    }
}