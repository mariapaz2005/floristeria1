package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

public class Main {
    public static void main(String[] args) {

        Proveedor provedor = new Proveedor();
        Proveedor proveedorLLeno = new Proveedor("carlos","floristeria real","3045000606",
                "3148405060","real@gmail.com","calle 50 # 40 - 60","medellin","colombia",
                "050011","20200505");

        System.out.println("Proveedor: "+proveedorLLeno.getNombre()
        +"-"+proveedorLLeno.getRazonSocial()
        +"-"+proveedorLLeno.getContacto()
        +"-"+proveedorLLeno.getTelefono()
        +"-"+proveedorLLeno.getCorreo()
        +"-"+proveedorLLeno.getDireccion()
        +"-"+proveedorLLeno.getCiudad()
        +"-"+proveedorLLeno.getPais()
        +"-"+proveedorLLeno.getCodigoPostal()
        +"-"+proveedorLLeno.getFechaRegistro());

        Repartidor repartidor = new Repartidor();
        Repartidor repartidorLLeno = new Repartidor("camilo","perez",
                "348790010","camilo@gmail.com","calle 50 # 80 - 100",
                "cali","colombia","056700","furgon",
                "EEW340");

        System.out.println("Repartidor: "+repartidorLLeno.getNombre()
        +"-"+repartidorLLeno.getApellido()
        +"-"+repartidorLLeno.getTelefono()
        +"-"+repartidorLLeno.getCorreo()
        +"-"+repartidorLLeno.getDireccion()
        +"-"+repartidorLLeno.getCiudad()
        +"-"+repartidorLLeno.getPais()
        +"-"+repartidorLLeno.getCodigoPostal()
        +"-"+repartidorLLeno.getTipoVehiculo()
        +"-"+repartidorLLeno.getNumeroLicencia()
        );

        Cliente cliente = new Cliente();
        Cliente clienteLLenno = new Cliente(
                "Juan",
                "Pérez",
                30,
                "juan.perez@email.com",
                "123456789",
                "Calle Falsa 123",
                "Madrid",
                "España",
                "28001",
                "2024-09-24"
        );

        System.out.println("Cliente: " +
                 clienteLLenno.getNombre() + "- " +
                clienteLLenno.getApellido() + "- " +
                clienteLLenno.getEdad() + "- " +
                clienteLLenno.getCorreo() + "- " +
                clienteLLenno.getTelefono() + "- " +
                clienteLLenno.getDireccion() + "- " +
                clienteLLenno.getCiudad() + "- " +
                clienteLLenno.getPais() + "- " +
                clienteLLenno.getCodigoPostal() + "- " +
                clienteLLenno.getFechaRegistro());

        Flor flor = new Flor();
        Flor florLLena = new Flor(
                "Rosa",
                "Rojo",
                "Perennial",
                5.0,
                "Templado",
                "Primavera",
                "1-2 semanas",
                15.99,
                "Riego regular y luz indirecta",
                "Eurasia"
        );

        // Mostrar información de la flor en una sola línea sin nombres de campos
        System.out.println("FLor: "+florLLena.getNombre() + " - " +
                florLLena.getColor() + " - " +
                florLLena.getTipo() + " - " +
                florLLena.getDiametro() + " cm - " +
                florLLena.getClimaIdeal() + " - " +
                florLLena.getTemporada() + " - " +
                florLLena.getDuracionFlorecimiento() + " - " +
                "$" + florLLena.getPrecio() + " - " +
                florLLena.getCuidados() + " - " +
                florLLena.getOrigen());

    }
}