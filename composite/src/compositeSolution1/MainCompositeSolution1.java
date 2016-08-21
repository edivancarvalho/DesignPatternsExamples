package compositeSolution1;

public class MainCompositeSolution1 {

	public static void main(String[] args) {
        ArquivoComponent meuVideo = new ArquivoVideo("meu video.rmvb");
        ArquivoComponent meuOutroVideo = new ArquivoVideo("novo video.rmvb");
        ArquivoComponent minhaPasta = new ArquivoComposite("minha pasta/");
 
        ((ArquivoComposite) minhaPasta).adicionar(meuVideo);
        ((ArquivoComposite) minhaPasta).adicionar(meuOutroVideo);
        minhaPasta.printNomeDoArquivo();
    }
	
}
