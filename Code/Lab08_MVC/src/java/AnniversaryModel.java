
public class AnniversaryModel {

    private AnniversaryRecord[] anniversaryData = {
        new AnniversaryRecord(1, "Paper"),
        new AnniversaryRecord(2, "Cotton"),
        new AnniversaryRecord(3, "Leather"),
        new AnniversaryRecord(4, "Linen, Silk"),
        new AnniversaryRecord(5, "Wood"),
        new AnniversaryRecord(6, "Iron"),
        new AnniversaryRecord(7, "Wool, Copper"),
        new AnniversaryRecord(8, "Bronze"),
        new AnniversaryRecord(9, "Pottery China"),
        new AnniversaryRecord(10, "Tin, Aluminum"),
        new AnniversaryRecord(11, "Steel"),
        new AnniversaryRecord(12, "Silk"),
        new AnniversaryRecord(13, "Lace"),
        new AnniversaryRecord(14, "Ivory"),
        new AnniversaryRecord(15, "Crystal"),
        new AnniversaryRecord(20, "China"),
        new AnniversaryRecord(25, "Silver"),
        new AnniversaryRecord(30, "Pearl"),
        new AnniversaryRecord(35, "Coral"),
        new AnniversaryRecord(40, "Ruby"),
        new AnniversaryRecord(45, "Sapphire"),
        new AnniversaryRecord(50, "Gold"),
        new AnniversaryRecord(55, "Emerald"),
        new AnniversaryRecord(60, "Diamond")
    };
    private int year;
    //private String material;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getMaterial() {
        String rv = "沒有特別名稱";
        //依序從陣列讀取一個 紀念日資料
        for (AnniversaryRecord ar : anniversaryData) {
            if (ar.getYear() == year) { //如果 紀念日資料year == 表單的year, 返回 紀念日名稱
                rv = ar.getMaterial();
                break;
            } else if (ar.getYear() > year) { //如果 紀念日資料year > 表單的year, 返回 預設值
                break;
            }
        }
        return rv;
    }

}
