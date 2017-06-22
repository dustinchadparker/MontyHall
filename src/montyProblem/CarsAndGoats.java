package montyProblem;

import java.util.ArrayList;
/**
 * CarsAndGoats is a simulation to prove the Monty Hall Problem, and to show other
 * alternatives to the problem, say, if there were even more cars, goats, and/or 
 * doors: The Monty Hall Problem is as follows: 
 * 
 * "Suppose you're on a game show, and you're given the choice of three doors: 
 * Behind one door is a car; behind the others, goats. You pick a door, say No. 1, 
 * and the host, who knows what's behind the doors, opens another door, say No. 3, 
 * which has a goat. He then says to you, 'Do you want to pick door No. 2?' Is it 
 * to your advantage to switch your choice?"
 * 
 * By switching, in this scenario, the contestant has a 66% chance of winning, as 
 * opposed to the widely believed 50%.
 * 
 * This is run numRunCount times and an average is obtained to calculate a more 
 * accurate percentage.
 * 
 * Not error-checking because the user is intelligent enough to not make all doors
 * as goats, for example.
 */
public class CarsAndGoats {

	private int numCars = 1; // total number of cars
	private int numGoats = 2; // total number of goats
	private int numDoors = 3; // total number of doors
	private int goatCount = 0;
	private int carCount = 0;
	private int winCount = 0;
	private int totalCount = 0;
	private int numRunCount = 1000000; // number of times to play game
	private int numRuns = 0;
	private int numHostDoorOpensCount = 1; // number of doors host opens
	private ArrayList<Integer> list = new ArrayList<>(); // instantiates a list
															// of variables

	/**
	 * An empty constructor.
	 */
	public CarsAndGoats() {

		// int RANDOM = (int) (Math.random() * this.numDoors);
		// this.list.add(RANDOM);
	}

	/**
	 * Generates the numDoors doors, numGoats goats, and numCars cars. Then
	 * randomly select one for the user and randomly select a door with a 
	 * goat and remove it. 
	 */
	public void run() {

		while (this.numRunCount > this.numRuns) {

			this.list = new ArrayList<>();

			while (this.list.size() < this.numDoors) {
				this.list.add(0);

			}

			int numDoorsDummy = this.numDoors;

			while (this.numGoats > this.goatCount) {

				int randGoat = (int) (Math.random() * this.numDoors);
				if (this.list.get(randGoat) == 0) {
					this.list.set(randGoat, 7);
					this.goatCount++;
				}
			}

			while (this.numCars > this.carCount) {

				int randCar = (int) (Math.random() * this.numDoors);
				if (this.list.get(randCar) == 0) {
					this.list.set(randCar, 3);
					this.carCount++;
				}
			}

			int initialDoor = (int) (Math.random() * this.numDoors);

			int numOpen = 0;

			while (this.numHostDoorOpensCount > numOpen) {
				int randHostDoor = (int) (Math.random() * numDoorsDummy);
				if (this.list.get(randHostDoor) == 7
						&& (initialDoor != randHostDoor)) {

					if (initialDoor > randHostDoor) {
						initialDoor--;
					}

					this.list.remove(randHostDoor);
					numOpen++;
					numDoorsDummy = numDoorsDummy - 1;

				}
			}

			int switchDoor = (int) (Math.random() * numDoorsDummy);

			while (switchDoor == initialDoor) {
				switchDoor = (int) (Math.random() * numDoorsDummy);
			}
			if (this.list.get(switchDoor) == 3) {
				this.winCount++;
			}

			this.carCount = 0;
			this.goatCount = 0;
			this.numRuns++;
			this.totalCount++;
		}

		System.out.println("Total games played: " + this.totalCount
				+ "\nTotal won: " + this.winCount);

	}
}
