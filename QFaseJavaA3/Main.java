import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Receita> receitas = new ArrayList<>();

        Receita receitaUm = new Receita(0, "pão de alga", "umami", 10, "farinha de trigo, ovo, leite... resto");
        Receita receitaDois = new Receita(1, "banana bread", "ódio", 15, "nada para ver aqui");
        Receita receitaTres = new Receita(2, "AHHHHHHHHH", "aquele sabor lá", 0, "como que fica emoji aqui? 😂😊🤣🎶");

         receitas.add(receitaUm);
         receitas.add(receitaDois);
         receitas.add(receitaTres);


        for(Receita r : receitas){
            System.out.println("----------------------------------");
            System.out.println(r.getIdReceita());
            System.out.println(r.getNomeReceita());
            System.out.println(r.getSaborReceita());
            System.out.println(r.getQuantidadeIngredientesReceita());
            System.out.println(r.getNomeIngredientesReceita());

        }
    }







}
