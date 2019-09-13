package LatestNewsList;

public class NewsChild {

    public String option1;
    public String option2;
    public String imagePath;

    public NewsChild(String option1, String option2, String imagePath) {
        this.option1 = option1;
        this.option2 = option2;
        this.imagePath = imagePath;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
