fun main() {
   print("Digite a temperatura em Celsius:")
    val celsius = readLine()?. toDoubleOrNull() ?: return

    val fahrenheit = celsius * 9/5+32

    println("A Temperatura em Fahrenheit é: $fahrenheit")

}