package gume;

/**
 * Klasa koja predstavlja auto gumu.
 * @author Dragutin Todorovic
 * @version 0.1 - Postoje samo atributi, geteri, seteri, toString i equals
 */
public class AutoGuma {
	
	/**
	 * Marka i model gume
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;

	
	/**
	 * Vraca vrednost atributa markaModel
	 * @return markaModel
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za marku i model
	 * 
	 * @throws java.lang.RuntimeException ukoliko je unet parametar markaModel:
	 * <ul>
	 * 		<li>null</li>
	 * 		<li>duzina manja od 3</li> 
	 * </ul>
	 * @param markaModel nova marka i model koji se postavljaju
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	
	/**
	 * Vraca vrednost atributa precnik gume
	 * @return precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost za precnik gume 
	 * @throws java.lang.RuntimeException ukoliko je parametar precnik van opsega 13-22
	 * @param precnik nova vrednost za precnik
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	
	/**
	 * Vraca vrednost atributa sirina gume
	 * @return sirina kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost atributa sirina gume
	 * @throws java.lang.RuntimeException ukoliko je ulazni parametar sirina van opsega od 135-355
	 * @param sirina nova vrednost sirine gume
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visina gume
	 * @return visina
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost atributa visina gume
	 * @throws RuntimeException ukoliko je ulazni parametar visina van opsega 25-95
	 * @param visina nova visina koja se postavlja
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
