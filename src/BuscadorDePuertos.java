import java.net.ServerSocket;

public class BuscadorDePuertos {

    private ServerSocket serverSocket;

    private boolean RevisaPuerto(int puerto) {
        boolean resultado;

        try {

            serverSocket = new ServerSocket(puerto);
            serverSocket.close();
            resultado = true;

        }
        catch (Exception e) {
            resultado = false;
        }

        return (resultado);
    }

    public int BuscaPuerto() {

        int puerto = 40000;
        boolean encontrado = false;

        System.out.println("Buscando puerto...");

        while (encontrado == false) {

            if (puerto > 65535) {
                System.out.println("No hay puertos disponibles.");
                break;
            }

            else if (RevisaPuerto(puerto)){
                System.out.println("Puerto encontrado: " + puerto);
                encontrado = true;
            }

            else{
                puerto++;
            }
        }

        return puerto;
    }
}
