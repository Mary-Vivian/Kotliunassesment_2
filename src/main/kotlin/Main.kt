fun main(args: Array<String>) {
//    stringExtract("Barnie bakes brown bagels and buns")
    intArrray(arrayOf(5,8,9))
    circlevol(4.5)
    stringExtract("Barnie bakes brown bagels and buns")
    ispalindrome("baby")
    ispalindrome("wow")

}
//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun stringExtract(sentence:String){
   var newsentence=sentence.replace("b"," ")
    println(newsentence)

    }


//}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun intArrray(numbers:Array<Int>){
    for(x in numbers){
        var sum=numbers.sum()
        println(sum)
        var count=numbers.count()
        println(count)
        var avg=numbers.average()
        println(avg)
    }

}
//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π
fun circlevol(radius:Double){
    var volume=4/3*3.14159*radius
    println(volume)

}
//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun ispalindrome(word:String){
    var newWord=word.reversed()
    if (newWord==word){
        println(true)
    }
    else{
        println(false)
    }

}






