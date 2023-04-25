fun main() {
    var name="Prudence"
    name [0]
    name  [-1]
    name.length
    println( randomString("Prudence"))

println(passwords(1234567))
    println(multiples(24))
   println(deposits(1200.0))
    println(withdraws)
    println(details())

}
//Kotlin Assessment 2
//Time: 90 minutes (1.5 hours)
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun randomString(name:String):String{

return  name
}

//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun passwords(password:Int):Int {

    var x = "jdkroom"
    if (x.length == 8) {
        return password
    }
    else if (x.length == 16) {
        return password
    }
    else {
        return password
    }
}



//
//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(num:Int) {
    for (x in 1.rangeTo(1000)) {
        if (num % 8 === 0 && num % 6 === 0) {
            println("Bingo")
        } else {
            (num % 8 === 0)
            println("None")
        }

        }
    }






//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
 open class CurrentAccount(var accountnumber:Int, var accountname:String,var balance:Int){

}
fun deposits(amount:Double):Double{
    var deposit=15000.0
   deposit++
       return amount
}
fun withdraw(amount: Double){
var balance=90000.0
    balance-=0
        return balance

}
fun details(){



}


//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(var accountnumber:Int, var accountname:String,var balance:Int,var withdrawals:Int)
  var withdraws=5





