package interset;

public class Interset {
    private boolean[] elements;

    public Interset() {
        elements = new boolean[101]; // Inicializa o array com todos os valores como false
    }

    public Interset union(Interset otherSet) {
        Interset result = new Interset();
        for (int i = 0; i <= 100; i++) {
            result.elements[i] = this.elements[i] || otherSet.elements[i];
        }
        return result;
    }

    public Interset intersection(Interset otherSet) {
        Interset result = new Interset();
        for (int i = 0; i <= 100; i++) {
            result.elements[i] = this.elements[i] && otherSet.elements[i];
        }
        return result;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            elements[k] = true;
        }
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            elements[m] = false;
        }
    }

    public String toSetString() {
        StringBuilder setString = new StringBuilder();
        boolean empty = true;
        for (int i = 0; i <= 100; i++) {
            if (elements[i]) {
                if (!empty) {
                    setString.append(" ");
                }
                setString.append(i);
                empty = false;
            }
        }
        if (empty) {
            return "-";
        } else {
            return setString.toString();
        }
    }

    public boolean isEqualTo(Interset otherSet) {
        for (int i = 0; i <= 100; i++) {
            if (this.elements[i] != otherSet.elements[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Interset set1 = new Interset();
        Interset set2 = new Interset();

        set1.insertElement(1);
        set1.insertElement(2);
        set1.insertElement(3);

        set2.insertElement(2);
        set2.insertElement(3);
        set2.insertElement(4);

        Interset unionSet = set1.union(set2);
        Interset intersectionSet = set1.intersection(set2);

        System.out.println("Set1: " + set1.toSetString());
        System.out.println("Set2: " + set2.toSetString());
        System.out.println("Union: " + unionSet.toSetString());
        System.out.println("Intersection: " + intersectionSet.toSetString());

        System.out.println("Set1 is equal to Set2: " + set1.isEqualTo(set2));
    }
}

