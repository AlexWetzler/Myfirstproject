package com.company;

public class Challenge2v2 {
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Top();
        Bottom();
        Line();
    }
        public static void Line() {
            System.out.print("+");
            for (int dash = 0; dash < 9; dash++) {
                System.out.print("-");
            }
            System.out.println("+");
        }
        public static void Top() {
            for (int top = 1; top < 4; top++){
                System.out.print("|");
                for (int spaces = 4; spaces > top; spaces--) {
                    System.out.print(" ");
                }
                for (int slashes = 0; slashes <top; slashes++){
                    System.out.print("/");
                }
                System.out.print("*");
                for (int bslashes = 0; bslashes <top; bslashes++) {
                    System.out.print("\\");
                }
                for (int spaces = 4; spaces > top; spaces--) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            }

        public static void Bottom() {
            for (int top = 4; top > 1; top--){
                System.out.print("|");
                for (int spaces = 5; spaces > top; spaces--) {
                    System.out.print(" ");
                }
                for (int slashes = 1; slashes < top; slashes++){
                    System.out.print("\\");
                }
                System.out.print("*");
                for (int bslashes = 1; bslashes < top; bslashes++) {
                    System.out.print("/");
                }
                for (int spaces = 5; spaces > top; spaces--) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
}
