public class UpdateMajeur implements ICommand {
    private Majeur majeur;

    public updateMajeur(Majeur majeur) {
        this.majeur = majeur;
    }

    public void execute() {
        this.majeur.off();
    }
}
