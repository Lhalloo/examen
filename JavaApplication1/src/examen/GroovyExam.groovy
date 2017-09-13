/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen

/**
 *
 * @author Eduardo Reyes
 */
import groovy.json.JsonOutput

class GroovyExam {
  
     static void main(String[] args) {
         ordenamientoBurbuja();
         mapa();
   }
   
    public static void ordenamientoBurbuja(){
        
        int [] lista = [5,4,3,1,2]; 
        int tamaño = 5;
        int i;
        int x;
        
        for(i = 0; i < lista.length - 1; i++){
            System.out.println("Lista [" + lista[0] + "]" + " [" + lista[1] + "]" + " [" + lista[2] + "]" + " [" + lista[3] + "]" + " [" + lista[4] + "]");
            for (int a = 0; a < lista.length - 1; a++){
                    if(lista[a] > lista[a+1]){
                        x = lista[a];
                        lista[a] = lista[a+1];
                        lista[a+1] = x;
                        System.out.println("[" + lista[a] + "] " + "cambia con [" + lista[a+1] + "]");
                    }
                }
            }
        
        for(i = 0; i < lista.length; i++){
              System.out.println("Lista ordenada (odenamiento de burbuja) [" + lista[i] + "]");
          }
    }
    
    public static void mapa(){
        
        def mapa  = ["Nombre" : "Eduardo", "Edad" : "22"]
        def output = JsonOutput.toJson(mapa)
        
        try{
            File file = new File("./person.json");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            System.out.print("-------------\n");
            System.out.println("Creando JSON...");
            System.out.print(output);
 
            fileWriter.write(output);
            fileWriter.flush();
            fileWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace("Error al crear JSON...");
        }
    }
}

