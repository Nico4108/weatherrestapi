package Service;

import Model.Weather;
import Repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepo weatherRepo;

    public List<Weather> display(){
        return weatherRepo.findAll();
    }

    public void insert(Weather weather){
        weatherRepo.save(weather);
    }

}
