import java.util.ArrayList;
import java.util.List;

class Chat implements Mediator {
    private List<Participante> participantes;

    public Chat() {
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public void enviarMensagem(String mensagem, Participante participante) {
        for (Participante p : participantes) {
            if (p != participante) {
                p.receberMensagem(mensagem);
            }
        }
    }
}
