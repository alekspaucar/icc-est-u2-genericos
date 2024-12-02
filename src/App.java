import models.Persona;
import models.genericos.Par;


public class App {
    public static void main(String[] args) throws Exception {
/* 
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();
        cajaString.guardar("guardar un string");
        cajaInteger.guardar(10);
        // Crear una instancia de Persona y guardarla
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(30);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener()); // Aquí se imprime el objeto Persona
     
        */
    //************************************************************************ 
     //   Par<String, Integer> par = new Par<>(); 
        
     //10 personas

        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Juan", 12);
        personas[1] = new Persona("Ana", 32);
        personas[2] = new Persona("Carlos", 18);
        personas[3] = new Persona("Maria", 92);
        personas[4] = new Persona("Pedro", 10);
        personas[5] = new Persona("Lucía", 11);
        personas[6] = new Persona("Luis", 25);
        personas[7] = new Persona("Sofía", 24);
        personas[8] = new Persona("Raúl", 31);
        personas[9] = new Persona("Marta", 26);
        // Imprimir todos los datos del arreglo
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        Par<String, Integer>[] mayoresDeEdad = new Par[10]; // Par: (nombre, edad)
        Par<Integer, String>[] menoresDeEdad = new Par[10]; // Par: (edad, nombre)

        int indexMayores = 0; 
        int indexMenores = 0; 

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayoresDeEdad[indexMayores] = new Par<>(persona.getNombre(), persona.getEdad());
                indexMayores++;
            } else {
                menoresDeEdad[indexMenores] = new Par<>(persona.getEdad(), persona.getNombre());
                indexMenores++;
            }
        }

        // Imprimir los arreglos de mayores de edad
        System.out.println("**********************");
        System.out.println("Mayores de edad:");
        for (int i = 0; i < indexMayores; i++) {
            System.out.println("mayores de edad: "+mayoresDeEdad[i]);
        }

        // Imprimir los arreglos de menores de edad
        System.out.println("**********************");
        System.out.println("Menores de edad:");
        for (int i = 0; i < indexMenores; i++) {
            System.out.println("menores de edad: "+menoresDeEdad[i]);
        }
    }
}
