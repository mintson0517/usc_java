package HW;

public class HW_001_print {
    public static void main(String args[]) {
        String sid = "A123456789";// String 文字列
        String name = "Mintson";
        String season = "Autumn";
        int highTemp = 34;// int 整数
        int lowTemp = 25;
        double avgTemp = 28;// double 小数点数
        char status = 'A';// A:Excellent; B:Good; C:not bad; D:Bad ; char 1文字

        // use printf
        System.out.printf("學號:%s,姓名:%s,季節:%s %n", sid, name, season);
        System.out.printf(">>最高溫度:%d,最低溫度:%d,平均溫度:%.2f", highTemp, lowTemp, avgTemp);
        System.out.printf(",評價:%c %n", status);

        // use println
        System.out.println("\n學號:" + sid + "姓名:" + name + "季節:" + season);// \n(改行)Ï
        System.out.println(">>最高溫度:" + highTemp + ",最低溫度:" + lowTemp + ",平均溫度:" + avgTemp);
        System.out.println("評價:" + status);
    }
}
