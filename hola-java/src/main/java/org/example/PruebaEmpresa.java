package org.example;

public class PruebaEmpresa {
    static void main(String[] args) {
        Gerente Virginia = new Gerente("Virginia", 1600, 500);

        Programador Jose = new Programador("Jose", 1400, 12);

        Virginia.mostrarInfo();
        Jose.mostrarInfo();

        Empleado[] empleados = {Virginia, Jose};

        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
        }
    }
}
