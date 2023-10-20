package SeverPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ServerSocket ss=new ServerSocket(1234);
    System.out.print("je suis un serveur en attente la connexion d'un client");
	Socket s =ss.accept();
	System.out.print("le client est connecté");
	InputStream is = s.getInputStream();
	// le serveur est en attend de nombre x 
	System.out.print("j'attend un nombre x = ");
	int x=is.read();
	//le serveur calcul le produit X*5
	int nb=x*5;
	System.out.print("la reponse: ");
	//le serveur envoie le résultas au client
	OutputStream os=s.getOutputStream();
	os.write(nb);
	//la dernier étape : Fermer socket
	s.close();

    }catch (IOException e) {
    	e.printStackTrace();
    }
	}

}
