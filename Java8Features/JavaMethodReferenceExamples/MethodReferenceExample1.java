package JavaMethodReferenceExamples;
interface Sayable{  
    void say();  
}  
public class MethodReferenceExample1 {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReferenceExample1::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
