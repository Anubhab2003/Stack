import java.util.Stack;
public class Greater{
    public static void main(String args[]){
        int arr[]={7,24,76,2,46};
        Stack<Integer> s=new Stack<>();
        int nxtgreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgreater[i]=-1;
            }else{
                nxtgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int j=0;j<nxtgreater.length;j++){
            System.out.print(nxtgreater[j]+" ");
        }
        System.out.println();
    }
}