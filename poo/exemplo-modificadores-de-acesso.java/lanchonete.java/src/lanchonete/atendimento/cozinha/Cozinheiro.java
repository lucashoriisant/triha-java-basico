package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao (){
        System.out.println("Adicionando lanche natural de hamburguer no balcao");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparando lanche do tipo hamburguer");
    }
    private void prepararVitamina(){
        System.out.println("Preparando suco");    
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionado o pão, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionado fruta, leite e suco");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo a vitamina no liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e o ovo para o hamburguer");

    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
