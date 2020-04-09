package dat19v2.mandatory.api.v1.services;

import dat19v2.mandatory.api.v1.model.ApiOpenWeather;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AllDataOpenWeatherService implements IAllDataOpenWeatherService
{
    private RestTemplate restTemplate;
    private ISaveOpenWeatherService iSaveOpenWeatherService;

    public AllDataOpenWeatherService(RestTemplate restTemplate, ISaveOpenWeatherService iSaveOpenWeatherService)
    {
        this.restTemplate = restTemplate;
        this.iSaveOpenWeatherService = iSaveOpenWeatherService;
    }

    @Scheduled(fixedRateString = "600000")
    @Override
    public String getAllOpenWeatherData()
    {
        ApiOpenWeather apiOpenWeather = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/forecast?id=2618425&appid=c296fe19c765289ba2b1f4ce756b35ad", ApiOpenWeather.class);

        iSaveOpenWeatherService.save(apiOpenWeather);
        assert apiOpenWeather != null;
        return apiOpenWeather.getAllOpenWeatherData();
    }
    }
