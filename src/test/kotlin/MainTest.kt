import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testaPortariaNegado() {
        Assertions.assertAll(
            {Assertions.assertEquals("Negado.", portaria(1,"","xl"))},
            {Assertions.assertEquals("Negado.", portaria(17,"tutu","xtt"))},
            {Assertions.assertEquals("Negado.", portaria(58,"1","xt"))}
        )
    }

    @Test
    fun testaPortariaWelcome() {
        Assertions.assertAll(
            {Assertions.assertEquals("Welcome.", portaria(18,"comum","xt"))},
            {Assertions.assertEquals("Welcome.", portaria(200, "premium", "xt"))},
            {Assertions.assertEquals("Welcome.", portaria(25, "luxo", "xl"))}
        )
    }

    @Test
    fun testaPortariaSemPassarOsParametros() {
        Assertions.assertAll(
            {Assertions.assertEquals("Negado.", portaria( 19, "", ""))}
        )
    }

    @Test
    fun testaMain() {
        Assertions.assertEquals("Welcome.", main())
    }
}