package HomeTasks

import kotlin.Throws
import java.lang.InterruptedException
import java.util.*
import kotlin.jvm.JvmStatic

object Task01_040422_Mark {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите число в диапазоне от 10 до 200 и эта программа определит" +
                ", находится ли это число в диапазоне от 25 до 100 и от 99 до 150")
        val num = scanner.nextInt()
        println("Минутку, обрабатываю данные...")
        Thread.sleep(3000)
        if (num < 10 || num > 200) {
            println("Это число не верно")
            return
        }
        if (num > 25 && num < 100) {
            println("Это число входит в диапазон 25--100 ")
        } else println("Это число не входит в диапазон 25--100")
        if (num > 99 && num < 150) {
            println("Это число входит в диапазон 99--150 ")
        } else println("Это число не входит в диапазон 99--150")
    }
}