import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MediatorTest {
    @Test
    void testeMediator() {

        Chat chat = new Chat();

        Participante usuario1 = new Usuario("João", chat);
        Participante usuario2 = new Usuario("Maria", chat);
        Participante usuario3 = new Usuario("Pedro", chat);

        chat.adicionarParticipante(usuario1);
        chat.adicionarParticipante(usuario2);
        chat.adicionarParticipante(usuario3);

        usuario1.enviarMensagem("Oi, pessoal!");
        usuario2.enviarMensagem("Oi, João!");
        usuario3.enviarMensagem("Oi, pessoal!");

        assertEquals("Oi, pessoal!", ((Usuario) usuario2).getMensagensRecebidas());
        assertEquals("Oi, pessoal!", ((Usuario) usuario3).getMensagensRecebidas());
        assertEquals("Oi, João! Oi, pessoal!", ((Usuario) usuario1).getMensagensRecebidas());
    }
}






