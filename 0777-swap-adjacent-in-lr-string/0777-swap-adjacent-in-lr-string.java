class Solution {
    public boolean canTransform(String start, String result) {

        int i = 0;
        int j = 0;
        int n = start.length();

        while (i < n || j < n) {

            // Skip X
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }

            while (j < n && result.charAt(j) == 'X') {
                j++;
            }

            // Both reached the end
            if (i == n && j == n) {
                return true;
            }

            // One reached the end
            if (i == n || j == n) {
                return false;
            }

            // Characters must be same
            if (start.charAt(i) != result.charAt(j)) {
                return false;
            }

            char ch = start.charAt(i);

            // L can only move left
            if (ch == 'L' && i < j) {
                return false;
            }

            // R can only move right
            if (ch == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}