public abstract class Sport {
    
    protected String nomSport;

    protected Sport(String nomS) {
        this.nomSport = nomS;
    }

    public String getNomSport() {
        return this.nomSport;
    }
}
