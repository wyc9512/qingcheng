package nsu.edu.qingcheng.bean;

public class Village {
    private Integer villageId;

    private String villageName;

    private String villagePic;

    private String villageIntroduce;

    private String villagePlace;

    private String villageKeyword;

    private String villageMap;

    private String villageTraffic;

    private String villageText;

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    public String getVillagePic() {
        return villagePic;
    }

    public void setVillagePic(String villagePic) {
        this.villagePic = villagePic == null ? null : villagePic.trim();
    }

    public String getVillageIntroduce() {
        return villageIntroduce;
    }

    public void setVillageIntroduce(String villageIntroduce) {
        this.villageIntroduce = villageIntroduce == null ? null : villageIntroduce.trim();
    }

    public String getVillagePlace() {
        return villagePlace;
    }

    public void setVillagePlace(String villagePlace) {
        this.villagePlace = villagePlace == null ? null : villagePlace.trim();
    }

    public String getVillageKeyword() {
        return villageKeyword;
    }

    public void setVillageKeyword(String villageKeyword) {
        this.villageKeyword = villageKeyword == null ? null : villageKeyword.trim();
    }

    public String getVillageMap() {
        return villageMap;
    }

    public void setVillageMap(String villageMap) {
        this.villageMap = villageMap == null ? null : villageMap.trim();
    }

    public String getVillageTraffic() {
        return villageTraffic;
    }

    public void setVillageTraffic(String villageTraffic) {
        this.villageTraffic = villageTraffic == null ? null : villageTraffic.trim();
    }

    public String getVillageText() {
        return villageText;
    }

    public void setVillageText(String villageText) {
        this.villageText = villageText == null ? null : villageText.trim();
    }
}