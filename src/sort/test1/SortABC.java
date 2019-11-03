package sort.test1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SortABC {
    public static void main(String[] args) {
        int a = 8562, b = 4, c = 304;
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("排序之后：a="+a+",b="+b+",c="+c);
    }
}
