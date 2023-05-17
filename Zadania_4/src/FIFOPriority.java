import java.util.ArrayList;
import java.util.List;



   /* Kolejka priorytetowa.
      Napisz klase FIFOPriority która przechowuje Stringi.
      Kolejka ma dzia³aæ zgodnie z zasadami kolejki FIFO jednak elementy maj¹ mieæ priorytety.
      Klasa posiada metodê push(String element, int priority).
      Metoda dodaje element na koniec kolejki z zadanym priorytetem (0 najmniejszy priorytet, 99 najwy¿szy priorytet).
      Klasa posiada metodê popFirst() zwracaj¹c¹ pierwszego stringa w kolejce,
      popHighThree() zwracaj¹c¹ jednego z 3 pierwszych Stringów - tego o najwy¿szym priorytecie najwy¿szym priorytecie,
      jeœli s¹ dwa elementy o tym samym priorytecie zwracany jest ten który stoi bli¿ej "wyjœcia" z kolejki.
      Klasa powinna posiadaæ równie¿ metodê popHighest() zwracajac¹ stringa o najwy¿szym priorytecie w ca³ej kolejce.
      Jeœli jest wiecej ni¿ jeden element o najwy¿szym priorytecie metoda zwraca element który stoi najbli¿ej "wyjœcia" z kolejki
      */


public class FIFOPriority {
    private static class Element {
        private String value;
        private int priority;

        public Element(String value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    private List<Element> queue;

    public FIFOPriority() {
        queue = new ArrayList<>();
    }

    public void push(String element, int priority) {
        Element newElement = new Element(element, priority);
        queue.add(newElement);
    }

    public String popFirst() {
        if (queue.isEmpty()) {
            return null;
        }
        Element firstElement = queue.get(0);
        queue.remove(0);
        return firstElement.value;
    }

    public String popHighThree() {
        if (queue.isEmpty()) {
            return null;
        }
        int highestPriority = queue.get(0).priority;
        int highestPriorityIndex = 0;

        for (int i = 1; i < Math.min(queue.size(), 3); i++) {
            Element currentElement = queue.get(i);
            if (currentElement.priority > highestPriority) {
                highestPriority = currentElement.priority;
                highestPriorityIndex = i;
            }
        }

        Element highestPriorityElement = queue.get(highestPriorityIndex);
        queue.remove(highestPriorityIndex);
        return highestPriorityElement.value;
    }

    public String popHighest() {
        if (queue.isEmpty()) {
            return null;
        }
        int highestPriority = queue.get(0).priority;
        int highestPriorityIndex = 0;

        for (int i = 1; i < queue.size(); i++) {
            Element currentElement = queue.get(i);
            if (currentElement.priority > highestPriority) {
                highestPriority = currentElement.priority;
                highestPriorityIndex = i;
            }
        }

        Element highestPriorityElement = queue.get(highestPriorityIndex);
        queue.remove(highestPriorityIndex);
        return highestPriorityElement.value;
    }
}

