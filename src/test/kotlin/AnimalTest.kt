import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class AnimalTest {

    @Test
    fun perretes() {
        // completa el código que falte para que funcione en el archivo Dog.kt
        val dog1 = Dog("bobby")
        val dog2 = Dog("chifle")
        val dog3 = Dog("paqui")

        assertThat(dog1.bark(), equalTo("Wow wow my name is bobby"))
        assertThat(dog2.bark(), equalTo("Wow wow my name is chifle"))
        assertThat(dog3.bark(), equalTo("Wow wow my name is paqui"))
    }

    @Test
    fun gatetes() {
        TODO("Escribe un test para una clase Cat" +
                " que tenga un atributo name (String) y un atributo color (String) " +
                " y un método meow() que responda diciendo su nombre y color, por ejemplo " +
                " \"Meow, mi nombre es Garfield y soy de color naranja\" " +
                "  ESCRIBE PRIMERO EL TEST Y LUEGO CREA LA CLASE Cat PARA HACERLO PASAR")
    }
}