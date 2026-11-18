import java.util.ArrayList;
import java.util.List;

// Holds a list of commands and runs them in the order they were added
public class PredictionInvoker {
    private List<Command> commands;


    // Creates an empty list of commands
    public PredictionInvoker() {
        commands = new ArrayList<>();
    }


    // Adds a command to the list
    public void addCommand(Command command) {
        commands.add(command);
    }


    // Runs every command that was added, in order
    public void executeCommands() {
        for (Command command : commands) {
            command.execute();


        }


    }



}
