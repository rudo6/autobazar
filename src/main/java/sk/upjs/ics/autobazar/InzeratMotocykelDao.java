package sk.upjs.ics.autobazar;

import java.util.List;

public interface InzeratMotocykelDao {
    public void pridat(InzeratMotocykel inzerat);
    
    public List<InzeratMotocykel> dajVsetky();
    
    public List<InzeratMotocykel> vyhladaj(String znacka, String model, String odRocnik, String doRocnik);
    
    public void odstranit(InzeratMotocykel inzerat);
    
    public List<InzeratMotocykel> dajPodlaPouzivatela(Long idP);
}
