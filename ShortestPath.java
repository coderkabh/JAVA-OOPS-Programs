/* Solution for shortest path problem */

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='N'){
                for (int j=0; j<str.length();j++){
                    if (str.charAt(j)=='S'){
                        str.deleteCharAt(j);
                        str.deleteCharAt(i);
                    }
                }
            }
            else if(str.charAt(i)=='S'){
                for (int j=0; j<str.length();j++){
                    if (str.charAt(j)=='N'){
                        str.deleteCharAt(j);
                        str.deleteCharAt(i);
                    }
                }
            }
        }

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='E'){
                for (int j=0; j<str.length();j++){
                    if (str.charAt(j)=='W'){
                        str.deleteCharAt(j);
                        str.deleteCharAt(i);
                    }
                }
            }
            else if (str.charAt(i)=='W'){
                for (int j=0; j<str.length();j++){
                    if (str.charAt(j)=='E'){
                        str.deleteCharAt(j);
                        str.deleteCharAt(i);
                    }
                }
            }
        }
        String str2 = str.toString();
        if (str2.length()==0){
            System.out.println("Already in office!");
        }
        else {
            System.out.println("The shortest path is : "+str2);

        }

    }
}
