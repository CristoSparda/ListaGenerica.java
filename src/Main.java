
import complements.LinkedListG;
import complements.Position;

public class Main{
    public static void main(String []args) {
        LinkedListG<Integer> lista1 = new LinkedListG<>();
        LinkedListG<String> lista2 = new LinkedListG<>();
        LinkedListG<Float> lista3 = new LinkedListG<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(7);

        lista2.add("Hola");
        lista2.add("Object");
        lista2.add("Oriented");
        lista2.add("Programing");

        lista3.add(3.25F);
        lista3.add(2.90F);
        lista3.add(45.10F);
        lista3.add(90.29F);

        LinkedListG<Integer>.Iterator it = lista1.getIterator();

        while (it.hasNext()) {
            LinkedListG<Integer>.Iterator backupIt = lista1.new Iterator(it);
            int element = it.next(); //regresa el dato y avanza al iterador
            if (element == 3) {
                lista1.insert(10, Position.BEFORE, backupIt);
            }
            if (element == 7) {
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }


        System.out.println("--------------------------------");

        System.out.println("El tamaño es: " + lista1.getSize());

        it = lista1.getIterator();

        while (it.hasNext()) {
            int element = it.next();
            System.out.println("Dato: " + element);
        }

        lista1.delete(3);

        System.out.println("-----------------------------");

        LinkedListG<Integer>.ReverseIterator reverseIterator = lista1.getReverseIterator();

        System.out.println("El tamaño despues de eliminar: " + lista1.getSize());

        while (reverseIterator.hasNext()) {
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("----------------------------");

        LinkedListG<String>.Iterator itStrings = lista2.getIterator();
        System.out.println("El tamaño es: " + lista2.getSize());
        while (itStrings.hasNext()) {
            System.out.println("Dato:" + itStrings.next());
        }

        System.out.println("----------------------------");

        LinkedListG<String>.ReverseIterator reverseIterator2 = lista2.getReverseIterator();

        while (reverseIterator2.hasNext()) {
            String name = reverseIterator2.next();

            System.out.println("Dato: " + name);
        }

        System.out.println("----------------------------");

        LinkedListG<Float>.Iterator itFloat = lista3.getIterator();
        System.out.println("El tamaño es: " + lista3.getSize());
        while (itFloat.hasNext()) {
            System.out.println("Dato:" + itFloat.next());
        }

        System.out.println("----------------------------");

        LinkedListG<Float>.ReverseIterator reverseIterator3 = lista3.getReverseIterator();

        while (reverseIterator3.hasNext()) {
            Float date = reverseIterator3.next();

            System.out.println("Dato: " + date);
        }

    }
}