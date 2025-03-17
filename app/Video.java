package app;

public class Video implements Grafico {
    private String titulo;
    private String arquivo;
    
    public Video(String titulo, String arquivo) {
        this.titulo = titulo;
        this.arquivo = arquivo;
        carregarArquivoDeVideo();
    }
    
    private void carregarArquivoDeVideo() {
        System.out.println("Carregando vídeo de " + arquivo + "...");
        // Simulando um carregamento que consome recursos
        try {
            Thread.sleep(1000); // Simulação de 1 segundo para carregar (reduzido para tornar os testes mais rápidos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Vídeo " + titulo + " carregado completamente!");
    }
    
    @Override
    public void exibir() {
        System.out.println("Reproduzindo vídeo: " + titulo);
    }
    
    @Override
    public String getTitulo() {
        return titulo;
    }
}