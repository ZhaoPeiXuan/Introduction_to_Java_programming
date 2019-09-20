package Test;
/**
 * className : P356_overriding_main
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/16 11:18
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P356_overriding_main
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/16 11:18
 *@Version : 1.0
 **/
public class P356_overriding_main {
    public static void main(String[] args) {
        P356_overriding_extended p = new P356_overriding_extended();
        //普通重写
        System.out.println(p.toDefaultString());
        //测试参数列表
        System.out.println(p.toCustomString("6666"));
        //测试不对应参数列表
        System.out.println(p.toCustomStirng());
        //测试子类无法重写父类私有方法
        System.out.println(p.toPrivateString());
        //测试子类"重写"父类静态方法
        System.out.println(P356_overriding_extended.toStaticString());
        //验证父类静态方法可以继承，但需要使用静态方法使用父类方法
        System.out.println(P356_overriding_super.toStaticString());

        P356_overriding_super p2 = new P356_overriding_super();
        P356_overriding_super p3 = new P356_overriding_extended();
    }
}
