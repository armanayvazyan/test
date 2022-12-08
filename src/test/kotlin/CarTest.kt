import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CarTest {

    @Test
    fun drive() {
        val car = Car("mercedes")
        car.drive()
    }

    @Test
    fun getModel() {
        if(true) {

        }
        val car = Car("mercedes")
        assertEquals("mercedes", car.model)
    }
}