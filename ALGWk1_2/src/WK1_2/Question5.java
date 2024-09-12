package WK1_2;

public class Question5 extends State {
		Question5() { /* null constructor */ }
		@Override
		
		public void printMe() { 
			System.out.println("Read it."); 
			}
		
		public static void main(String[] args) {
			Region east = new State();
			State md = new Question5();
			Place obj = new Place();
			Place usa = new Region();
		
			md.printMe();
			east.printMe();
			obj.printMe();
			md.printMe();
			usa.printMe();
			md.printMe();
			}
	}
		class State extends Region {
		State() { /* null constructor */ }
		@Override
		public void printMe() { 
			System.out.println("Ship it."); 
			}
		}
		class Region extends Place {
		Region() { /* null constructor */ }
		public void printMe() { 
			System.out.println("Box it."); 
			}
		}
		class Place extends Object {
		Place() { /* null constructor */ }
		public void printMe() { 
			System.out.println("Buy it."); 
			}
		}
