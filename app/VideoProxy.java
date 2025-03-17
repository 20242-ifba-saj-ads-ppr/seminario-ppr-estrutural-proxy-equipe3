package app;

public class VideoProxy implements Grafico {
    private String titulo;
    private String arquivo;
    private Video videoReal;
    
    public VideoProxy(String titulo, String arquivo) {
        this.titulo = titulo;
        this.arquivo = arquivo;
    }
    
    @Override
    public void exibir() {
        // Carrega o vídeo real apenas quando necessário
        if (videoReal == null) {
            videoReal = new Video(titulo, arquivo);
        }
        videoReal.exibir();
    }
    
    @Override
    public String getTitulo() {
        return titulo;
    }
    
    // Método para verificar se o vídeo já foi carregado
    public boolean estaCarregado() {
        return videoReal != null;
    }
}
