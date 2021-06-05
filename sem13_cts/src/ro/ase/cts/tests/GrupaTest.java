package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.classes.IStudent;
import ro.ase.cts.classes.Student;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testConstructor() {
        Grupa grupa = new Grupa(1078);
        assertEquals(1078, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSublimita() {
        Grupa grupa = new Grupa(999);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPesteLimita() {
        Grupa grupa = new Grupa(1102);
    }

    @Test(timeout = 200)
    public void testConstructorPerformanta() {
        Grupa grupa = new Grupa(1000);
    }

    @Test
    public void testExistaConstructorLista() {
        Grupa grupa = new Grupa(1079);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    public void testGetPromovabilitateRight() {
        Grupa grupa = new Grupa(1078);
        for (int i = 0; i < 8; i++) {
            IStudent student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        for (int i = 0; i < 2; i++) {
            IStudent student = new Student();
            student.adaugaNota(2);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testPromovabilitateLimitaSuperioara() {
        Grupa grupa = new Grupa(1078);
        for (int i = 0; i < 8; i++) {
            IStudent student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }

        assertEquals(1, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testPromovabilitateLimitaInferioara() {
        Grupa grupa = new Grupa(1078);
        for (int i = 0; i < 8; i++) {
            IStudent student = new Student();
            student.adaugaNota(4);
            grupa.adaugaStudent(student);
        }

        assertEquals(0, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testGetPromovabilitateInverse() {
        int nrIntegralisti = 8;
        int nrRestantieri = 2;
        Grupa grupa = new Grupa(1078);
        for (int i = 0; i < nrIntegralisti; i++) {
            IStudent student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
        for (int i = 0; i < nrRestantieri; i++) {
            IStudent student = new Student();
            student.adaugaNota(4);
            grupa.adaugaStudent(student);
        }
        assertEquals(nrIntegralisti, grupa.getPromovabilitate() * grupa.getStudenti().size(), 0.01);

    }

    @Test
    public void testGetPromovabilitateError() {
        Grupa grupa = new Grupa(1078);
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test(timeout = 500)
    public void testGetPromovabilitatePerformance() {
        Grupa grupa = new Grupa(1078);
        for (int i = 0; i < 35; i++) {
            IStudent student = new Student();
            for (int j = 0; j < 7; j++) {
                student.adaugaNota(8);
            }
            grupa.adaugaStudent(student);
        }
        grupa.getPromovabilitate();
    }
    @Test
    public void testGetPromovabilitateCardinalityAreRestanta() {
        Grupa grupa = new Grupa(1078);
        Student student = new Student();
        student.adaugaNota(4);
        grupa.adaugaStudent(student);
        assertEquals(0, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testGetPromovabilitateCardinalityNuAreRestanta() {
        Grupa grupa = new Grupa(1078);
        Student student = new Student();
        student.adaugaNota(10);
        grupa.adaugaStudent(student);
        assertEquals(1, grupa.getPromovabilitate(), 0.001);
    }
}