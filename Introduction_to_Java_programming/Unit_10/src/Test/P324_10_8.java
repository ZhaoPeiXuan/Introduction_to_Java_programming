package Test;
/**
 * className : P324_10_8
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/15 14:52
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P324_10_8
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/15 14:52
 *@Version : 1.0
 **/
public class P324_10_8 {
    public static void main(String[] args) {
        Integer i = new Integer("23");
        Integer i1 = new Integer(23);
        Integer i2 = Integer.valueOf("23");
        Integer i3 = Integer.parseInt("23", 8);
        Double d = Double.valueOf("23.45");
        int i4 = (Integer.valueOf("23").intValue());
        double d1 = (Double.valueOf("23.4")).doubleValue();
        int i5 = (Double.valueOf("23.4")).intValue();
        String s = (Double.valueOf("23.4")).toString();
    }
}
