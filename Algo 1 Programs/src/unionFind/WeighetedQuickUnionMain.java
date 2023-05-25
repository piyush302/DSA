package unionFind;

public class WeighetedQuickUnionMain {

	public static void main(String[] args) {
		WeightedQuickUnion q1 = new WeightedQuickUnion(10);
		q1.union(0, 1);
		q1.union(2, 1);
		q1.union(2, 3);
		q1.union(4, 5);
		q1.union(6, 7);
		q1.union(7, 9);
		q1.union(9, 8);
		
		System.out.println(q1.connected(0, 3));
		System.out.println(q1.connected(1, 2));
		System.out.println(q1.connected(0, 5));
		System.out.println(q1.connected(4, 5));
		System.out.println(q1.connected(6, 8));
		System.out.println(q1.connected(0, 8));

	}

}
