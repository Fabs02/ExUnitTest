import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa os cenários da portaria")

    fun testPortaria() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")

        Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")

        Assertions.assertEquals(portaria(25, "comum", "xt451948"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "451948"), "Negado.")

        Assertions.assertEquals(portaria(25, "premium", "xt451948"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "451948"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xl451948"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xl451948"), "Welcome.")
    }

    /* assertAll -> Testa todos os teste que estiver dentro das {} de uma vez. No modo feito acima, ele testa um de cada
    vez.

    Assertions.assertAll()
    {}
    */

}