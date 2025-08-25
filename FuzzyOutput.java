package dva.lpi;

public class FuzzyOutput {
    private String label;
    private double degreeOfMembership;

    public FuzzyOutput(String label, double degreeOfMembership) {
        this.label = label;
        this.degreeOfMembership = degreeOfMembership;
    }
    public String getLabel() {
        return label;
    }

    public double getDegreeOfMembership(){
        return degreeOfMembership;
    }

    @Override
    public String toString(){
        return "Label: " + label + ", Degree of Membership: " + degreeOfMembership;
    }
}
