package ua.lviv.lgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
	public static void main(String[] args) {

		Map<Integer, List<Integers>> Map1 = new Map<>(11, new ArrayList<Integers>(Arrays.asList(new Integers("2"))));
		
		Map1.addNewEntry(22, new ArrayList<Integers>(Arrays.asList(new Integers("3"))));
		Map1.addNewEntry(33, new ArrayList<Integers>(Arrays.asList(new Integers("4"))));
		Map1.removeEntry(11);
		Map1.removeValue(22);

		
		Map<String, Integer> Map2 = new Map<>("2", 11);
		Map2.addNewEntry("3", 22);
		Map2.addNewEntry("4", 33);
		Map2.removeEntry("2");
		Map2.removeValue("3");
	

	}
	public static class Integers {
		String integer;

		public Integers(String integer) {
			this.integer = integer;
		}

		public String getInteger() {
			return integer;
		}

		public void setInteger(String integer) {
			this.integer = integer;
		}

		@Override
		public String toString() {
			return integer;
		}

	}
}
