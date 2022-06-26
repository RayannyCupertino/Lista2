import lista2.Ajuda;
import lista2.Fetin;

public class App {
        public static void main(String[] args) {
            Ajuda ajuda = new Ajuda();
            Fetin projeto1 = new Fetin("Projeto 1", 15.67);
            Fetin projeto2 = new Fetin("Projeto 2", 38.80);
            Fetin projeto3 = new Fetin("Projeto 3", 60.38);
            Fetin projeto4 = new Fetin("Projeto 4", 100);
            projeto4 = null;
            ajuda.adicionarProjeto(projeto1);
            ajuda.adicionarProjeto(projeto4);
            ajuda.adicionarProjeto(projeto2);
            ajuda.adicionarProjeto(projeto3);
            ajuda.exibirProjetos();

            System.out.println("Fim");
        }
    }