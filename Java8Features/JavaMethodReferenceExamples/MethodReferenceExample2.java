package JavaMethodReferenceExamples;

//we are using predefined functional interface Runnable to refer static method.
public class MethodReferenceExample2 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReferenceExample2::ThreadStatus);  
        t2.start();       
    }  
}  