
/**
 * Clase para comprobar el correcto funcionamiento del programa
 */
public class Test
{
   public void Test1(){
       MusicOrganizer organizador = new MusicOrganizer();
       System.out.println("###############Comprobacion con 0 elementos####################");
       System.out.println();
       System.out.println("Comprobamos indice 0");
       organizador.checkIndex(0);
       System.out.println("Comprobamos indice 1");
       organizador.checkIndex(1);
       System.out.println();
       System.out.println("###############Comprobacion con 1 elemento#####################");
       System.out.println();
       organizador.addFile("Hola.mp3");
       System.out.println("Añadido hola.mp3");
       System.out.println("Comprobamos valor correcto, indice 0");
       System.out.println();
       organizador.checkIndex(0);
       System.out.println("Comprobamos valor NO correcto, indice 1");
       organizador.checkIndex(1);
       System.out.println();
       System.out.println("Intentamos borrar un elemento con indice NO correcto, ej 5");
       organizador.removeFile(5);
       System.out.println("Comprobamos que no se ha borrado, numero de archivos: " + organizador.getNumberOfFiles());
       System.out.println("Borramos elemento correcto, indice 0");
       organizador.removeFile(0);
       System.out.println("Comprobamos que se ha borrado, numero de archivos: " + organizador.getNumberOfFiles());
       System.out.println("Comprobamos si el elemento 0 existe con checkIndex(0)");
       organizador.checkIndex(0);
   }
}
