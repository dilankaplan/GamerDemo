import java.rmi.RemoteException;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicProxy();
		boolean result = false;
		
		try {
			  result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					  Long.parseLong(gamer.getIdentity›d()), 
					  gamer.getName().toUpperCase(), 
					  gamer.getLastname().toUpperCase(),
					  gamer.getBirthYear()
		} catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		
				
		return result;
	}
	

}
