package java_programs_interview;

/*Write a Java Program to reverse a string without using String inbuilt function.*/
public class ReverseString_wostringinbuilt {
	

        public static void main(String[] args) {
                 // TODO Auto-generated method stub
                 String str = "Automation";
                 StringBuilder str2 = new StringBuilder();
                 str2.append(str);
                 str2 = str2.reverse();     // used string builder to reverse
                 System.out.println(str2);
        }

}