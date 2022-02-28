package indi.sky.algorithm.basic;

import java.util.ArrayList;
import java.util.List;

public class findPrimeNumber {
    public static void main(String[] args){
        int[] prime = findPrime(10);
        for (int i = 0; i < prime.length; i++) {
            System.out.println(prime[i]);
        }
    }

    public void printPrime(){
        int aa[]=new int [101];
        aa[2]=0;
        int k=2,tt=0;
        while(tt<101) {
            for(int i=1; i<aa.length; i++){ //将不是素数的数筛出
                if(i%k == 0 && i != k) aa[i]=1;
            }
            for(int i=1; i<aa.length; i++){ //将筛选后的第一个数当做新的筛子
                if(i>k && aa[i]==0){
                    k=i;
                    break;
                }
            }
            tt++;
        }

        for(int i=1; i<aa.length; i++)
            if(aa[i]==0) System.out.printf("%d ",i);
    }

    /**
     * 返回小于n的全部素数
     * @param n
     * @return
     */
    public static int[] findPrime(int n){
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[n];
        arr[2] = 0;
        int k = 2;
        for (int i = 0; i < n; i++) {
            if (i%k == 0 && i!=k ){
                arr[i] = 1;
            }
            for (int j = 0; j < n; j++) {
                if (j<i && arr[j]==0){
                    k = i;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                res.add(1);
            }
        }
        int[] ints = res.stream().mapToInt(Integer::valueOf).toArray();
        return ints;
    }

}

