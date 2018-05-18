package nsu.edu.qingcheng.bean;

public class Scenic {
    private Integer scenicId;

    private Integer menuscenicId;

    private Integer villageId;

    private String scenicName;

    private String scenicIntroduce;

    private String scenicPic;

    private String scenicKeyword;

    private String scenicText;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getMenuscenicId() {
        return menuscenicId;
    }

    public void setMenuscenicId(Integer menuscenicId) {
        this.menuscenicId = menuscenicId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getScenicIntroduce() {
        return scenicIntroduce;
    }

    public void setScenicIntroduce(String scenicIntroduce) {
        this.scenicIntroduce = scenicIntroduce == null ? null : scenicIntroduce.trim();
    }

    public String getScenicPic() {
        return scenicPic;
    }

    public void setScenicPic(String scenicPic) {
        this.scenicPic = scenicPic == null ? null : scenicPic.trim();
    }

    public String getScenicKeyword() {
        return scenicKeyword;
    }

    public void setScenicKeyword(String scenicKeyword) {
        this.scenicKeyword = scenicKeyword == null ? null : scenicKeyword.trim();
    }

    public String getScenicText() {
        return scenicText;
    }

    public void setScenicText(String scenicText) {
        this.scenicText = scenicText == null ? null : scenicText.trim();
    }
}