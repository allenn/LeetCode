package com.github.xudong.leetcode.quicksort;

/**
 * Created by allen on 16/2/7.
 */
public class Solution {
    public int[] quickSort(int[] values){
      subQuickSort(values, 0, values.length -1);
        return values;
    }

    private void subQuickSort(int[] values, int minIdx, int maxIdx){
        if(minIdx < maxIdx){
            int i = partiton(values, minIdx, maxIdx);
            subQuickSort(values, minIdx, i -1);
            subQuickSort(values, i+1, maxIdx);
        }
    }

    private int partiton(int[] values , int minIdx, int maxIdx){
        int x = values[minIdx];
        while (minIdx < maxIdx){
            while (minIdx < maxIdx && values[maxIdx] >= x){
                maxIdx --;
            }
            if(minIdx < maxIdx){
                values[minIdx] = values[maxIdx];
                minIdx ++;
            }

            while (minIdx < maxIdx && values[minIdx] < x){
                minIdx ++;
            }
            if(minIdx < maxIdx){
                values[maxIdx] = values[minIdx];
                maxIdx --;
            }
        }
        values[minIdx] = x;

        return minIdx;
    }
}
