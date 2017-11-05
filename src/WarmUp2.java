public class WarmUp2 {

    public String stringTimes(String str, int n) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            s.append(str);
        }

        return s.toString();
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                return false;
            }
        }

        return true;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i ++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        return count;
    }

    
}

class App {

    public static void main(String[] args) {
        WarmUp2 w = new WarmUp2();

        //System.out.println(w.());
    }



}