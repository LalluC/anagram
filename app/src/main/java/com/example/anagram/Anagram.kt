package com.example.anagram
import java.util.*


fun isAnagrams(str1: String, str2: String): Boolean {
 if (str1.length != str2.length) {
  return false
 }

 //Convert Strings to character Array
 val strArray1 = str1.toCharArray()
 val strArray2 = str2.toCharArray()

 //Sort the Arrays
 Arrays.sort(strArray1)
 Arrays.sort(strArray2)

 //arrays to String
 val sortedStr1 = String(strArray1)
 val sortedStr2 = String(strArray2)
 //sorting
 return sortedStr1 == sortedStr2
}
fun main(args: Array<String>) {
 val sc = Scanner(System.`in`)

 println("Enter FirstString : ")
 val str1: String = sc.nextLine()

 println("Enter SecondString : ")
 val str2: String = sc.next()

 if (isAnagrams(str1, str2)) {
  println("Anagram Strings !!")
 } else {
  println("Strings are not Anagram !!")
 }
}