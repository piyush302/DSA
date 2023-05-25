package unionFind;

public class QuickUnion {
	private int id[];

	QuickUnion(int N){
		id= new int[N];
		for(int i=0;i<N;i++) {
			id[i]=i;
		}
	}
	
	public int root(int r) {
		while(r!=id[r]) {
			r=id[r];
		}
		return r;
	}
	
	public boolean connected(int p,int q) {
		return root(p)==root(q);
	}
	
	public void union(int p,int q) {
		int rootp = root(p);
		int rootq = root(q);
		id[rootp] = rootq;
		
	}
}
