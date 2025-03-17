package app;

import java.util.ArrayList;
import java.util.List;

public class ListaDeVideos {
    private List<VideoProxy> videos;
    
    public ListaDeVideos() {
        videos = new ArrayList<>();
    }
    
    public void adicionarVideo(String titulo, String arquivo) {
        videos.add(new VideoProxy(titulo, arquivo));
    }
    
    public void exibirLista() {
        System.out.println("\n=== LISTA DE VÍDEOS DISPONÍVEIS ===");
        for (int i = 0; i < videos.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(videos.get(i).getTitulo());
        }
        System.out.println("=================================\n");
    }
    
    public void reproduzirVideo(int indice) {
        if (indice >= 1 && indice <= videos.size()) {
            System.out.println("\n[USUÁRIO CLICOU NO VÍDEO " + indice + "]");
            videos.get(indice - 1).exibir();
            System.out.println();
        } else {
            System.out.println("Índice de vídeo inválido!");
        }
    }
    
    public VideoProxy getVideo(int indice) {
        if (indice >= 1 && indice <= videos.size()) {
            return videos.get(indice - 1);
        }
        return null;
    }
    
    public int getTamanho() {
        return videos.size();
    }
}