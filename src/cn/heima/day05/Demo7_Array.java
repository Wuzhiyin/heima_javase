package cn.heima.day05;

import java.util.Scanner;

/**
 * <p>Title: Demo7_Array</p>
 * <p>Description: </p>
 * <p>Company: www.wilson.com</p>
 *
 * @author Wilson
 * @version 1.0
 * @date 2019-06-23 10:57
 */
public class Demo7_Array {
    /*
     * A:案例演示
     * 数组查表法(根据键盘录入索引,查找对应星期)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对应的星期范围在1-7");
        int week = sc.nextInt();

        System.out.println("星期" + getWeek(week));
    }

	/*
	根据索引返回对应的星期
	1,返回值类型char
	2,参数列表int week
	*/

    public static char getWeek(int week) {
        char[] arr = {' ','一','二','三','四','五','六','日'};		//定义了一张星期表
        return arr[week];											//通过索引获取表中的元素
    }
}
