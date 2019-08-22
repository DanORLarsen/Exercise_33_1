import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Exercise_33_1Server {
    public static void main(String[] args) {


ServerSocket serverSocket;
    {
        try {
            serverSocket = new ServerSocket(1);
            System.out.println("server running");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Loan.dat", true));
             while (true){
                 Socket socket = serverSocket.accept();
                 System.out.println("Client connected to server");
                 ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

                 Loan object = (Loan) objectInputStream.readObject();
                 System.out.println("OBJECT RECEIVED");
                 if(object.getAmmount()==0)
                 {break;}
                 object.totalPayment();
                 System.out.println("Payment " + object.getTotalPayment());
                 object.monthlyPayment();
                 System.out.println("Monthly " + object.getMonthlyPayment());
                 objectOutputStream.writeObject(object);
                 objectOutputStream.flush();
                 System.out.println("Object sent back");
                 //objectInputStream.close();
             }
            //objectOutputStream.close();

        } catch (IOException e) {
            System.out.println("shit Crashed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }
}
