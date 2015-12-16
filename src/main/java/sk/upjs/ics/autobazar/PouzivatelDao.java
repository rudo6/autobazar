package sk.upjs.ics.autobazar;

import java.util.List;

public interface PouzivatelDao {
    
    public void pridajPouzivatela(Pouzivatel pouzivatel);
    
    public Long overPouzivatela(String uzivatelskeMeno, String heslo);
}
