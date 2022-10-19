public class Queue<T> {
    public Node<T> first;
    public void push(T value){
        Node<T> temp = new Node<T>(value);
        if (first == null){
            first = temp;
        }else{
            Node<T> container = first;
            while(container.getNext() != null){
                container = container.getNext();
            }container.setNext(temp);
        }
    }
    public boolean hasPop(){
        return first != null;}
    
    public void pop(){
        if(this.hasPop()){
            first = first.getNext();
        }
    }
    @Override
    public String toString(){
        Node<T> temp = first;
        String str = temp.toString();
        while (temp.getNext()!= null){
            temp = temp.getNext();
            str = str + temp.toString();
        }
        return str;
    }
}