import java.time.LocalDateTime
import java.util.Calendar

// домашнее задание

class Employee(val name: String, val position: String, val startYear: Int) {

    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Работаю...")
    }
}