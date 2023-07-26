import java.util.ArrayList;

public class AddBinary {
    public String addBinary(String a, String b) {
        return toBinaryConverter((toIntegerconverter(a)+toIntegerconverter(b)));

    }
    public int toIntegerconverter(String a){
        int integer=0;
        for(int i=a.length();i!=0;i--){
            if((a.charAt(i-1)-'0') !=0)
             integer+=(Math.pow(2,  (a.length()-i)));
        }
        System.out.println(integer);
        return  integer;
    }
    public String toBinaryConverter(int a){
        String res= "";
        while (a>0){
            res+=(a%2);
            a=a/2;
        }
        String reversedStr = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            reversedStr += res.charAt(i);
        }
        return reversedStr;
    }
}
