fun main() {
    namesofGirls(arrayOf("Sismile","Eunice","Chrispin","Sophy"))
    cities()
    numeric()
    detail(arrayOf("Vallary","Gitu","Heta"))


}




fun namesofGirls(names:Array<String>){
    println(names.contentToString())

    }
fun cities(){
 var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach{cities->
        println(cities.capitalize())

    }
}
fun numeric(){
    var numbers=arrayOf(32,20,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[2]+numbers[5]
    println(sum)
    var index=numbers.indexOf(158)
println(index)
    var sortednumbers=numbers.sortedArray()
    println(sortednumbers.contentToString())
}

fun detail(name:Array<String>):Array<String>{
    var names= name
    println(names.contentToString())
    return names
}

