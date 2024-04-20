package herança.empresa;

import javax.sql.rowset.spi.SyncResolver;

public class system {

    public static void main(String[] args) {
        
        Engenheiro eng1 = new Engenheiro("filype",  000,  123,  "crea1",  "orientação",  100000.0);
        Engenheiro eng2 = new Engenheiro("tongo",  202,  125,  "crea2",  "orientavrau",  300000.0);

        gerente gen1 = new gerente("pedro", 002, 127, 2, 8000.0);

        diretor dir1 = new diretor("juan", 032, 475, 90000.0, 4);
        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println(gen1);
        System.out.println(dir1);
    }
    
}
