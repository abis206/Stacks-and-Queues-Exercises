/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter14/e5-equals
*/

public static boolean equals(Stack < Integer > s1, Stack < Integer > s2) {
    Stack < Integer > aux = new Stack < Integer > ();
    if (s1.size() != s2.size()) {
        return false;
    } else {

        boolean same = true;
        while (same && !s1.isEmpty()) {
            int n = s1.pop();
            int ne = s2.pop();
            if (n != ne) {
                same = false;
            }
            aux.add(n);
            aux.add(ne);
        }
        while (!aux.isEmpty()) {
            s2.push(aux.pop());
            s1.push(aux.pop());
        }
        return same;
    }
}
