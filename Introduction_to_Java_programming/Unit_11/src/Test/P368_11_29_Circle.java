package Test;
/**
 * className : P368_11_29_Circle
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/17 10:53
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P368_11_29_Circle
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/17 10:53
 *@Version : 1.0
 **/
public class P368_11_29_Circle {
    double  radius;

    //错误示范
    /*public boolean equals(P368_11_29_Circle circle) {
        return this.radius == circle.radius;
    }*/

    //正确重写
    public boolean equals(Object circle) {
        return this.radius == ((P368_11_29_Circle)circle).radius;
    }
}
