
//紀念日資料
public class AnniversaryRecord {

    private int year;           //結婚幾年
    private String material;    //紀念名稱

    public AnniversaryRecord(int year, String material) {
        this.year = year;
        this.material = material;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
