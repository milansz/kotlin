package krizsanmilan.com.kotlinproject

class CarModel {

    var brand: String
    var name: String
    var horsepower: Int
    var acceleration: String
    var color: String

    constructor(brand: String, name: String, horsepower: Int, acceleration: String, color: String) {
        this.brand = brand
        this.name = name
        this.horsepower = horsepower
        this.acceleration = acceleration
        this.color = color
    }
}