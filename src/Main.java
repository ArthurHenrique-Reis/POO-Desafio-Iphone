public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Usando o reprodutor musical
        meuIphone.selecionarMusica("Song 1");
        meuIphone.tocar();
        meuIphone.pausar();

        // Usando o telefone
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Usando o navegador
        meuIphone.exibirPagina("https://example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
