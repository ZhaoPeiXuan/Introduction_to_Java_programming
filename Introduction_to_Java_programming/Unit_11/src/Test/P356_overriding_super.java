package Test;
/**
 * className : P356_overriding_super
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/16 11:02
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P356_overriding_super
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/16 11:02
 *@Version : 1.0
 **/
public class P356_overriding_super {
    //作为测试重写的父类
    private String str = "NuLL";

    public P356_overriding_super() {

    }

    public P356_overriding_super(String str) {
        this.str = str;
    }

    //普通方法
    public String toDefaultString() {
        return "AA" + str;
    }

    //带参方法,测试重写要求
    public String toCustomString(String customStr) {
        return customStr + str;
    }

    //私有方法
    private String toPrivateString() {
        return "BB" + str;
    }

    //静态方法
    public static String toStaticString() {
        return "CC";
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
