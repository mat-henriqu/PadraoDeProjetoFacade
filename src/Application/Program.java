package Application;

import facade.Facade;

public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "38421034");
    }
}
