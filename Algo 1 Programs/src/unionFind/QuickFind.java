package unionFind;

public class QuickFind {
	int[] id;
	QuickFind(int N){
		id = new int[N];
		for(int i=0;i<N;i++) {
			id[i]=i;
		}
	}
	boolean connected(int p,int q) {
		return id[p]==id[q];
	}
	
	void union(int p,int q) {
		int idp = id[p];
		int idq = id[q];
		for(int i=0;i<id.length;i++) {
			if(id[i]==idp) {
				id[i]=idq;
			}
		}
	}
}
