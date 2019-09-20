package test;
/**
 * className : P81_22_7
 * package: test
 * Desciption : TODO
 *
 * @date : 2019/8/5 8:34
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P81_22_7
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/8/5 8:34
 *@Version : 1.0
 **/
public class P81_22_7 {


    public static int f(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            int temp = f(a, n / 2);
            if (n % 2 == 0) {
                return temp * temp;
            }
            else {
                return a * temp * temp;
            }
        }
    }
}
