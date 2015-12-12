package sk.upjs.ics.autobazar;

public interface PouzivatelDao {
    
    public void pridajPouzivatela(Pouzivatel pouzivatel);
    
    public boolean overPouzivatela(String uzivatelskeMeno, String heslo);
    
    public void odstranPouzivatela(Pouzivatel pouzivatel);
}
