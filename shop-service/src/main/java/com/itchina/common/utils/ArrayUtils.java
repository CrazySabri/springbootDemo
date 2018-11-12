package com.itchina.common.utils;

/**
 * @author: sabri
 * @date: 2018/9/16 17:17
 * @description:
 */
public class ArrayUtils {

    /**
     * 找出一组元素中最大者的泛型方法
     * @param arr
     * @param <T>
     * @return
     */
    public static <T extends Comparable<? super T>> T findMax(T[] arr) {
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(arr[maxindex]) > 0) {
                maxindex = i;
            }
        }
        return arr[maxindex];
    }
}
