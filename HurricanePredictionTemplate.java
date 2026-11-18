// Abstract class that sets the order of steps for predicting a hurricane

public abstract class HurricanePredictionTemplate {

    // This method runs the steps in a fixed order so subclasses cannot change the sequence

    public final void predictHurricane() {

        fetchData();
        preprocessData();
        applyPredictionModel();
        postprocessResults();


    }

    // Gets the weather data needed for the prediction
    protected abstract void fetchData();


    // Cleans and prepares the data before using the model
    protected abstract void preprocessData();


    // Runs the actual prediction model on the prepared data
    protected abstract void applyPredictionModel();


    // Formats and interprets the results after the model runs
    protected abstract void postprocessResults();


}
