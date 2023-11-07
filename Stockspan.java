import java.util.Stack;
public class Stockspan{
    public static void Stockspan_fun(int Stocks[],int Span[]){
        Stack<Integer> s=new Stack<>();
        Span[0]=1;
        s.push(0);
        for(int i=1;i<Stocks.length;i++){
            int currprice=Stocks[i];
            while(!s.isEmpty() && currprice> Stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                Span[i]=i+1;
            }else{
                int prevHigh=s.peek();
                Span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int Stocks[]={100,80,60,70,60,85,100};
        int Span[]=new int[Stocks.length];
        Stockspan_fun(Stocks,Span);
        for(int i=0;i<Span.length;i++){
            System.out.println(Span[i]+" ");
        }

    }
}