package comZorba;

import java.util.Scanner;

public class firstCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value ");
        int n = sc.nextInt();
        String[] name = new String[n];

      for( int i =0; i<name.length; i++) {
          System.out.println("input array");
          name[i] = sc.next();
      }
        for(int j = 0; j< name.length; j++){
            System.out.println(name[j] );
        }

      }


    }


