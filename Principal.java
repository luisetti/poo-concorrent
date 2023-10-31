public class Principal {
    public static void main(String[] args) {
        Processo proc1 = new Processo("Leo",17, 1);
        Processo proc2 = new Processo("yara", 17, 2);
        Processo proc3 = new Processo("luis", 2, 3);
        proc1.start();
        proc2.start();
        proc3.start();
    }
}
