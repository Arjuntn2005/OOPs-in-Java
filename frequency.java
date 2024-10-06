import java.util.*;
public class frequency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int freq=0,i,j;
        System.out.print("Enter  the string :");
        String str = sc.nextLine();
        System.out.print("Enter the character to search :");
        char chr = sc.next().charAt(0);
        for  (i = 0;i<str.length();i++){
            if(str.charAt(i) == chr){
                freq++;
            }
        }
        System.out.println("the frequency of "+chr+" in the string is :" + freq);
}
}
    

