package java1;

import java.util.ArrayList;
import java.util.Arrays;

public class Oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("abebe","kebede","alemu","yonas"));
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
		arrayList.add(0,"biniam");
		arrayList.add("birhanu");
		arrayList.set(0, "bereket");
		arrayList.remove("yonas");
		
		arrayList.remove(0);
		System.out.println(arrayList);

	}

}
