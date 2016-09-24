package gen.com.weatherws.test;

import static org.junit.Assert.*;

import org.junit.Test;

import gen.com.weatherws.Weather;
import gen.com.weatherws.WeatherReturn;
import gen.com.weatherws.WeatherSoap;

public class TestWeather {

	@Test
	public void test() {
		
		Weather weatherService = new Weather();
		WeatherSoap portType = weatherService.getWeatherSoap();
		WeatherReturn result = portType.getCityWeatherByZIP("10001");
		
		if(result != null){
			System.out.println("success ="+result.isSuccess());
			System.out.println("success ="+result.getCity());
			System.out.println("success ="+result.getDescription());
		}else{
			System.out.println("result is null");
		}
		
	}

}
