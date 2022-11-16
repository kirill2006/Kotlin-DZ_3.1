fun main() {
    val f1 = SportCar(4, "Red", "Formula 1", "No")
    val car = Car(4, "Blue")

    f1.printWheels()
    f1.printColor()
    f1.printCSpoiler()
    f1.printCompany()
    f1.company = "fa1"
    f1.printCompany()

}

open class Car(var _wheels: Int, var _color: String){

    var wheels: Int = _wheels
        get() {
            return field
        }
        set(value) {
            if ((value <= 4) and (value >= 0)) {
                field = value
            }
        }

    var color: String = _color
        get() {
            return field
        }
        set(value) {
            if ((value == "Red") or (value == "Blue")) {
                field = value
            }
        }


    fun printWheels(){
        println("Count of wheels: $wheels")
        }

    fun printColor(){
        println("Color: $color")
    }
}
class SportCar(sportWheels: Int, sportColor: String, val _company: String, val _spoiler: String): Car(sportWheels, sportColor){

    var company: String = _company
        get() {
            return field
        }
        set(value) {
            if ((value == "Formula 1") or (value == "Porshe") or (value == "Shivrole") or (value == "Reno")) {
                field = value
            }
            else {
                println("Incorrect company name")
            }
        }

    var spoiler: String = _spoiler
        get() {
            return field
        }
        set(value) {
            if ((value == "Yes") or (value == "No")) {
                field = value
            }
            else {
                println("Uncorrect spoiler status")
            }
        }

    fun printCompany(){
       println("Company: $company")
        }
    fun printCSpoiler(){
        println("Spoiler: $spoiler")
    }
}