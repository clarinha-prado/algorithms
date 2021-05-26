package parkingSystem;

public class ParkingSystem {

	private int sm = 0;
	private int md = 0;
	private int bg = 0;

	private int sm_parked = 0;
	private int md_parked = 0;
	private int bg_parked = 0;

	public ParkingSystem(int big, int medium, int small) {
		sm = small;
		md = medium;
		bg = big;
	}

	public boolean addCar(int carType) {
		boolean parked = false;

		switch (carType) {
		case 1:
			if (bg_parked == bg)
				parked = false;
			else {
				bg_parked++;
				parked = true;
			}
			break;
		case 2:
			if (md_parked == md)
				parked = false;
			else {
				md_parked++;
				parked = true;
			}
			break;
		case 3:
			if (sm_parked == sm)
				parked = false;
			else {
				sm_parked++;
				parked = true;
			}
			break;
		default:
			parked = false;
		}
		
		return parked;
	}

	public static void main(String[] args) {

		ParkingSystem obj = new ParkingSystem(1, 1, 0);
		System.out.println(obj.addCar(1));
		System.out.println(obj.addCar(2));
		System.out.println(obj.addCar(3));
		System.out.println(obj.addCar(1));

	}

}
