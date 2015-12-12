package sk.upjs.ics.autobazar;

public enum InzeratFactory {
    INSTANCE;
    
    public InzeratOsobneDao getInzeratOsobneDao(){
        return new MySqlInzeratDao();
    }
    
    public InzeratNakladneDao getInzeratNakladneDao(){
        return new MySqlInzeratNakladneDao();
    }
    
    public PouzivatelDao getPouzivatel(){
        return new MySqlPouzivatelDao();
    }
    
    public InzeratMotocykelDao getInzeratMotocykelDao(){
        return new MySqlInzeratMotocykelDao();
    }
}
