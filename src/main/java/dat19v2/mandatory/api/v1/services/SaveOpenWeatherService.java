package dat19v2.mandatory.api.v1.services;

import dat19v2.mandatory.api.v1.model.ApiOpenWeather;
import dat19v2.mandatory.api.v1.repositories.IApIOpenWeatherRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveOpenWeatherService implements ISaveOpenWeatherService
{
    private IApIOpenWeatherRepository iApIOpenWeatherRepository;

    public SaveOpenWeatherService(IApIOpenWeatherRepository iApIOpenWeatherRepository)
    {
        this.iApIOpenWeatherRepository = iApIOpenWeatherRepository;
    }

    @Override
    public void save(ApiOpenWeather apiOpenWeather)
    {
        iApIOpenWeatherRepository.save(apiOpenWeather);
    }
}
