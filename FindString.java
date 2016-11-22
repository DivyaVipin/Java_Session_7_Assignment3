import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main string");
		String mainString=sc.nextLine();
		System.out.println("Enter the sub string");
		String subString=sc.nextLine();
		
	    char[] mainStringArray = mainString.toCharArray();
	    char[] subStringArray = subString.toCharArray();
	    boolean found=isPresent(subStringArray,mainStringArray);
	    if(found)
	    {
	    	System.out.println("SubString found:"+found);
	    }
	    else
	    {
	    	System.out.println("SubString not found:"+found);
	    }
	}

	public static boolean isPresent(char[] sub, char[] main) {
	    for (int i = 0; i < main.length - sub.length+1; i++) {
	        for (int j = 0; j < sub.length; j++) {
	            if (main[i + j] == sub[j]) {
	                if (j == sub.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}

	}
