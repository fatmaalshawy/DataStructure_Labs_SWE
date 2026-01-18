
package Stack;

public class MainStack {
    public static void main(String[] args) {
        //  DLinkedListStack<String> lstack= new DLinkedListStack<String>();
        ArrayStack<String> aStack= new ArrayStack<String>(5);

        aStack.push("ali");
        aStack.push("saleh");
        aStack.push("ahmed");
        aStack.push("mohammed");
        aStack.pop();
        aStack.pop();
        System.out.println("top is "+aStack.top());

        aStack.display();

//        while (!aStack.isEmpty()){
//            System.out.println(aStack.pop());
//        }
//        lstack.pop();
//        lstack.pop();
        // lstack.display();
    }
}
