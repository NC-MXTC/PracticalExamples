package mx.edu.j2se.lectures.examples.lecture4.p2innerclasses;

public class WithLocalClass {

    String message = "Class message";

    void useLocalClass() {
        String message = "Method message";
        {
            //Local class inside a block of code
            class LocalClass {
                String getMethodMessage() {
                    return message;
                }
                String getAllMessages() {
                    return String.format("OuterMessage %s -- Method message %s",
                            WithLocalClass.this.message,
                            message
                    );
                }
            }
            LocalClass l = new LocalClass();
            System.out.println("With local class");
            System.out.println(l.getMethodMessage());
            System.out.println(l.getAllMessages());
        }
//        LocalClass local = new LocalClass(); //Outside the block scope the class no longer exists
    }
}
