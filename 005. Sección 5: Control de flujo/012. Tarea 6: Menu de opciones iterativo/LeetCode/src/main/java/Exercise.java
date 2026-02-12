
//Recuerda activar Show suggestions as you type


import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Exercise {
    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Crear",3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);

        do{
            Object[] opcArreglo = opciones.keySet().toArray();

            System.out.println(Arrays.toString(opcArreglo));

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción",
                        "Mantenedor",
                    JOptionPane.INFORMATION_MESSAGE,null, opcArreglo, opcArreglo[0]);

            if(opcion == null){
                JOptionPane.showInputDialog(null,"Seleccione una opción");
                continue;
            }

            opcionIndice = opciones.get(opcion.toString());
            //actualizar, eliminar, crear, listar y salir.
            switch(opcionIndice){
                case 1 -> JOptionPane.showInputDialog(null, "Usuario actualizado correctamente");
                case 2 -> JOptionPane.showInputDialog(null, "Usuario eliminado correctamente");
                case 3 -> JOptionPane.showInputDialog(null, "Usuario crear correctamente");
                case 4 -> JOptionPane.showInputDialog(null, "Usuario listado correctamente");
                case 5 -> JOptionPane.showInputDialog(null, "Haz salido con exito!");
                default -> JOptionPane.showInputDialog(null, "opción no reconocidad");
            }

        }while(opcionIndice != 5);
    }
}
