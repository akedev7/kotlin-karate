package utils.test

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import utils.CustomAssertions

class CustomAssertionsTest {

    @Test
    fun `valid email should return true`() {
        assertTrue(CustomAssertions.isValidEmail("test@example.com"))
        assertTrue(CustomAssertions.isValidEmail("user.name+tag+sorting@example.com"))
    }

    @Test
    fun `invalid email should return false`() {
        assertFalse(CustomAssertions.isValidEmail("invalid-email"))
    }
}
