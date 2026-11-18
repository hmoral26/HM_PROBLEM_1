// Uses historical data and a statistical model for the prediction


public class StatisticalPrediction extends HurricanePredictionTemplate {
    // Gets historical weather data for the statistical approach
    @Override
    protected void fetchData() {
        System.out.println("Fetching historical weather data for statistical analysis.");
    }


    // Cleans and structures the historical data
    @Override
    protected void preprocessData() {
        System.out.println("Cleaning and structuring data for statistical model.");
    }


    // Applies the statistical model to make the prediction
    @Override
    protected void applyPredictionModel() {
        System.out.println("Applying statistical model for hurricane prediction.");
    }


    // Interprets and formats the statistical results
    @Override
    protected void postprocessResults() {
        System.out.println("Interpreting and formatting statistical model results.");


    }


}


