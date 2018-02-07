//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = ((fahrenheit - 32)*5/9);
		return celsius;
	}

	public void print()
	{
		out.printf("%.2f degrees Fahrenheit = %.2f degrees Celsius\n\n\n", fahrenheit, getCelsius());
	}
}