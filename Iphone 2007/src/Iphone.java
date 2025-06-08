public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String imei; // International Mobile Equipment Identity

    public Iphone(String modelo, String imei) {
        this.modelo = modelo;
        this.imei = imei;
        System.out.println("iPhone " + this.modelo + " (" + this.imei + ") inicializado.");
    }

    // --- Implementação de ReprodutorMusical ---
    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // --- Implementação de AparelhoTelefonico ---
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // --- Implementação de NavegadorInternet ---
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para teste (opcional, apenas para demonstrar)
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("1ª Geração", "012345678901234");

        System.out.println("\n--- Reprodutor Musical ---");
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Aparelho Telefônico ---");
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.apple.com/iphone");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}