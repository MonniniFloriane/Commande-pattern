public class Remote {
    private Dictionary<String, ICommand> commands = new Hashtable<String, ICommand>();

    public void addCommand(String key, ICommand command) {
        this.commands.put(key, command);
    }

    public void setVersion(String key) {
        this.commands.get(key).setVersion();
    }
}
