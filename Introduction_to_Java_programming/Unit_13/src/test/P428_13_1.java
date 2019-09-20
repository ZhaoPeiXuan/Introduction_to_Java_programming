package test;
/**
 * className : P428_13_1
 * package: test
 * Desciption : TODO
 *
 * @date : 2019/7/21 16:21
 * @author : ZhaoPeiXuan
 */

/**
 *@ClassName : P428_13_1
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/21 16:21
 *@Version : 1.0
 **/
public class P428_13_1 {
    //测试抽象类
}

//1.有错，抽象方法不能有方法主体
/*class A {
    abstract void unfinished() {

    }
}*/

//2.错，位置颠倒了
/*
public class abstract A {
    abstract void unfinished();
        }*/

//3.错，抽象方法必是抽象类
/*
class A {
    abstract void unfinished();
}*/


//4.普通方法应该有方法体
/*
abstract class A {
    protected void unfinished();
}*/


//5.对
/*
abstract class A {
    abstract void unfinished();
}*/


//6.对
/*
abstract class A {
    abstract int unfinished();
}*/
