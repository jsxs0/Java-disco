import java.util.*;
class String_Methods
{
	public static void main(String args[])
	{
		String s1,s2;
		s1="hello";
		s2="world";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.toLowerCase());
	}
}