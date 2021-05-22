package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testConstructorCuParametru()
    {
        String nume="Gigel";
        Student student=new Student(nume);
        //verificam numele
        assertEquals(nume,student.getNume());
    }

    @Test
    public void testConstructorFaraParametru()
    {
        Student student =new Student();
        assertNotNull("Nu este initializat numele",student.getNume());
        assertNotNull("Lista nu este intitializata",student.getNote());
    }

    @Test
    public void testAdaugaNota()
    {
        Student student=new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void  testDimensiuneLista()
    {
        Student student=new Student();
        int nota = 7;
        student.adaugaNota(nota);
        assertEquals(1,student.getNote().size());
    }

    @Test
    public void calculeazaMedie()
    {
        Student student=new Student();
        int nota1=5;
        int  nota2=10;

        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        float medie= (float) ((nota1+nota2)/2.0);
        assertEquals(medie,student.calculeazaMedie(),0.01);

    }

    @Test
    public void testAreRestante()
    {
        Student student =new Student();
        student.adaugaNota(10);
        student.adaugaNota(4);
        assertTrue(student.areRestante());

    }
    @Test
    public void testNuAreRestante()
    {
        Student student =new Student();
        student.adaugaNota(10);
        student.adaugaNota(8);
        assertFalse(student.areRestante());

    }


}