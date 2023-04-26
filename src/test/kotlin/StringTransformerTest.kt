import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class StringTransformerTest {

    private val transformer = StringTransformer()

    @Test
    fun `cambiar un string a mayúsculas`() {

        val name = "pasta de dientes"

        assertThat(transformer.upperCase(name), equalTo("PASTA DE DIENTES"))
    }

    @Test
    fun `emojify`() {
        // la función emojify transforma las palabras que le pasemos en emojis
        // utiliza condicionales de Kotlin para ello
        assertThat(transformer.emojify("apple"), equalTo("🍏"))
        assertThat(transformer.emojify("boat"), equalTo("⛵️"))
        assertThat(transformer.emojify("chocolate"), equalTo("🍫"))
        assertThat(transformer.emojify("pineapple"), equalTo("🍍"))
        assertThat(transformer.emojify("Antonio"), equalTo("Antonio"))
        assertThat(transformer.emojify("cualquier cosa"), equalTo("cualquier cosa"))
    }




}