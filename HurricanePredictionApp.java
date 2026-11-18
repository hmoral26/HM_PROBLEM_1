// Main class that runs both prediction strategies and the command sequence

public class HurricanePredictionApp {

    public static void main(String[] args) {


        // Statistical prediction using the template
        HurricanePredictionTemplate statistical = new StatisticalPrediction();
        statistical.predictHurricane();

        System.out.println();

        // Command pattern sequence
        WeatherDataFetcher fetcher = new WeatherDataFetcher();
        PredictionModel model = new PredictionModel();
        ResultSaver saver = new ResultSaver();

        PredictionInvoker invoker = new PredictionInvoker();
        invoker.addCommand(new FetchDataCommand(fetcher));
        invoker.addCommand(new PredictionCommand(model));
        invoker.addCommand(new SaveResultsCommand(saver));
        invoker.executeCommands();

        System.out.println();


        // Machine learning prediction using the template
        HurricanePredictionTemplate ml = new MachineLearningPrediction();
        ml.predictHurricane();


    }

}

