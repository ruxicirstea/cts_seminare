package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.classes.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;

import java.util.Locale;

import static org.junit.Assert.*;

public class GrupaWithMocksTest {
    @Test
    public void testAdaugaStudent()
    {
        StudentDummy studentDummy = new StudentDummy();
        Grupa grupa = new Grupa(1078);
        grupa.adaugaStudent(studentDummy);

        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void testSetPromovabilitate()
    {
        StudentStub studentStub = new StudentStub();
        Grupa grupa =new Grupa(1028);
        grupa.adaugaStudent(studentStub);

        assertEquals(0, grupa.getPromovabilitate(),0.01);
    }


    @Test
    public void testGrupaWithFakeRight()
    {
        Grupa grupa = new Grupa(1078);
        //10 studenti, 7 integralisti si 3 restantieri

        for(int i=0; i <7 ;i++)
        {
            StudentFake studentFake= new StudentFake();
            studentFake.setValAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }

        for(int i =0 ;i< 3;i++)
        {
            StudentFake studentFake =new StudentFake();
            studentFake.setValAreRestante(true);
            grupa.adaugaStudent(studentFake);
        }
        assertEquals(0.7, grupa.getPromovabilitate(),0.01);
    }
}