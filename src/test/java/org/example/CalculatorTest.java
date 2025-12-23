package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Tests de la calculatrice")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ==================== TESTS ADDITION ====================

    @Test
    @DisplayName("Addition de deux nombres positifs")
    void testAdditionNombresPositifs() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 devrait égaler 5");
    }

    @Test
    @DisplayName("Addition avec zéro")
    void testAdditionAvecZero() {
        assertEquals(5, calculator.add(5, 0), "5 + 0 devrait égaler 5");
    }

    @Test
    @DisplayName("Addition de nombres négatifs")
    void testAdditionNombresNegatifs() {
        assertEquals(-8, calculator.add(-5, -3), "-5 + (-3) devrait égaler -8");
    }

    @Test
    @DisplayName("Addition d'un nombre positif et négatif")
    void testAdditionPositifNegatif() {
        assertEquals(2, calculator.add(5, -3), "5 + (-3) devrait égaler 2");
    }

    // ==================== TESTS SOUSTRACTION ====================

    @Test
    @DisplayName("Soustraction de deux nombres positifs")
    void testSoustractionNombresPositifs() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 devrait égaler 2");
    }

    @Test
    @DisplayName("Soustraction avec zéro")
    void testSoustractionAvecZero() {
        assertEquals(5, calculator.subtract(5, 0), "5 - 0 devrait égaler 5");
    }

    @Test
    @DisplayName("Soustraction de nombres négatifs")
    void testSoustractionNombresNegatifs() {
        assertEquals(-2, calculator.subtract(-5, -3), "-5 - (-3) devrait égaler -2");
    }

    @Test
    @DisplayName("Soustraction donnant un résultat négatif")
    void testSoustractionResultatNegatif() {
        assertEquals(-3, calculator.subtract(2, 5), "2 - 5 devrait égaler -3");
    }

    @Test
    @DisplayName("Multiplication de deux nombres positifs")
    void testMultiplicationNombresPositifs() {
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 devrait égaler 15");
    }

    @Test
    @DisplayName("Multiplication par zéro")
    void testMultiplicationParZero() {
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 devrait égaler 0");
    }

    @Test
    @DisplayName("Multiplication par un")
    void testMultiplicationParUn() {
        assertEquals(5, calculator.multiply(5, 1), "5 * 1 devrait égaler 5");
    }

    @Test
    @DisplayName("Multiplication de nombres négatifs")
    void testMultiplicationNombresNegatifs() {
        assertEquals(15, calculator.multiply(-3, -5), "-3 * (-5) devrait égaler 15");
    }

    @Test
    @DisplayName("Multiplication d'un nombre positif et négatif")
    void testMultiplicationPositifNegatif() {
        assertEquals(-15, calculator.multiply(3, -5), "3 * (-5) devrait égaler -15");
    }

    // ==================== TESTS DIVISION ====================

    @Test
    @DisplayName("Division de deux nombres positifs")
    void testDivisionNombresPositifs() {
        assertEquals(2.5, calculator.divide(5, 2), 0.0001, "5 / 2 devrait égaler 2.5");
    }

    @Test
    @DisplayName("Division donnant un résultat entier")
    void testDivisionResultatEntier() {
        assertEquals(3, calculator.divide(15, 5), 0.0001, "15 / 5 devrait égaler 3");
    }

    @Test
    @DisplayName("Division par zéro lance une exception")
    void testDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Division par zéro impossible", exception.getMessage());
    }

    @Test
    @DisplayName("Division de zéro par un nombre")
    void testDivisionDeZero() {
        assertEquals(0, calculator.divide(0, 5), 0.0001, "0 / 5 devrait égaler 0");
    }

    @Test
    @DisplayName("Division de nombres négatifs")
    void testDivisionNombresNegatifs() {
        assertEquals(2, calculator.divide(-10, -5), 0.0001, "-10 / (-5) devrait égaler 2");
    }

    @Test
    @DisplayName("Division d'un nombre positif et négatif")
    void testDivisionPositifNegatif() {
        assertEquals(-2, calculator.divide(10, -5), 0.0001, "10 / (-5) devrait égaler -2");
    }
}
