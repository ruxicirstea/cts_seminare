package ro.ase.cts.template.main;

import ro.ase.cts.template.MasaInBar;
import ro.ase.cts.template.OcupareMasa;
import ro.ase.cts.template.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        TemplateOcupareMasa masa=new OcupareMasa(20);
        masa.ocupaMasa();

        TemplateOcupareMasa masa1=new MasaInBar(22);
        masa1.ocupaMasa();
    }
}
