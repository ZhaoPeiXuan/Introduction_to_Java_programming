package test;
/**
 * className : P14_static
 * package: test
 * Desciption : TODO
 *
 * @date : 2019/7/24 20:23
 * @author : ZhaoPeiXuan
 */

import javax.xml.ws.Response;

/**
 *@ClassName : P14_static
 *@Deseription : TODO
 *@Author : ZhaoPeiXuan
 *@Date : 2019/7/24 20:23
 *@Version : 1.0
 **/
public class P14_static<E> {
    public static <E> void m(E o1) {

    }

    public static <T> Response<T> test(T t) {

        return null;
    }

    //禁止静态方法里用泛型数据域
    //public static E o1;

    static {

    }

    public static void a() {
        int dd = 1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
