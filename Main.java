import app.ListaDeVideos;
import app.VideoProxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("INICIANDO TESTES DO PADRÃO PROXY VIRTUAL\n");
        
        // Teste 1: Criar lista de vídeos e exibir miniaturas
        System.out.println("Teste 1: Criar lista de vídeos e exibir miniaturas");
        ListaDeVideos lista = new ListaDeVideos();
        
        // Adicionar vídeos à lista
        lista.adicionarVideo("Tutorial Java", "tutorial_java.mp4");
        lista.adicionarVideo("Padrões de Projeto", "design_patterns.mp4");
        lista.adicionarVideo("Programação Orientada a Objetos", "poo.mp4");
        lista.adicionarVideo("Spring Framework", "spring.mp4");
        
        // Exibir Lista
        lista.exibirLista();
        
        // Teste 2: Verificar que nenhum vídeo foi carregado ainda
        System.out.println("Teste 2: Verificar que nenhum vídeo foi carregado ainda");
        for (int i = 1; i <= lista.getTamanho(); i++) {
            VideoProxy video = lista.getVideo(i);
            System.out.println("Vídeo " + i + " (" + video.getTitulo() + ") está carregado? " + 
                              video.estaCarregado());
        }
        System.out.println();
        
        // Teste 3: Carregar e reproduzir o primeiro vídeo
        System.out.println("Teste 3: Carregar e reproduzir o primeiro vídeo");
        lista.reproduzirVideo(1);
        
        // Teste 4: Verificar quais vídeos estão carregados
        System.out.println("Teste 4: Verificar quais vídeos estão carregados");
        for (int i = 1; i <= lista.getTamanho(); i++) {
            VideoProxy video = lista.getVideo(i);
            System.out.println("Vídeo " + i + " (" + video.getTitulo() + ") está carregado? " + 
                              video.estaCarregado());
        }
        System.out.println();
        
        // Teste 5: Carregar e reproduzir outro vídeo
        System.out.println("Teste 5: Carregar e reproduzir outro vídeo");
        lista.reproduzirVideo(3);
        
        // Teste 6: Verificar novamente quais vídeos estão carregados
        System.out.println("Teste 6: Verificar novamente quais vídeos estão carregados");
        for (int i = 1; i <= lista.getTamanho(); i++) {
            VideoProxy video = lista.getVideo(i);
            System.out.println("Vídeo " + i + " (" + video.getTitulo() + ") está carregado? " + 
                              video.estaCarregado());
        }
        System.out.println();
        
        // Teste 7: Reproduzir um vídeo já carregado (não deve recarregar)
        System.out.println("Teste 7: Reproduzir um vídeo já carregado (não deve recarregar)");
        lista.reproduzirVideo(1);
        
        System.out.println("\nTESTES CONCLUÍDOS");
    }
}