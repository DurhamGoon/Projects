import scala.io.StdIn._

object TemperatureConversion {

    def celToFahren(celsius: Double): Double = {
        val result = (celsius * 1.8) + 32
        return result
    }

    def fahrenToCel(fahrenheit: Double): Double = {
        val result = (fahrenheit - 32) / 1.8
        return result
    }
    
    def main(args: Array[String]): Unit = {
        println("Please choose an option:")
        println("1. Convert Celsius to Fahrenheit")
        println("2. Convert Fahrenheit to Celsius")

        val choice = readInt()

        

        val result = if (choice == 1){
            println("Please enter a value to convert to Fahrenheit:")
            val temperature = readDouble()
            println(celToFahren(temperature))
        
        } else if (choice == 2) {
            println("Please enter a value to convert to Celsius:")
            val temperature = readDouble()
            println(fahrenToCel(temperature))
        }

         
        
        
    }
}