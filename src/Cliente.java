import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public void main() throws IOException {
        try {
            Scanner scan = new Scanner(System.in);

            InetAddress ip = InetAddress.getByName("localhost");

            Socket socket = new Socket(ip, 40000);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                System.out.println(in.readUTF());
                String contenido = scan.nextLine();
                out.writeUTF(contenido);

                if (contenido.equals("Salir")) {
                    System.out.println("Cerrando la conexión" + socket);
                    socket.close();
                    System.out.println("Se cerró el chinamo");
                    break;
                }
                String recibido = in.readUTF();
                System.out.println(recibido);
            }
            scan.close();
            in.close();
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
