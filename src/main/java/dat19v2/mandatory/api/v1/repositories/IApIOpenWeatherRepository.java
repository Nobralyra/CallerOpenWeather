package dat19v2.mandatory.api.v1.repositories;

import dat19v2.mandatory.api.v1.model.ApiOpenWeather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IApIOpenWeatherRepository extends JpaRepository<ApiOpenWeather, Long>
{
}