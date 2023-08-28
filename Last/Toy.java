class Toy implements Comparable<Toy> {
    int id;
    String name;
    int frequency;

    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(other.frequency, this.frequency);
    }
}
