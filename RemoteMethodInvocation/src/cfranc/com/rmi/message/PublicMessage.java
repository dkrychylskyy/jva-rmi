package cfranc.com.rmi.message;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PublicMessage extends Remote {
	public static final String MESSAGE_RMI_KEY = "PMKEY";

	public String getText() throws RemoteException;

	public void setText(String text) throws RemoteException;

}
