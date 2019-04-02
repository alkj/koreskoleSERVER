package server;

import java.util.ArrayList;

public interface KøreskolePriserInterface extends java.rmi.Remote {
	
	//--------adminstratorer-------------//
	boolean logIndAdmin(String adminBrugernavn, String adminKodeord) 											throws java.rmi.RemoteException;
	void sletKøreskole(String adminBrugernavn, String adminKodeord, Køreskole køreskole) 						throws java.rmi.RemoteException;
	void sletKøreskoleTilbud(String adminBrugernavn, String adminKodeord, Køreskole køreskole)					throws java.rmi.RemoteException;
	void opretKøreskole(String adminBrugernavn, String adminKodeord, Køreskole køreskole) 						throws java.rmi.RemoteException;
	
	
	//----------køreskole------------//
	boolean logInd(String brugernavn, String kodeord)										throws java.rmi.RemoteException;
	void opretTilbud(String brugernavn, String kodeord, Tilbud tilbud)						throws java.rmi.RemoteException;
	void aendreTilbud(String brugernavn, String kodeord, int tilbudID, Tilbud tilbud)		throws java.rmi.RemoteException;
	void sletTilbud(String brugernavn, String kodeord, int tilbudID)						throws java.rmi.RemoteException;
	ArrayList<Tilbud> getTilbud(String brugernavn, String kodeord)							throws java.rmi.RemoteException;	
	
	//----------køreskoleelever--------//
	ArrayList<Tilbud> getTilbud(int postnummer)												throws java.rmi.RemoteException;
	ArrayList<Tilbud> getTilbud(int postnummer, int minimumPris, int maximumPris)			throws java.rmi.RemoteException;
	void opretKommentarer(String kommentar, int rating)										throws java.rmi.RemoteException;
	

}
