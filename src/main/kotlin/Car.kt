class Car(val model: String) {


    fun drive() {

        println("you are driving car $model"    )
    }

    fun drive2() {
        while (true) {
            drive2()
            while (false) {

            }
        }
    }
}