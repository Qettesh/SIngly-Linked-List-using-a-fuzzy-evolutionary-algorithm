package dva.lpi;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<FuzzyOutput> list = new SinglyLinkedList<>();

        // Adding fuzzy outputs to the list
        list.add(new FuzzyOutput("Low", 0.2));
        list.add(new FuzzyOutput("Medium", 0.5));
        list.add(new FuzzyOutput("High", 0.8));

        // Display the initial list
        System.out.println("Initial List:");
        list.display();

        // Create an evolutionary algorithm instance
        FuzzyEvolutionaryAlgorithm<FuzzyOutput> evolutionaryAlgorithm = new FuzzyEvolutionaryAlgorithm<>(list);

        // Evolve the list
        evolutionaryAlgorithm.evolve();

        // Display the evolved list
        System.out.println("Evolved List:");
        list.display();

    }

}