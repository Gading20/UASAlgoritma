public class pokemonModel {
    private String dark;
    private String dragon;
    private String electrick;
    private String fairy;
    private String bug;

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }

    public String getDark() {
        return dark;
    }

    public void setDark(String dark) {
        this.dark = dark;
    }

    public String getDragon() {
        return dragon;
    }

    public void setDragon(String dragon) {
        this.dragon = dragon;
    }

    public String getElectrick() {
        return electrick;
    }

    public void setElectrick(String electrick) {
        this.electrick = electrick;
    }

    public String getFairy() {
        return fairy;
    }

    public void setFairy(String fairy) {
        this.fairy = fairy;
    }
    public pokemonModel(){
        this.bug = bug;
        this.dark = dark;
        this.dragon = dragon;
        this.electrick= electrick;
        this.fairy = fairy;
    }
}
