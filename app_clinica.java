import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import javafx.scene.control.TitledPane;

public class app_clinica {

    static cls_pacientes [] pacientes = new cls_pacientes[100];
    static int posicionInt = 0; // Variable para mover las posiciones del vector  

    public static void main(String[] args) {
         fnt_menu(true);
    }

    private static void fnt_menu(boolean men) {
        while(men == true){
            String opcionesStr = JOptionPane.showInputDialog(null, "Menu de opciones\n1.- Registrar\n2.- Consultar\n3.- Salir");
            if(opcionesStr.equals("1")){
                fnt_registrar();
            }  
            if(opcionesStr.equals("2")){
                int codigoInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo paciente"));
                fnt_consultar(codigoInt);
            }
            if(opcionesStr.equals("3")){
                men = false;
            }
        }

    }

    private static void fnt_registrar(){
        int codigoInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo paciente"));
        int contactoInt =  Integer.parseInt(JOptionPane.showInputDialog(null, "Contacto paciente"));
        String nombreStr = JOptionPane.showInputDialog(null, "Nombre paciente");
        String epsStr = JOptionPane.showInputDialog(null, "EPS paciente");
        pacientes[posicionInt] = new cls_pacientes(codigoInt, nombreStr, contactoInt, epsStr);
        posicionInt += 1; // Incrementar la posicion del vector
        JOptionPane.showMessageDialog(null, "Paciente registrado con exito", "Registrar", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fnt_consultar(int codigo){
        int posInt = 0;//Encontrar la posicion del vector respecto al dato buscado
        boolean swBln = false;//Bandera para determinar si se encontro el dato o no
        for(int i = 0; i < posicionInt; i++){
            if(codigo == pacientes[i].getCodigoint()){
                posInt = i;//asignar la posicion de encuentro
                swBln = true;//determinar que el dato fue encontrado
                break;
            }
        }
        if(swBln == false) {
            JOptionPane.showMessageDialog(null, "No se encontraron los datos asociados", "Consultar", JOptionPane.INFORMATION_MESSAGE); 
        }else{
            JOptionPane.showMessageDialog(null, "Codigo: "+ pacientes[posInt].getCodigoint()+"\nNombre: "+pacientes[posInt].getNombreStr()+"\nContacto: "+pacientes[posInt].getContactoint()+"\nEPS: "+pacientes[posInt].getEpsStr());
        }
    }
}