package week4.day3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -05 -11
 * Time: 21:15
 */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int count = scanner.nextInt();
            scanner.nextLine();
            String use = scanner.nextLine();
            int choice = 1;
            int pageS = 1;
            int pageE = 4;
            if (count <= 4) {
                char[] useing = use.toCharArray();
                for (int i = 0; i < useing.length; i++) {
                    if(useing[i] == 'U') {
                        if (choice == 1) {
                            choice = count;
                        }else {
                            choice--;
                        }
                    }else {
                        if(choice == count) {
                            choice = 1;
                        }else {
                            choice++;
                        }
                    }
                }
                for (int i = 0; i < count; i++) {
                    if(i == count-1) {
                        System.out.println(i+1);
                        continue;
                    }
                    System.out.print(i+1 + " ");
                }
                System.out.println(choice);
            }else {
                char[] useing = use.toCharArray();
                for (int i = 0; i < useing.length; i++) {
                    if(useing[i] == 'U') {
                        if (choice == 1) {
                            choice = count;
                            pageE = count;
                            pageS = pageE - 3;
                        }else if (choice > pageS) {
                            choice--;
                        }else {
                            choice--;
                            pageE--;
                            pageS--;
                        }
                    }else {
                        if(choice == count) {
                            choice = 1;
                            pageS = 1;
                            pageE = pageS+3;
                        }else if (choice < pageE){
                            choice++;
                        }else {
                            choice++;
                            pageE++;
                            pageS++;
                        }
                    }
                }
                for (int i = pageS-1; i <= pageE-1; i++) {
                    if(i == pageE-1) {
                        System.out.println(i+1);
                        continue;
                    }
                    System.out.print(i+1 + " ");
                }
                System.out.println(choice);
            }
        }
    }

}
