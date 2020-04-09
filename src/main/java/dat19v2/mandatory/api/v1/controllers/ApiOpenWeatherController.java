package dat19v2.mandatory.api.v1.controllers;

import dat19v2.mandatory.api.v1.services.IAllDataOpenWeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiOpenWeatherController
{
    private final IAllDataOpenWeatherService iAllDataOpenWeatherService;

    public ApiOpenWeatherController(IAllDataOpenWeatherService iAllDataOpenWeatherService)
    {
        this.iAllDataOpenWeatherService = iAllDataOpenWeatherService;
    }

    @GetMapping({"/"})
    @ResponseStatus(HttpStatus.OK)
    public String getAllOpenWeatherData()
    {
        return iAllDataOpenWeatherService.getAllOpenWeatherData();
    }

}
