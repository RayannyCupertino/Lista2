package lista2;
import lista2.execao.FetinExcecao;
import java.util.HashMap;

public class Ajuda {
    HashMap<String, Double> projetos = new HashMap<String, Double>();

    public void adicionarProjeto(Fetin projetoFetin){
        try{
            projetos.put(projetoFetin.getTitulo(), projetoFetin.getNota());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public void exibirProjetos() {
        projetos.forEach((titulo, pontuacao) -> {
            try{
                if(titulo != ""){
                    System.out.println("Título: " + titulo + " - notas: " + pontuacao);
                } else{
                    throw new FetinExcecao("O nome não pode ser vazio");
                }
            } catch (FetinExcecao e){
                System.out.println(e.getMessage());
            }
        });
    }
}
