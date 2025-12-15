package casoscooter;

public class Casoscooter {

    // El método main es el punto de entrada de la aplicación.
    public static void main(String[] args) {

        // 1) Creamos una Empresa indicando su nombre
        Empresa empresa = new Empresa("scootin");

        // 2) Creamos algunos Puestos de ejemplo (cargo que tendrá cada empleado)
        Puesto vendedor = new Puesto("VEN", "Vendedor");
        Puesto supervisor = new Puesto("SUP", "Supervisor");

        // 3) Creamos Empleados usando el constructor vacío + setters (paso a paso)
        Empleado e1 = new Empleado();
        e1.setRut("12.345.678-9");
        e1.setNombreCompleto("Ana Pérez");
        e1.setGenero("F");
        e1.setAniosServicio(2);
        e1.setEdad(27);
        e1.setPuesto(vendedor);

        Empleado e2 = new Empleado();
        e2.setRut("9.876.543-2");
        e2.setNombreCompleto("Juan Soto");
        e2.setGenero("M");
        e2.setAniosServicio(5);
        e2.setEdad(33);
        e2.setPuesto(supervisor);

        Empleado e3 = new Empleado();
        e3.setRut("22.222.222-2");
        e3.setNombreCompleto("María Ruiz");
        e3.setGenero("F");
        e3.setAniosServicio(1);
        e3.setEdad(24);
        e3.setPuesto(vendedor);

        // 4) Agregamos los empleados a la empresa
        System.out.println("Agregar e1: " + empresa.agregarEmpleado(e1)); // true
        System.out.println("Agregar e2: " + empresa.agregarEmpleado(e2)); // true
        System.out.println("Agregar e3: " + empresa.agregarEmpleado(e3)); // true

        // Intento de agregar e1 de nuevo (mismo RUT): debe ser false (no permite duplicados)
        System.out.println("Agregar repetido e1: " + empresa.agregarEmpleado(e1));

        // 5) Listamos los empleados actuales
        empresa.listarEmpleados();

        // 6) Buscamos un empleado por su RUT
        String rutABuscar = "9.876.543-2";
        Empleado buscado = empresa.buscarEmpleado(rutABuscar);
        if (buscado != null) {
            System.out.println("Buscar por RUT " + rutABuscar + ": " + buscado.toString());
        } else {
            System.out.println("Buscar por RUT " + rutABuscar + ": no encontrado");
        }

        // 7) Eliminamos un empleado por RUT
        String rutAEliminar = "12.345.678-9";
        boolean eliminado = empresa.eliminarEmpleado(rutAEliminar);
        System.out.println("Eliminar " + rutAEliminar + ": " + eliminado);

        // 8) Volvemos a listar para ver el estado final
        empresa.listarEmpleados();

        // 9) Mostramos la cantidad total de empleados actuales
        System.out.println("Cantidad actual de empleados: " + empresa.cantidadEmpleados());
    }
}
