// * 2469. Convert the Temperature
// You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
// You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
// Return the array ans. Answers within 10-5 of the actual answer will be accepted.

// Note that:
// Kelvin = Celsius + 273.15
// Fahrenheit = Celsius * 1.80 + 32.00
 
// Example 1:
// Input: celsius = 36.50
// Output: [309.65000,97.70000]
// Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

public class ConverttheTemperature {
    class MySolution {
        public double[] convertTemperature(double celsius) {
            double kelvin = 0;
            double fah = 0;
            kelvin += (celsius + 273.15);
            fah += (celsius * 1.8) + 32;
            double[] ans = new double[2];
            ans[0] = kelvin;
            ans[1] = fah;
            return ans;
        }
    }
}

// Runtime 0ms Beats 100.00%
