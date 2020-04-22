import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int primero[] = new int [5];
        int segundo[] = new int [5];
        int tercero[] = new int [10];
        
        //Guardando Primer Arreglo
        System.out.println("Guardar datos primer arreglo\n");
        for(int i=0; i<primero.length; i++){
            System.out.print("Numero: ");
            primero[i]=sc.nextInt();
        }
        //Guardando Segundo Arreglo
        System.out.println("Guardar datos segundo arreglo\n");
        for(int i=0; i<segundo.length; i++){
            System.out.print("Numero: ");
            segundo[i]=sc.nextInt();
        }        
        //Se mezclan dos arreglos
        int j=0;
	for(int i=0; i<5; i++) {
		tercero[j]=primero[i];
		j++;
		tercero[j]=segundo[i];
		j++;
	}
        
        //Presentando dos arreglos
        System.out.println("Los dos arreglos mezclados son: ");
        for(int i=0; i<tercero.length; i++){
            System.out.println(tercero[i]);
        } 
    }
}