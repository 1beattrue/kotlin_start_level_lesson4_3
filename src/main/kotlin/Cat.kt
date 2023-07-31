class Cat(val name: String, var age: Int, val weight: Float = 0f) {

    val isOldState = age >= 12

    val isOldState2: Boolean /* таким образом, несмотря на то, что переменная неизменяемая, то есть мы не можем
                                присвоить ей значение сами, но при этом когда мы захотим узнать, что в ней лежит
                                - геттер вернет нужное значение */
        get() = age >= 12

    fun printInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Weight: $weight")
    }

    fun isOld() = age >= 12
}