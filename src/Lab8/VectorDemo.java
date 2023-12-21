package Lab8;
import java.util.Vector;
import java.util.StringTokenizer;
public class VectorDemo {
    public static void main(String[] args){
        Vector<String> v = new Vector<String>();
        String s = "Строка, яку ми хочемо розібрати на слова.";
        StringTokenizer st = new StringTokenizer(s,"\t\n\r,.");
        while (st.hasMoreTokens()){
            v.add(st.nextToken());
        }
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.setSize(4);
        v.add("Зібрати");
        v.set(3, "Знову");
        for(String sItem: v)
            System.out.println(sItem + " - ");
        System.out.println();
    }
}
