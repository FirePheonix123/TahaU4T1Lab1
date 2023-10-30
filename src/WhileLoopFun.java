public class WhileLoopFun {
    public WhileLoopFun () {
    }
    public void printDigits(int num) {
        int updatedNumber = num;
        while (updatedNumber > 0) {
            System.out.println(updatedNumber % 10);
            updatedNumber /= 10;
        }
    }
    public int countLetter(String word, String letter) {
        int idx = 0;
        int num = 0;
        while (idx < word.length()) {
            String nextLetter = word.substring(idx, idx + 1);
            if (nextLetter.equals(letter)){
                num ++;
            }
            idx ++;
        }
        return num;
    }

    public int maxDoubles(int num, int threshold) {
        int ans = 1;
        while (num < threshold) {
            num *= 2;
            if (num * 2 < threshold) {
                ans ++;
            }
//            System.out.println(num);
        }
        return ans == 1 ? 0 : ans;
    }


    public boolean isPrime (int num) {
        if (num == 1) {
            return false;
        } else if(num == 2) {
            return false;
        } else {
            if (num % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
