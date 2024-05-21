import java.io.IOException;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws  IOException, InterruptedException{

        int usoMemoria = 10;
        Double usoProcessador = 2.0;
        Double usoDisco = 230.0;

        JSONObject json = new JSONObject();


        if (usoMemoria > 5){
            json.put("text", "Usuário com uso excessivo de Memória RAM.");
            Slack.enviarMensagem(json);
        }
    }
}
