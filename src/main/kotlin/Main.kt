import java.lang.invoke.VarHandle

fun main() {
    var herName=ClassName(66,46,77,93)
    var herName2=ClassName(45,64,47,91)
    var herName3=ClassName(71,56,87,23)
    herName.totalScore()
    herName2.totalScore()
    herName3.totalScore()
    var name1=FullIdentity("loice","kenya",5.45672,23,56.3F)
    var name2=FullIdentity("mary","uganda",6.23843,20,60.2F)
    name1.country
    println(name1.country)
    name1.eats()
    println(name1.eats().toString())
    var mobile1=MobilePhone("Android","samsung","s20")
    var mobile2=MobilePhone("IOS","INFINIX","M20")
    var mobile3=MobilePhone("android","tecno","phantom6")
    println(mobile2)
//    var person1=Person(firstName = "sakaja","johnson", weight = 56.5F)
//    var person2=Person(firstName = "owino","faith",60.4F)
//    person1.weight=60
//    person1.weight
//    person1.statehobby()
//    person1.hobby="playing baskeball"
//    person1.statehobby()
//    person2.hobby=("volunteer work")
//person2.statehobby()
    var person=Person("John","Doe")
    var Maryanne=Person()
    var John=Person(Firstname = "John")
    var John2=Person(Secondname = "John")

}
class ClassName(var sub1:Int,var sub2:Int,var sub3:Int,var sub4:Int) {
    fun totalScore() {
        var myTotal = (sub1 + sub2 + sub3 + sub4)
        println(myTotal)
    }
}
class FullIdentity(var Name:String,var country:String,var height:Double,var age:Int,var weight:Float){
      fun eats(){
      var food= arrayOf("sukuma","chapati","beans")
          println(food.contentToString())
      }
}
//Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.
//
//Use the initializer to print those details of the object
//
//Create three objects of that class in the Main function.
//
//Examples of phones would be:
//Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra
class MobilePhone constructor(osName:String,brand:String,model:String){
  init {
      println("My phone is $osName $brand $model")
    }
}
//class Person(firstName:String="sakaja",secondName:String,weight: Float){
//    var hobby="watching netflix"
//    var weight:Int?= null
//    init {
//       println("my name is $firstName $secondName")
//        println("my name is $firstName $secondName")
//        println("my name is $firstName $secondName and my weight is $weight")
//    }
//    fun statehobby(){
//println("my hobby is $hobby")
//    }
//}
// INITIALIZERS
// constructors allows us to add value to our o
class Person(Firstname:String="Maryanne",Secondname:String="Njoki"){
    init {
        println("My name is $Firstname $Secondname")

    }
}


}
//create a class called car which take in the make,model ,registration  and speed of the car
//classes have attributes and behaviours which apply to all the objects of the specified class
//the behaviours of a class are denoted using the fun keyword(behaviours are functions/methods
class Car(var make:String,var model:String,var registration:String,var speed:Int){
    fun start(){
        println("vrrrrrm vrrrm")
    }
    fun accellerate(acceleration:Int):Int{
        speed+=acceleration
        return speed
    }
    fun decelerate(deccelaration:Int):Int{
        speed-=deccelaration
        return speed

    }

    fun hoot(){
        println("pipiiii")
    }

}
fun stop(speed:Int){
    speed==speed
    println(speed)
}
//data classes hold data that can accessed anytime
//a data class has attributes such as in this case title,author,no.of pages,and the year of publication
data class Book(var title:String,var author:String,var pages:Int,var year:Int)
//

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight+=foodweight
    }
}
//
//Every year, millions of wildebeest, zebras, and other animals participate in great migration
//across the Serengeti -Mara ecosystem. As a conservationist, you want to develop a software system
//that models this migration, predicting the movement of the herds based on the weather patterns,
//rivers levels, predator locations, and the various factors that influence the migration .
//    class MigrationForecast {
//        fun predictMovement(weather: String, riverLevel: Int, predatorLocation: String): String {
//            if (weather == "sunny" && riverLevel < 5 && predatorLocation == "south") {
//                return "The herds will move north."
//            } else if (weather == "rainy" && riverLevel > 10 && predatorLocation == "west") {
//                return "The herds will move east."
//            } else {
//                return "The herds will stay put."
//            }
//        }
//    }
class MigrationForecastt {
    fun predictMovement(weather: String, riverLevel: Int, predatorLocation: String): String {
        if (weather == "sunny" && riverLevel < 5 && predatorLocation == "south") {
            return "The herds will move north"
        } else if (weather == "rainy" && riverLevel > 10 && predatorLocation == "west") {
            return "The herds will move east"
        } else {
            return "The herds will stay in their current location"
        }
    }
    fun predictWaterCrossing(riverLevel: Int): String {
//        if (riverLevel in 6..9) {
//            return "The herds will attempt to cross the river"
//        } else if (riverLevel >= 10) {
//            return "The herds will not attempt to cross the river"
//        } else {
//            return "The herds will easily cross the river"
//        }
        when (riverLevel){
            in 6..9 -> return ("the hrds will attempt to cross the river")
            in 9..10 ->return "the heards will not attempt to cross the river"
            else ->return  "the herds will easilyu cross the river"
        }
    }
    fun predictPredatorAttack(predatorLocation: String): String {
//        if (predatorLocation == "north") {
//            return "The herds will move south to avoid predators"
//        } else if (predatorLocation == "east") {
//            return "The herds will move west to avoid predators"
//        } else {
//            return "The herds are safe from predators"
//        }
        when{
            predatorLocation=="north" -> return "the herds will move south to avoid predator"
            predatorLocation =="east" -> return "the herds will move west to avoid predator"
            else -> return  "the herds are safe from "
        }
    }
}
//AS a producer in the booming Nollywood movie industry , you are in charge of multiple
//film projects at once.Each movie has different cast members , shooting schedules , and budgets .
//You want to write a program to help manage your film projects efficiently .
//The software should be able to handle the complexities of scheduling ,budgeting and
//coordinating between different movie projects.
class MovieProject(
    val title: String,
    var castMembers: MutableList<String>,
    var shootingSchedule: String,
//        var budget: Double
    var budget:MutableMap<String,Double>
) {
    fun addCastMember(castMember: List<String>) :MutableList<String>{
        castMembers.plus(castMember)
        return castMembers
    }

    fun removeCastMember(castMember: String) {
        if (castMembers.contains(castMember)) {
            castMembers.remove(castMember)
            println(castMembers)
        } else {
            println("$castMember is not a cast member of this project.")
        }
    }

    fun updateShootingSchedule(schedule: String) {
        shootingSchedule = schedule
    }

    fun adjustBudget(activity: String, amount: Double) {
//        if (budget + amount >= 0) {
//            budget += amount
//        } else {
//            println("Error: Budget cannot be negative.")
//
        if (budget.containsKey(activity)) {
//            budget.put(activity, budget[activity]?.plus(amount) ?: amount)
            budget[activity]=budget[activity]!! +amount
            println(   budget)
        } else {
            budget.put(activity, amount)
            println(    budget)
        }

    }
    fun calculatebudget(){
        var sum=0.0
        for(value in budget.values){
            sum+=value


        }
        println(sum)
    }

}

//
//class MoviePlanner {
//    val projects = mutableListOf<MovieProject>()
//    fun addProject(project: MovieProject) {
//        projects.add(project)
//    }
//    fun removeProject(project: MovieProject) {
//        if (projects.contains(project)) {
//            projects.remove(project)
//        } else {
//            println("${project.title} is not a project in the planner.")
//        }
//    }
//    fun updateProjectDetails(project: MovieProject, castMembers: MutableList<String>, schedule: String, budget: Double) {
//        project.castMembers = castMembers
//        project.shootingSchedule = schedule
//        project.budget = budget
//    }
//    fun generateReport() {
//        for (project in projects) {
//            println("Title: ${project.title}")
//            println("Cast Members: ${project.castMembers}")
//            println("Shooting Schedule: ${project.shootingSchedule}")
//            println("Budget: ${project.budget}")
//            println()
//        }
//    }
//}