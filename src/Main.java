
import complements.LinkedListG;
import complements.Position;

public class Main{
    public static void main(String []args) {
        LinkedListG<Integer> lista1 = new LinkedListG<>();
        LinkedListG<String> lista2 = new LinkedListG<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(7);

        lista2.add("Hola");
        lista2.add("Object");
        lista2.add("Oriented");
        lista2.add("Programing");

        LinkedListG<Integer>.Iterator it = lista1.getIterator();

        while (it.hasNext()) {
            LinkedListG<Integer>.Iterator backupIt = lista1.new Iterator(it);
            int element = it.next(); //regresa el dato y vanza al iterador
            if (element == 3) {
                lista1.insert(10, Position.BEFORE, backupIt);
            }
            if (element == 7) {
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }

        lista1.delete(3);

        System.out.println("--------------------------------");

        System.out.println("El tamaño es: " + lista1.getSize());

        it = lista1.getIterator();

        while (it.hasNext()) {
            int element = it.next();
            System.out.println("Dato: " + element);
        }

        System.out.println("-----------------------------");

        LinkedListG<Integer>.ReverseIterator reverseIterator = lista1.getReverseIterator();

        while (reverseIterator.hasNext()) {
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("----------------------------");

        LinkedListG<String>.Iterator itStrings = lista2.getIterator();
        while (itStrings.hasNext()) {
            System.out.println("Cual dato?:" + itStrings.next());
        }

    }
}