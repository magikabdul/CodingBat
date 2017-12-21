package coding.bat.warmup.two;

public class WarmUpTwo {

    public String stringTimes(String str, int n) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            s.append(str);
        }

        return s.toString();
    }

    public String frontTimes(String str, int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.length() < 3) {
                sb.append(str);
            } else {
                sb.append(str.substring(0, 3));
            }
        }

        return sb.toString();
    }

    public int countXX(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.substring(i,i+1).equals(str.substring(i+1,i+2))) && str.substring(i, i + 1).equals("x")){
                count++;
            }
        }

        return count;
    }

    public boolean doubleX(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("x")) {
                return (str.substring(i + 1, i + 2).equals("x"));
            }
        }

        return false;
    }

    public String stringBits(String str) {
        boolean doReturn = false;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (doReturn == false) {
                doReturn = true;
                stringBuilder.append(str.substring(i, i + 1));
            } else {
                doReturn = false;
            }
        }

        return stringBuilder.toString();
    }

    public String stringSplosion(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, i));
        }

        sb.append(str);

        return sb.toString();
    }

    public int last2(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if(str.substring(str.length() - 2, str.length()).equals(str.substring(i, i+2))) { count++; }
        }

        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        return count;
    }

    public boolean arrayFront9(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (i < 4 && nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }

        return false;
    }

    public int stringMatch(String a, String b) {

        int count = 0;
        int loopRange = 0;

        if (a.length() <= b.length()) {
            loopRange = a.length();
        } else {
            loopRange = b.length();
        }

        for (int i = 0; i < loopRange - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }

        return count;
    }

    public String stringX(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else if (!str.substring(i, i + 1).equals("x")) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public String altPairs(String str) {

        int take = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (take == 0 || take == 1) {
                sb.append(str.charAt(i));
            }

            take++;
            if(take > 3) {
                take = 0;
            }
        }

        return sb.toString();
    }

    public String stringYak(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (str.substring(i, i + 1).equals("y")){
                if (i < str.length() - 2){
                    if (str.substring(i + 2, i + 3).equals("k")) {
                        i = i + 2;
                    } else {
                        stringBuilder.append(str.substring(i, i + 1));
                    }
                } else {
                    stringBuilder.append(str.substring(i, i + 1));
                }
            } else {
                stringBuilder.append(str.substring(i, i + 1));
            }
        }

        return stringBuilder.toString();
    }

    public int array667(int[] nums) {

        int count = 0;

        if(nums.length < 2) {
            return 0;
        } else {

            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] == 6 && nums[i] == nums[i + 1]) || (nums[i] == 6 && nums[i] == nums[i + 1] - 1)) {
                    count++;
                }
            }
            return count;
        }
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }

        return true;
    }

    public boolean has271(int[] nums) {

        if (nums.length < 3) {
            return false;
        } else {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1] - 5) {
                    if (nums[i] - 1 == nums[i + 2] || Math.abs( nums[i + 2] - (nums[i] - 1) ) <=  2) {
                        return true;
                    }
                }
            }

            return false;
        }
    }


























}