package ���ģʽʵ��;

public class Secretary {
	private Chauffeur chauffeur = new Chauffeur();
	private Hotel hotel = new Hotel();
	private Restaurant restaurant = new Restaurant();
	private Airport airport = new Airport();
	
	// ���ų���
	public void trip(String to, int days){
		airport.bookTicket("�ൺ", to);
		chauffeur.drive("����");
		hotel.reserve(days);
	}
	
	// ���ŷ���
	public void repast(int num){
		restaurant.reserve(num);
		chauffeur.drive("�Ƶ�");
	}
}
