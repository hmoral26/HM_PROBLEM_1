// Command that tells the saver to save the results
public class SaveResultsCommand implements Command {
    private ResultSaver saver;



    // Sets up the command with a result saver
    public SaveResultsCommand(ResultSaver saver) {
        this.saver = saver;
    }



    // Tells the saver to save the results
    @Override
    public void execute() {
        saver.saveResults();
    }

}


