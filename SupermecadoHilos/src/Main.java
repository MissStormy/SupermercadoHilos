import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1",
                new int[]{2,2,1,4,2,3});
        Cliente cliente2 = new Cliente("Cliente 2",
                new int[]{1,2,5,1,1});
        Cliente cliente3 = new Cliente("Cliente 3",
                new int[]{1,2,5,1,1});

        long initialTime = System.currentTimeMillis();
        //System.out.println(initialTime);

        CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);
        CajeraThread cajera3 = new CajeraThread("Cajera 3", cliente3, initialTime);

        cajera1.run();
        cajera2.run();
        cajera3.run();
    }
}