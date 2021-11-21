public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums){
            int digits = _countDigits(a);
            if (digits % 2 ==0) {
                count++;
            }
        }
        return count;
    }
    private static int _countDigits (int a){
        int count = 0;
        int result = a;
        while (result != 0 ){
            result = a/10;
            a = result;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,22,6,7896};
        System.out.println(findNumbers(nums));
    }
}
