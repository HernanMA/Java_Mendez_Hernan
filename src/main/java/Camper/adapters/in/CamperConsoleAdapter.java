package Camper.adapters.in;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hernan
 */
import Camper.application.camperService;
import Camper.domain.models.Camper;
import java.util.Scanner;
import java.util.Optional;

public class CamperConsoleAdapter {
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese la opción que quiere hacer:");
            System.out.println("1. Añadir Camper");
            System.out.println("2. Actualizar Camper");
            System.out.println("3. Ver Camper");
            System.out.println("4. Eliminar Camper");
            System.out.println("5. Ver todos los camper");
            System.out.println("6. Actualizar Trainer");
            System.out.println("7. Ver Salones");
            System.out.println("8. Asignar Notas");
            System.out.println("9. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                
                case 1:
                    System.out.println("Ingrese los siguientes datos para añadir al camper a la base de datos: ");
                    String createCamper = scanner.nextLine();
                    break;
                    
                    Camper newCamper = new Camper(createCamper);
                    camperService.createCamper(newCamper);
                    break;
                    
                case 2: 
                    System.out.println("Ingrese el ID del camper que desee Actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Ingrese el nuevo nombre del camper: ");
                    String updateName = scanner.nextLine();
                    
                    Camper updatedCamper = new Camper(updateId, updateName);
                    camperService.updateCamper(updatedCamper);
                    break;
                    
                case 3:
                    System.out.print("Ingrese el ID del camper que desea visualizar");
                    int findID = scanner.nextInt();
                    scanner.nextLine();
                    
                    Optional <Camper> camper = camperService.getCamperById(findId);
                    camper.ifPresentOrElse (
                        c -> System.out.println("ID: " + c.getId() + ", Nombre: " + c.getNombre()),
                        () -> System.out.println("Pais no encontrado");
                    );
                    break;
                    
                case 4:
                    System.out.print("Ingrese el ID del camper a eliminar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    camperService.deleteCamper(deleteId);
                    break;
                
                    
                case 5:
                    camperService.getAllCampers().forEach8p -> {
                    System.out.println("ID: " + c.getId() + ", Nombre: " + c.getNombre());
                }
                
                case 6:  
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opción no encontrada");
            }
        }
    }
}

