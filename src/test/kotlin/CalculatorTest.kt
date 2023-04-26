import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun suma() {
        val a = 10
        val b = 2

        assertThat(calculator.sum(a,b), equalTo(12))
    }

    @Test
    fun resta() {
        val a = 10
        val b = 2

        assertThat(calculator.substract(a,b), equalTo(8))

    }

    @Test
    fun `multiplicación`() {
        TODO("Escribe un test para una función de la clase Calculator" +
                " que se llame multiply y que sirva para multiplicar" +
                " dos números. Escribe primero el test, comprueba que no funciona" +
                " y luego escribe el código de la función para hacer pasar el test")
    }

    @Test
    fun `división`() {
        TODO("Escribe un test para una función de la clase Calculator" +
                " que se llame divide y que sirva para dividir" +
                " dos números. Escribe primero el test, comprueba que no funciona" +
                " y luego escribe el código de la función para hacer pasar el test")
    }
}