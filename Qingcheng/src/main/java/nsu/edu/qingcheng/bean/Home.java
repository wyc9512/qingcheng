package nsu.edu.qingcheng.bean;

public class Home {
    private Integer homeId;

    private String homePic;

    private String homeIntroduce;

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public String getHomePic() {
        return homePic;
    }

    public void setHomePic(String homePic) {
        this.homePic = homePic == null ? null : homePic.trim();
    }

    public String getHomeIntroduce() {
        return homeIntroduce;
    }

    public void setHomeIntroduce(String homeIntroduce) {
        this.homeIntroduce = homeIntroduce == null ? null : homeIntroduce.trim();
    }
}