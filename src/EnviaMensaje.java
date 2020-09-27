import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EnviaMensaje {

    DataInputStream in;
    DataOutputStream out;
    Socket socket;

    public boolean Enviar(String hostDestino, int puertoDestino, String mensaje, int puertoOrigen){

        try {

            socket = new Socket(hostDestino, puertoDestino);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            out.writeUTF(puertoOrigen + ": " + mensaje);

            out.close();

            socket.close();

            return false;

        }
        catch (IOException e) {

            System.out.println("Problemas de conexión.");
            return true;

        }
    }
}
