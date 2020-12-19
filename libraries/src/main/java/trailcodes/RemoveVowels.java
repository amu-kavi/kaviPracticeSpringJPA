package trailcodes;
import java.util.*;

public class RemoveVowels {

	public String removeVowelstype1(String name) {
		name = name.toLowerCase();
		if(name.contains("a")) {
			name=name.replace("a","");
		}
		if(name.contains("e")) {
			name=name.replace("e","");
		}
		if(name.contains("i")) {
			name=name.replace("i","");
		}
		if(name.contains("o")) {
			name=name.replace("o","");
		}
		if(name.contains("u")) {
			name=name.replace("u","");
		}
		return name;
	}
	public String removeVowelstype2(String name) {
		name = name.toLowerCase();
		char[] str= name.toCharArray();
		for(char c:str) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				name=name.replace(Character.toString(c),"");
		}
		return name;
	}
	
	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		System.out.println(removeVowels.removeVowelstype1("Kavitha"));
		System.out.println("------------------------------------");
		System.out.println(removeVowels.removeVowelstype2("Kavitha"));

	}

}
