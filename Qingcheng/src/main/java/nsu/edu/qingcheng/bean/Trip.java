package nsu.edu.qingcheng.bean;

import java.util.Date;

public class Trip {
    private Integer tripId;

    private String tripName;

    private String tripPic;

    private String tripIntroduce;

    private String tripKeyword;

    private String tripMap;

    private Date tripTime;

    private String tripTextSrc;

    private String tripText;

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName == null ? null : tripName.trim();
    }

    public String getTripPic() {
        return tripPic;
    }

    public void setTripPic(String tripPic) {
        this.tripPic = tripPic == null ? null : tripPic.trim();
    }

    public String getTripIntroduce() {
        return tripIntroduce;
    }

    public void setTripIntroduce(String tripIntroduce) {
        this.tripIntroduce = tripIntroduce == null ? null : tripIntroduce.trim();
    }

    public String getTripKeyword() {
        return tripKeyword;
    }

    public void setTripKeyword(String tripKeyword) {
        this.tripKeyword = tripKeyword == null ? null : tripKeyword.trim();
    }

    public String getTripMap() {
        return tripMap;
    }

    public void setTripMap(String tripMap) {
        this.tripMap = tripMap == null ? null : tripMap.trim();
    }

    public Date getTripTime() {
        return tripTime;
    }

    public void setTripTime(Date tripTime) {
        this.tripTime = tripTime;
    }

    public String getTripTextSrc() {
        return tripTextSrc;
    }

    public void setTripTextSrc(String tripTextSrc) {
        this.tripTextSrc = tripTextSrc == null ? null : tripTextSrc.trim();
    }

    public String getTripText() {
        return tripText;
    }

    public void setTripText(String tripText) {
        this.tripText = tripText == null ? null : tripText.trim();
    }
}