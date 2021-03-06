//https://codeforces.com/contest/1020/problem/B
//this is to ez for any logic lol

#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define pb push_back
#define f first
#define s second
#define maxn 1005

int adjList[maxn];
int visited[maxn] = {0};
int n;

void setIO(string name, bool includeout=false) { // name is nonempty for USACO file I/O
    ios_base::sync_with_stdio(0); cin.tie(0); // see Fast Input & Output
    // alternatively, cin.tie(0)->sync_with_stdio(0);
    freopen((name+".in").c_str(), "r", stdin); // see Input & Output
    if (includeout) {
        freopen((name+".out").c_str(), "w", stdout);
    }
}

void dfs(int src) {
    if (visited[src]) {
        cout << src + 1 << " ";
        return;
    }
    visited[src] = true;
    dfs(adjList[src]);
}

int main(){
    setIO("B");
    cin >> n;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        a--;
        adjList[i] = a;
    }
    memset(visited, false, sizeof(visited));
    for (int i = 0; i < n; i++) {
        memset(visited, false, sizeof(visited));
        dfs(i);
    }
    return 0;
}
