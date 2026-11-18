// Command that tells the fetcher to get weather data

public class FetchDataCommand implements Command {

    private WeatherDataFetcher fetcher;

    // Sets up the command with a weather data fetcher
    public FetchDataCommand(WeatherDataFetcher fetcher) {
        this.fetcher = fetcher;
    }

    // Tells the fetcher to get the data

    @Override
    public void execute() {
        fetcher.fetchData();
    }

}
