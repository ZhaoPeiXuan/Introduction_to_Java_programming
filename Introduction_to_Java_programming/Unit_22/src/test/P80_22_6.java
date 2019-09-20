package test;
/**
 * className : P80_22_6
 * package: test
 * Desciption : TODO
 *
 * @date : 2019/8/5 8:07
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P80_22_6
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/8/5 8:07
 *@Version : 1.0
 **/
public class P80_22_6 {
    public static void main(String[] args) {
        int n1 = 332;
        int n2 = 493;

        int sum0 = 0;
        for(int i = n1; i <= n2; i++) {
            sum0 += i;
        }

        System.out.println("sum0 = " + sum0);

        int sum1 = 0;
        sum1 = (n2-n1+1)*(n1+n2)/2;
        System.out.println("sum1 = " + sum1);
    }
}
