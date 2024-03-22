fun main() {
isNumber(20,2)
    isArea(20,10)
    isNumber(23)
    isStatement("Faith",20,"blue")
    isAverage(4,6,8)
    word("akirachix")
    text("Faith",20)
    isName("school")
    isWord("Agness")
    isStudentRecords("Faith Nyambura",20,"0789654321",60.9,"Kenyan")
    isEven(20)
    subString("different")
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

fun word(name:String){
  println(name[0] +""+name[2]+""+name[3])

}
fun text(name: String,age: Int):String{
    var x = name
    var y = age
    var statement = ("Hi, my name is $x and l am $y years old ")
    return statement
}

fun isName(word:String):Int{
    var word = word.length
    return word
}
fun isWord(name:String){
    if(name=="Agness"){
        println("That's me")
    }else{
        println("I don't know who that is")
    }

}
fun isStudentRecords(fullname:String,age:Int,phonenumber:String,weightkg:Double,citizen:String){
  if(citizen == "Kenyan"){
      println(true)
  }else{
      println(false)
  }
}
fun isEven(num:Int):Boolean{
    var number = num %2
    if(num==0){
        return true
    }else{
        return false
    }

}

fun subString(name: String):String{
    var word =name.slice(2..5)
    return word
}
