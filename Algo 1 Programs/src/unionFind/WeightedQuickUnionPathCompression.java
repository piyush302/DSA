package unionFind;

public class WeightedQuickUnionPathCompression {
	private int id[];
	private int size[];
	WeightedQuickUnionPathCompression(int N){
		id = new int[N];
		size = new int[N];
		for(int i=0;i<N;i++) {
			id[i]=i;
			size[i]=1;
		}
	}
	
	public int root(int r) {
		while(id[r]!=r) {
			id[r]=id[id[r]];
			r=id[r];
		}
		return r;
	}
	
	public boolean connected(int p,int q) {
		return root(p) == root(q);
	}
	
	public void union(int p,int q) {
		int rootp = root(p);
		int rootq = root(q);
		if(rootp==rootq) return;
		if(size[rootp]<size[rootq]) {
			id[rootp]=rootq;
			size[rootq]+=size[rootp];
		}else {
			id[rootq]=rootp;
			size[rootp]+=size[rootq];
		}
	}
}
