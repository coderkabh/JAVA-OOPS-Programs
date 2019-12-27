/*

A men just shifted to a new house. He has to find the shortest path to reach his office.
The key points for the problem are:- He can move as much as possible in any direction,
He is to reach his office by shortest path.
The input will be provided as a string.
The output should be a string.
All the path will be E,W,N and S as East, West, North and South respectively.

*/

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        StringBuffer str = new StringBuffer(input.toUpperCase());


        System.out.println("Your input is: "+str);

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
