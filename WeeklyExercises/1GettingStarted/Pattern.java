class Pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = -n + 1; i < n; i++) {
            int spaces = Math.abs(i);
            int stars = 2 * (n - spaces) - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
