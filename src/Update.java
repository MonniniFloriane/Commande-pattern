public class Update {
    private int [] state = {0,0,0};

    public void majeur() {
        this.state[0] += 1;
    }

    public void mineur() {
        this.state[0] -= 1;
    }

    public void patch() {
        this.state[2] += 1;
    }

    @Override
    public String toString() {
        return this.state[state.majeur() : state.mineur() : state.patch()]
    }
}
