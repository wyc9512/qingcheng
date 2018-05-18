package nsu.edu.qingcheng.bean;

public class Threemenu {
    private Integer threemenuId;

    private Integer menuId;

    private String threemenuName;

    private String threemenuLogo;

    public Integer getThreemenuId() {
        return threemenuId;
    }

    public void setThreemenuId(Integer threemenuId) {
        this.threemenuId = threemenuId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getThreemenuName() {
        return threemenuName;
    }

    public void setThreemenuName(String threemenuName) {
        this.threemenuName = threemenuName == null ? null : threemenuName.trim();
    }

    public String getThreemenuLogo() {
        return threemenuLogo;
    }

    public void setThreemenuLogo(String threemenuLogo) {
        this.threemenuLogo = threemenuLogo == null ? null : threemenuLogo.trim();
    }
}