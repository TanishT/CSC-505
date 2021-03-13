//https://cses.fi/problemset/task/1668
//coloring, store in ans arr what color number

#include <bits/stdc++.h>
 
using namespace std;
 
#define ll long long
#define pb push_back
#define f first
#define s second
#define maxn 100005
 
int n, m;
vector<int> adj[maxn];
int ans[maxn];
vector<int> color(maxn, -1);

void setIO(string name, bool includeout=false) { // name is nonempty for USACO file I/O
    ios_base::sync_with_stdio(0); cin.tie(0); // see Fast Input & Output
    // alternatively, cin.tie(0)->sync_with_stdio(0);
    freopen((name+".in").c_str(), "r", stdin); // see Input & Output
    if (includeout) {
        freopen((name+".out").c_str(), "w", stdout);
    }
}
 
bool isBipartite(int node) {
    queue<int> q;
    q.push(node);
    color[node] = 0;
    //Process current graph component using BFS
    while(!q.empty()) {
        int curr = q.front();
        q.pop();
        for(int ele : adj[curr]) {
            if(color[ele]==color[curr]) 
                //odd-cycle found
                return false;
            if(color[ele]==-1) {
                //unvisited node
                color[ele] = 1-color[curr];
                q.push(ele);
                ans[ele] = color[ele];            
                //cout << ele << " " << ans[ele] << endl;
            }
        }
    }
    return true;
}
 
int main() {
	setIO("teams");
	cin >> n >> m;
	for (int i = 0; i < m; i++) {
		int a, b;
		cin >> a >> b;
		a--; b--;
		adj[a].pb(b);
		adj[b].pb(a);
	}

	bool bipartite = true;
		for(int i=0; i < n; ++i) {
		if(color[i]==-1) {
			if(!isBipartite(i)) {
				bipartite = false;
				break;
			}
		}
	}

	if (!bipartite) {
		cout << "IMPOSSIBLE" << endl;
	} else {
		for (int i = 0; i < n; i++) {
			cout << ans[i]+1 << " ";
		}
		cout << endl;
	}
	return 0; 
}
