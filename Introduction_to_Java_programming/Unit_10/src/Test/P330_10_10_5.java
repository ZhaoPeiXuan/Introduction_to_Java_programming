package Test;
/**
 * className : P330_10_10_5
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/15 16:08
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P330_10_10_5
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/15 16:08
 *@Version : 1.0
 **/
public class P330_10_10_5 {
    //测试字符数组转换为字符串
    public static void main(String[] args) {
        char[] dst = {'j', 'a', 'v', 'a'};
        String str = new String(dst);
        //String str0 = String(dst);
        String str1 = new String(new char[]{'j', 'a', 'v', 'a'});
        String str2 = String.valueOf(dst);

    }
}
