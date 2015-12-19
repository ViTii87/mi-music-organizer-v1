import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Metodo que comprueba si el indice introducido por parametro es valido, si no hay elementos en la lista nos lo indica, y si hay pero es
     * incorrecto, nos muestra el rango valido.
     */
    public void checkIndex(int indiceElegido){
        if(indiceElegido < 0 || indiceElegido > getNumberOfFiles()-1){
            if(getNumberOfFiles() == 0){
                System.out.println("Error. Lista vacia.");
            }
            else{
                System.out.println("El indice elegido es incorrecto, tiene que estar entre 0 y " + (files.size()-1));  
            }
        }
    }

    /**
     * Metodo para comprobar si el indice introducido es correcto, si lo es devuelve true, sino false.
     */
    public boolean validIndex(int indiceElegido){
        if(indiceElegido < 0 || indiceElegido > getNumberOfFiles()-1){
            return false;
        }
        else{
            return true;
        }
    }
}
