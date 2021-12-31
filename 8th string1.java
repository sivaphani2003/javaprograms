public class SubstringExample3   
{  
// main method  
public static void main(String argvs[])  
{  
String str[] =  
{  
"Praveen Kumar",  
"Yuvraj Singh",  
"Harbhajan Singh",  
"Gurjit Singh",  
"Virat Kohli",  
"Rohit Sharma",  
"Sandeep Singh",  
"Milkha Singh"  
};  
  
String surName = "Singh";  
int surNameSize = surName.length();  
  
int size = str.length;  
  
for(int j = 0; j < size; j++)  
{  
    int length = str[j].length();  
    // extracting the surname  
    String subStr = str[j].substring(length - surNameSize);  
      
    // checks whether the surname is equal to "Singh" or not  
    if(subStr.equals(surName))  
    {  
        System.out.println(str[j]);  
    }  
}  
  
}  
}  
/*Output:

Yuvraj Singh
Harbhajan Singh
Gurjit Singh
Sandeep Singh
Milkha Singh*/
