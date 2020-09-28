import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ClientHandler extends Thread{

    DateFormat fecha = new SimpleDateFormat("yyy/mm/dd");
    DateFormat hora = new SimpleDateFormat("hh:mm:ss");

    final DataInputStream in;
    final Socket socket;
    Ventana ventana;

    public ClientHandler(Socket socket, DataInputStream in, Ventana ventana){
        this.socket = socket;
        this.in = in;
        this.ventana = ventana;
    }

    public void run() {
        String recibido;
        while (true) {
            try {
                recibido = in.readUTF();
                ventana.AñadirMensaje(recibido, recibido.substring(0, 5));
                break;

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        try {
            this.in.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
