import java.util.Stack;
public class Reverse{
    public static void reverse(Stack<Integer> s){
        Stack<Integer> t=new Stack<>();
        // if(s.isEmpty()){
        //     t.push(top);
        //     return;
        // }
        int top=s.pop();
        t.push(top);
        reverse(s);
        // if(s.isEmpty()){
        //     t.push(top);
        //     return;
        // }

        while(!t.isEmpty()){
            System.out.println(t.pop());
        }

    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        reverse(s);
        
    }
}