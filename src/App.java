public class App {
    public static void main(String[] args) throws Exception {
       Queue<Character> queue1 = new Queue<Character>();
    queue1.push('S');
    System.out.println(queue1);
    queue1.push('A');
    System.out.println(queue1);
    queue1.push('M');
    System.out.println(queue1);
    queue1.push('A');
    System.out.println(queue1);
    queue1.push('N');
    System.out.println(queue1);
    queue1.pop();
    System.out.println(queue1);
    queue1.pop();
    System.out.println(queue1);
    queue1.pop();
    System.out.println(queue1);
    queue1.pop();
    System.out.println(queue1);
    queue1.pop();
    }
}