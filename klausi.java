import java.net.NetPermission;

import java.util.Scanner;

class billboard {
    static void showBillboard(String message) {
        assert message.length() < 84;
        int l = message.length();
        int i = 0;
        int k = 0;
        String border = "";
        String whitespace = "";
        String whitespaceMsg = "";
        String maxSize = "";
        String extra = message.length()%2 == 0 ? " " : "";

        while(i < l/2) {
            i++;
            border += "-";
            whitespace += " ";
        }
        maxSize = "|" + whitespace + "                     " + whitespace + "|";
        int shift = maxSize.length()/2 - message.length()/2;

        while(k < shift - 1) {
            k++;
            whitespaceMsg += " ";
        }

        System.out.println(whitespace + "        " + "\\|||||/");
        System.out.println(whitespace + "        " + "( O O )");
        System.out.println("|" + border + "--ooO----(_)---------" + border +"|");
        System.out.println(maxSize);
        System.out.println("|" + whitespaceMsg + message + whitespaceMsg + extra + "|");
        System.out.println(maxSize);
        System.out.println("|" + border + "----------------Ooo--" + border +"|");
        System.out.println(whitespace + "        " + "|_| |_|");
        System.out.println(whitespace + "        " + " " + "|| ||");
        System.out.println(whitespace + "        " + "ooO Ooo");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte den Text für Klaus eingeben: ");
        String input = scan.nextLine();
        scan.close();
        showBillboard(input);
    }
}