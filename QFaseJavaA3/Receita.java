public class Receita {

    private int idReceita;
    private String nomeReceita;
    private String saborReceita;
    private int quantidadeIngredientesReceita;
    private String nomeIngredientesReceita;
    


    public Receita(int idReceita, String nomeReceita, String saborReceita, int quantidadeIngredientesReceita, String nomeIngredientesReceita) {
        this.idReceita = idReceita;
        this.nomeReceita = nomeReceita;
        this.saborReceita = saborReceita;
        this.quantidadeIngredientesReceita = quantidadeIngredientesReceita;
        this.nomeIngredientesReceita = nomeIngredientesReceita;
    };



    public int getIdReceita() {
        return idReceita;
    }
    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }
    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public String getSaborReceita() {
        return saborReceita;
    }
    public void setSaborReceita(String saborReceita) {
        this.saborReceita = saborReceita;
    }

    public int getQuantidadeIngredientesReceita() {
        return quantidadeIngredientesReceita;
    }
    public void setQuantidadeIngredientesReceita(int quantidadeIngredientesReceita) {
        this.quantidadeIngredientesReceita = quantidadeIngredientesReceita;
    }

    public String getNomeIngredientesReceita() {
        return nomeIngredientesReceita;
    }
    public void setNomeIngredientesReceita(String nomeIngredientesReceita) {
        this.nomeIngredientesReceita = nomeIngredientesReceita;
    }



}