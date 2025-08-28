fun main()
{
    val steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(steps)

    println("Walking $steps steps burned $caloriesBurned calories")
}

fun PEDOMETERstepsTOcalories(NumberOfSteps: Int): Double
{
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOfSteps * CaloriesBURNEDforEachStep

    return TotalCALORIESburned
}