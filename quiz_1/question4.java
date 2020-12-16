public class question4 {
    public static void main(String[] args) {
        System.out.println(bobThere("baaaaaaaaaaaaaaaaaaacdfwergergefcesdbabertueugetrbhgppit3n45098yh"));
    }   
    
    public static boolean bobThere(String words) {
        int streak = 0;
        int prevStreak = 0;
        for (char i : words.toCharArray()) {
            if (streak == 0) {
                if (i == 'b') {
                    streak++;
                }
            } else if (streak == 1) {
                streak++;
            } else if (streak == 2) {
                if (i == 'b') {
                    streak++;
                }
            }
            if (streak == 3) {
                return true;
            }
            if (streak == prevStreak && streak > 0) {
                streak = 0;
            }
            prevStreak = streak;
        }
        return false;
    }
}
