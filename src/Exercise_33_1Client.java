import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Exercise_33_1Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",1);
            System.out.println("Connected");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("xD");
            System.out.println("dX");
            Loan loan = new Loan(1.035,3,5000);
            objectOutputStream.writeObject(loan);
            System.out.println("object sent");
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            System.out.println("XDXD");
            loan = (Loan) objectInputStream.readObject();
            System.out.println("Object Received");
            System.out.println("Monthly payment is: " + loan.getMonthlyPayment());
            System.out.println("Total payment is: " + loan.getTotalPayment());


        } catch (IOException e) {
            System.out.println("Client Crashed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
