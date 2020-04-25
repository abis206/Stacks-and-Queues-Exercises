/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter14/e1-splitStack
*/ 

public static void splitStack(Stack < Integer > s) {
    Queue < Integer > q = new LinkedList < Integer > ();
    while (!s.isEmpty()) {
        if (s.peek() > 0) {
            int n = s.pop();
            q.add(n);
        }
    }
    while (!q.isEmpty()) {
        int n = q.remove();
        s.push(n);
    }
}
