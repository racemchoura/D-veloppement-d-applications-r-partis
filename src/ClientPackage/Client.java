package ClientPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	Socket socket=new Socket ("localhost",1234);
    	System.out.println("un client est connecté");
    	Scanner scanner = new Scanner (System.in);
    	//le client est demandé de tapez un entier x au clavier
    	System.out.println("Donner un nb");
    	int x=scanner.nextInt();
    	// le client envoie cet entier au serveur
    	OutputStream os=socket.getOutputStream();
    	os.write(x);
    	// le client recoit le resultas 
    	InputStream is= socket.getInputStream();
    	int nb = is.read();
    	System.out.println("la reponse" +nb);
    	socket.close();
    	
    }catch (IOException e) {
    	e.printStackTrace();
    }
	}

}
