fun main() {
    // методы в ООП
    val cat = Cat("Barsik", 15,3f)
    cat.printInfo()

    // проверка на старость
    println(cat.isOld())

    // предположим, что у нас нет доступа к классу Cat
    // как создать такой же метод?
    println(cat.isOld2())

    println()

    // поскольку данный метод по сути ничего не делает, логичнее добавить классу свойство, которое содержит данные о его старости
    println(cat.isOldState)
    cat.age = 10
    println(cat.isOldState) /* вывело true. почему? при создании класса сразу проинициализировались все поля,
                               поэтому изменение возраста не повлияло на изменение свойства */

    cat.age = 12
    println(cat.isOldState2)
    cat.age = 10
    println(cat.isOldState2) // теперь все хорошо

    /* выводы: 1) если хотим создать метод - думаем, делает ли он что-то или можно просто создать свойство
               2) если значение свойства зависит от других переменных - переопределяем геттер,
               чтобы он в любой момент возвращал правильное значение */

    println()
    // домашнее задание
    val employee = Employee("Vitaliy", "junior-programmer", 2020)
    employee.work()
    employee.printInfo()
}

fun Cat.isOld2() = age >= 12 // extension function

fun Employee.printInfo() {
    println("Имя: $name\nДолжность: $position\nГод устройства: $startYear\nСтаж: $experience")
}