fun main(){
printnameAndGreeting("Ada")
    modulus(8.0,3.0)
    add(1,2,3,4)
    myInterest("I love baking")

}
fun printnameAndGreeting(name: String){
    var  name="Hello $name"
    println(name)

}
fun modulus(num1: Double , num2: Double){
    var result=num1%num2
    println(result)
}

fun add(num1: Int ,num2: Int ,num3: Int ,num4: Int){
    var sum=num1+num2+num3+num4
    println(sum)
}
fun myInterest(interest: String){
    println(interest)
}

