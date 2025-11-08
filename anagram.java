import java.util.Arrays;

class Main {
    public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";
            
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

    
    if(str1.length() != str2.length()){
        System.out.println("Not Anagram");
        return;
    }
    
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    if(Arrays.equals(arr1, arr2)){
        System.out.println("This is Anagram String");
    }else
    {
        System.out.println("This is not Anagram String");
    }
    }
}
