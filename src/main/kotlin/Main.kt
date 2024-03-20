fun main() {
isNumber(20,2)
    isArea(20,10)
    isNumber(23)
    isStatement("Faith",20,"blue")
    isAverage(4,6,8)
}


fun isNumber(num:Int, num2:Int){

    var sum=num + num2
    var difference = num - num2
    var product = num * num2
    var quotient = num / num2
    println(sum)
    println(difference)
    println(product)
    println(quotient)
}



fun isArea(length: Int,width:Int){
    var area = length*width
    println(area)
}

//
fun isNumber(temperature:Int){
    var f = (temperature*9/5) + 32
    println(f)
}
fun isStatement(name:String,age:Int,favouritecolour:String){
    var statement = "I am $name and l am $age years old.My best colour is $favouritecolour"
    println(statement)
}

fun isAverage(num:Int,num2:Int,num3:Int){
    var average = (num + num2 + num3)/3
println(average)
}