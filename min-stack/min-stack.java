import java.util.ArrayList;
import java.util.List;

class MinStack {
    int min = Integer.MAX_VALUE;
    List<Integer> list ;

    public MinStack() {
        list= new ArrayList<Integer>();
        
    }
    
    public void push(int val) {
        if(min>val)
            min=val;
        list.add(val);
        
        
    }
    
    public void pop() {
        if(list.size() == 0) return ;
        list.remove(list.size()-1);
        assignMinValue();
        
    }
    
    public int top() {
    return list.get(list.size()-1);
        
    }
    
    public int getMin() {
        return min;
    }
    private void assignMinValue(){
        min =Integer.MAX_VALUE;
        for (int n: list){
            if(n<min){
                min =n;
            }
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */