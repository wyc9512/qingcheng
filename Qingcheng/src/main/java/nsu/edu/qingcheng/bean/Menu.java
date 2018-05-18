package nsu.edu.qingcheng.bean;

public class Menu {
    private Integer menuId;

    private Integer topId;

    private String menuName;

    private String menuPic;

    private String menuDescription;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuPic() {
        return menuPic;
    }

    public void setMenuPic(String menuPic) {
        this.menuPic = menuPic == null ? null : menuPic.trim();
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription == null ? null : menuDescription.trim();
    }
}