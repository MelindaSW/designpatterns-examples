
public class WeatherForecast {
	
	private Weather sun;
	private Weather rain;
	private Weather storm;
	
	public WeatherForecast() {
		sun = new Sunshine();
		rain = new Rain();
		storm = new Storm();
	}
	
	public void sunnyWeather() {
		sun.forecast();
	}
	public void rainyWeather() {
		rain.forecast();
	}
	public void stormyWeather() {
		storm.forecast();
	}

}
