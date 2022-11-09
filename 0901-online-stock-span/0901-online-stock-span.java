class StockSpanner {
    Stack<Pair> prices;

    public StockSpanner() {
        prices = new Stack<>();
        
    }
    
    public int next(int price) {
        int span =1;
        
        while(!prices.empty() && prices.peek().price<=price){
            span +=prices.pop().span;
        }
        
        prices.add(new Pair(price,span));
        return span;
    }
    
    class Pair {
        public final int price;
        public final int span;
        Pair(int price,int span){
            this.price=price;
            this.span=span;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */