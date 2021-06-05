package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categories.GetPromovabilitateTest;
import ro.ase.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class,GrupaWithMocksTest.class})
@Categories.IncludeCategory(GetPromovabilitateTest.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
