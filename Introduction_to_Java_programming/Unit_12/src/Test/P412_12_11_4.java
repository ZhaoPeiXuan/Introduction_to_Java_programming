package Test;
/**
 * className : P412_12_11_4
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/20 11:01
 * @author : ZhaoPeiXuan
 */

import java.util.Properties;

/**
 *@ClassName : P412_12_11_4
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/20 11:01
 *@Version : 1.0
 **/
public class P412_12_11_4 {
    //测试行分隔符怎么获取
    static final Properties PROPERTIES = new Properties(System.getProperties());

    public static String getLineSeparator() {
        return PROPERTIES.getProperty("line.separator");
    }

    public static void main(String[] args) {
        String lineSeparator = System.getProperty(" ");

        System.out.println("Line separator is: " + P412_12_11_4.getLineSeparator());
    }
}
