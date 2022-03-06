package com.company;

public class SortArray {

    public static void main(String[] args) {
int[] arrNum = {2,2,5,5,2, 5, 5, 5, 2, 5, 2};

int sort = 0;
        for (int i= 0;i<=arrNum.length;i++) {
            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[i] > arrNum[j]) {
                    sort = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = sort;
                }
            }

            System.out.println(arrNum[i]);
        }
    }
}
