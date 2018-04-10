package cfranc.com.rmi.message.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import cfranc.com.rmi.message.PublicMessage;

public class PublicMessageImpl extends UnicastRemoteObject implements PublicMessage {

	private static final long serialVersionUID = 8086750426071332539L;
	private String text = null;

	protected PublicMessageImpl() throws RemoteException {
		super();
	}

	public PublicMessageImpl(String text) throws RemoteException {
		super();
		this.text = text;
	}

	@Override
	public String getText() throws RemoteException {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public void setText(String text) throws RemoteException {
		text = "t";

	}

}
