package nsu.edu.qingcheng.bean;

public class Food {
    private Integer foodId;

    private Integer villageId;

    private Integer topId;

    private String foodName;

    private String foodPic;

    private String foodIntroduce;

    private Float foodPrice;

    private Integer foodRecommend;

    private String foodPlace;

    private String foodMaterial;

    private String foodPractice;

    private String foodEffect;

    private Integer foodType;

    private String foodKeyword;

    private String foodText;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(String foodPic) {
        this.foodPic = foodPic == null ? null : foodPic.trim();
    }

    public String getFoodIntroduce() {
        return foodIntroduce;
    }

    public void setFoodIntroduce(String foodIntroduce) {
        this.foodIntroduce = foodIntroduce == null ? null : foodIntroduce.trim();
    }

    public Float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getFoodRecommend() {
        return foodRecommend;
    }

    public void setFoodRecommend(Integer foodRecommend) {
        this.foodRecommend = foodRecommend;
    }

    public String getFoodPlace() {
        return foodPlace;
    }

    public void setFoodPlace(String foodPlace) {
        this.foodPlace = foodPlace == null ? null : foodPlace.trim();
    }

    public String getFoodMaterial() {
        return foodMaterial;
    }

    public void setFoodMaterial(String foodMaterial) {
        this.foodMaterial = foodMaterial == null ? null : foodMaterial.trim();
    }

    public String getFoodPractice() {
        return foodPractice;
    }

    public void setFoodPractice(String foodPractice) {
        this.foodPractice = foodPractice == null ? null : foodPractice.trim();
    }

    public String getFoodEffect() {
        return foodEffect;
    }

    public void setFoodEffect(String foodEffect) {
        this.foodEffect = foodEffect == null ? null : foodEffect.trim();
    }

    public Integer getFoodType() {
        return foodType;
    }

    public void setFoodType(Integer foodType) {
        this.foodType = foodType;
    }

    public String getFoodKeyword() {
        return foodKeyword;
    }

    public void setFoodKeyword(String foodKeyword) {
        this.foodKeyword = foodKeyword == null ? null : foodKeyword.trim();
    }

    public String getFoodText() {
        return foodText;
    }

    public void setFoodText(String foodText) {
        this.foodText = foodText == null ? null : foodText.trim();
    }
}