// equals() vs ==
class EqualsNotEqualTo {
public static void main(String args[]) {
String s1 = "Hello";
String s2 = new String(s1);
System.out.println(s1 + " equals " + s2 + " -> " +
s1.equals(s2));
System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
}
}
/*The variable s1 refers to the String instance created by “Hello”. The object referred to by
s2 is created with s1 as an initializer. Thus, the contents of the two String objects are identical,
but they are distinct objects. This means that s1 and s2 do not refer to the same objects and
are, therefore, not ==, as is shown here by the output of the preceding example:

output:
Hello equals Hello -> true
Hello == Hello -> false*/
