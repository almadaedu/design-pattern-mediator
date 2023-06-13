class Usuario extends Participante {
    private String nome;
    private String mensagensRecebidas;

    public Usuario(String nome, Mediator mediator) {
        super(mediator);
        this.nome = nome;
        this.mensagensRecebidas = "";
    }

    @Override
    public void enviarMensagem(String mensagem) {
        mensagensRecebidas = "";
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        mensagensRecebidas += mensagem + " ";
    }

    public String getMensagensRecebidas() {
        return mensagensRecebidas.trim();
    }
}
