// Command that tells the model to run a prediction


public class PredictionCommand implements Command {


    private PredictionModel model;



    // Sets up the command with a prediction model
    public PredictionCommand(PredictionModel model) {
        this.model = model;
    }


    // Tells the model to run the prediction
    @Override

    public void execute() {
        model.applyPredictionModel();
    }


}
