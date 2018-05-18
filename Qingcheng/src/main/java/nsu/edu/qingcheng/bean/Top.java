package nsu.edu.qingcheng.bean;

public class Top {
    private Integer topId;

    private String topName;

    private String topLogo;

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName == null ? null : topName.trim();
    }

    public String getTopLogo() {
        return topLogo;
    }

    public void setTopLogo(String topLogo) {
        this.topLogo = topLogo == null ? null : topLogo.trim();
    }
}