package Test;
/**
 * className : P356_overriding_extended
 * package: Test
 * Desciption : TODO
 *
 * @date : 2019/7/16 11:14
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P356_overriding_extended
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/16 11:14
 *@Version : 1.0
 **/
public class P356_overriding_extended extends P356_overriding_super {
    //测试子类重写父类方法

    //普通重写默认方法
    @Override
    public String toDefaultString() {
        return "重写的" + super.toDefaultString();
    }

    //相同的方法名和参数列表返回值类型就是重写
    @Override
    public String toCustomString(String castom) {
        return "相同的方法名和参数列表返回值类型";
    }

    //不同的参数列表，相同的方法名和返回值类型，则跟父类的方法是两个方法
    public String toCustomStirng() {
        return "不同的参数列表，相同的方法名和返回值类型";
    }

    //父类的私有方法和子类的方法就算是相同的方法名和参数列表返回值类型
    //这不是重写,而是两个方法，而且父类方法无法在子类被调用
    public String toPrivateString() {
        return "父类私有方法，子类无法重写";
    }

    //静态方法可以被继承，但是不能被覆盖
    public static String toStaticString() {
        return "子类静态方法";
    }
}
