package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	// CREAMOS OBJETOS PARA TRABAJAR CON LOS TESTEOS
	Geometria g1 = new Geometria();
	Geometria g2 = new Geometria();

	@BeforeAll
	public static void testBeforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	// TESTEO DE LOS METODOS DE LAS AREAS
	@Test
	public void testAreaCuadrado() { // LADO * LADO
		int resultado = g1.areacuadrado(5);
		int esperado = 25;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaCirculo() { // PI * RADIO AL CUADRADO
		double resultado = g1.areaCirculo(5);
		double esperado = 78.54;
		int delta = 1; // MARGEN DE ERROR
		assertEquals(esperado, resultado, delta);
	}

	@Test
	public void testAreaTriangulo() { // (BASE * ALTURA) / 2
		int resultado = g1.areatriangulo(2, 3);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRectangulo() { // LARGO * ANCHO ó (BASE * ALTURA)
		int resultado = g1.arearectangulo(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaPentagono() { // (PERIMETRO * APOTEMA) / 2
		int resultado = g1.areapentagono(10, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRombo() { // (DIAGONAL (GRANDE) * diagonal (pequeña)) / 2
		int resultado = g1.arearombo(10, 2);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRomboide() { // BASE * ALTURA
		int resultado = g1.arearomboide(10, 2);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTrapecio() { // ((BASE (GRANDE) + base (pequeña)) * ALTURA) / 2
		int resultado = g1.areatrapecio(10, 2, 3);
		int esperado = 18;
		assertEquals(esperado, resultado);
	}
	
	// TESTEO DEL SELECTOR DE FIGURAS (SWITCH)
	public void testFiguraCuadrado() {
		String resultado = g1.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraCirculo() {
		String resultado = g1.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraTriangulo() {
		String resultado = g1.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraRectangulo() {
		String resultado = g1.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraPentagono() {
		String resultado = g1.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraRombo() {
		String resultado = g1.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraRomboide() {
		String resultado = g1.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraTrapecio() {
		String resultado = g1.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}
	
	public void testFiguraDefault() {
		String resultado = g1.figura(9);
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	
	// TESTEO DE LOS GETTERS Y SETTERS
	public void testgetid() {
		int resultado = g1.getId();
		int esperado = 9; //9 ES EL DEFAULT
		assertEquals(esperado, resultado);
	}
	
	public void testsetid() {
		g1.setId(8);
		int resultado = g1.getId();
		assertEquals(8, resultado);
	}
	
	@Test
	public void testgetnom() {
		String resultado = g1.getNom();
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testsetnom() {
		String esperado = "Albert";
		g1.setNom(esperado);
		String resultado = g1.getNom();
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testToString() {
		g1.setArea(12.3456);
		g1.setId(1);
		g1.setNom("Circulo");
		String resultado = g1.toString();
		String esperado = "Geometria [id=1, nom=Circulo, area=12.3456]";
		assertEquals(esperado, resultado);
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}

	@AfterAll
	public static void AfterClass() {
		System.out.println("AfterClass");
	}
}
