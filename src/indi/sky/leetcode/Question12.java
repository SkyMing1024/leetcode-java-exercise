package indi.sky.leetcode;

/**
 * 12. 整数转罗马数字
 */
public class Question12 {

    int[] a = {1,5,10,50,100,500,1000};
    String[] b = {"I"," V"," X"," L","C","D","M"};

    /**
     * Description : 优秀解答
     */
    public String intToRoman0(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] reps={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res="";
        for(int i=0; i<13; i++){
            while(num>=values[i]){
                num -= values[i];
                res += reps[i];
            }
        }
        return res;
    }

    public static void main(String[] args){
        Question12 question = new Question12();
        String res = question.intToRoman0(3);
        System.out.println("res:"+res);
    }
}
