package dva.lpi;

import java.util.Random;

public class FuzzyEvolutionaryAlgorithm<T extends FuzzyOutput> {
    private SinglyLinkedList<T> list;
    public FuzzyEvolutionaryAlgorithm(SinglyLinkedList<T> list){
        this.list = list;
    }
    public void evolve(){
        Node<T> current = list.head;
        Random random = new Random();

        while (current != null){
            //Randomly mutate the degree of membership
            double mutation = random.nextDouble() * 0.1 - 0.05;//Mutation range [-0.05, 0.05]
            double newDegree = current.getData().getDegreeOfMembership() + mutation;

            //ENsure the new degree of membership is within [0, 1]
            newDegree = Math.max(0, Math.min(1, newDegree));

            //Update the fuzzy output
            current.data = (T) new FuzzyOutput(current.getData().getLabel(), newDegree);
            current = current.next;
        }
    }
}
