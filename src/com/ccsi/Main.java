package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        boolean b=searchInMatrix(matrix,0);
        System.out.println(b);
    }
    //write an efficient algorithm that searches for a value in an m X n matrix. This matrix has the
    //following properites.
    //Integers in each row are sorted from left to right. The first integer of each row is greater than
    //the last integer of previous row.

    public static boolean searchInMatrix(int[][] matrix,int target){
        if(matrix.length==0||matrix[0].length==0) return false;
        int rowNum=0;
        int colNum=matrix[0].length-1;
        while (rowNum<matrix.length&&colNum>=0){    //选择第一行最后一个数字开始比较
            if(matrix[rowNum][colNum]>target){
                colNum--;
            }else if(matrix[rowNum][colNum]<target){
                rowNum++;
            }else{
                return true;
            }
        }
        return false;
    }
}
