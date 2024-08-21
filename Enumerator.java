import java.util.Enumeration;
import java.util.Vector;
public class Enumerator {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0; i<=10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            Integer I = (Integer)e.nextElement();
            if(I%2 == 0)
                System.out.println(I);
        }
        System.out.println(v);
    }
}


//Limitations of Enumeation
// Enumeration Concept is Applicable Wnly for Legacy Classes and it is Not a Universal Cursor|
// By using Enumeration we can Perform Read Wperation and we can't Perform Remove Wperation.
//To Wvercome Above Limitations we should go for Iterator.



//ListItertorDefines the following 9 Methods.
//public boolean hasNext()
//public Object next()
//public int nextIndex()
//public boolean hasPrevious()
//public Object previous()
//public int previousIndex()
//public void remove()
//public void set(Object new)
//public void add(Object new)

