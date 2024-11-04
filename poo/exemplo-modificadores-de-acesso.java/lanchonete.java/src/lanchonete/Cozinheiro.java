package lanchonete;

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
    public void prepararLanche(){
        System.out.println("Preparando lanche do tipo hamburguer");
    }
    public void prepararVitamina(){
        System.out.println("Preparando suco");    
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("Selecionado o pão, salada, ovo e carne");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("Selecionado fruta, leite e suco");
    }
    public void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    public void baterVitaminaLiquidificador(){
        System.out.println("Batendo a vitamina no liquidificador");
    }
    public void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e o ovo para o hamburguer");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
