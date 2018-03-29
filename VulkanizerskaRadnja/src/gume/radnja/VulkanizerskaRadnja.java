package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;


/**
 * Klasa koja predstavlja vulkanizersku radnju
 * @author Dragutin Todorovic
 * @version 0.1 Sadrzi atribut lista guma, metode dodajGumu i pronadjiGumu
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novu gumu u listu guma
	 * @param a Guma koju treba dodati u listu
	 * @throws java.lang.RuntimeException Ako uneta guma vec postoji u listi
	 * @throws java.lang.NullPointerException Ako je uneta guma null
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi gumu u listi guma ukoliko postoji prema marki i modelu, dimenzije nisu bitne
	 * @param markaModel Naziv marke gume i modela gume
	 * @return novaLista vraca gumu koju pronadje kao listu
	 * @return null ukoliko je uneta vrednost markaModel null
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

	/**
	 * Vraca listu guma
	 * @return gume lista guma
	 */
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}
	
	
}