package com.mystudy.java;

import com.mystudy.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2019-12-13 12:45
 */
public class TemplateTest {
    //模板六：prsf:private String static final
    private static final Customer CUSTOMER = new Customer();
    //变形：psf


    //模板一
    public static void main(String[] args) {
        //模板二
        System.out.println("hello!");
        //变形：soutp/soutm/soutv/xx.sout
        System.out.println("args = [" + args + "]");//输出方法参数

        System.out.println("TemplateTest.main");//输出方法名

        System.out.println("args = " + args);//输出变量

        //模板三：fori
        String[] arr = new String[]{"tom","韩梅梅","梨花"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四；list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(235);
        list.add(456);
        for (Object o : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形；list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板5：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn
        if (list != null) {

        }


    }

}
