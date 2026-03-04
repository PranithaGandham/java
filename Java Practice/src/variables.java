import java.math.BigDecimal;

public class variables {

    public static void main( String args[]){

        /*
        Integer --> long(8), int(4), short(2), byte(1)
        Float   --> float(4), double(8) [default]
        Char    --> char(2)['']
        Boolean --> bool(1)
        */

        /*
        Type Casting -> lower to higher is possible 
        if we cant to explicitly convert :
            b = (byte)a;  
        */

        byte b = 125;
        int a  = b;
        System.out.println(a);


    }
    
}
