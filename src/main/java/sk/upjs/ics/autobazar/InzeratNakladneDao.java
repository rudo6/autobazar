package sk.upjs.ics.autobazar;

import java.util.List;

public interface InzeratNakladneDao {
    public void pridat(InzeratNakladne inzerat);
    
    public List<InzeratNakladne> dajVsetky();
    
    public List<InzeratNakladne> vyhladaj(String znacka, String model, String odRocnik, String doRocnik);
    
    public void odstranit(InzeratNakladne inzerat);
}
