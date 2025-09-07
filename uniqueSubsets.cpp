#include <bits/stdc++.h>
using namespace std;

set<string> uniqueSubsets;

void solve(string ip, string op) {
    if (ip.size() == 0) {
        uniqueSubsets.insert(op); // store unique subset
        return;
    }

    // pick first char
    char ch = ip[0];

    // erase first char from ip
    ip.erase(ip.begin());

    // choice 1 → exclude ch
    solve(ip, op);

    // choice 2 → include ch
    solve(ip, op + ch);
}

int main() {
    string ip = "aab"; // input
    string op = "";

    solve(ip, op);

    cout << "Unique Subsets:\n";
    for (auto subset : uniqueSubsets) {
        cout << "\"" << subset << "\"" << endl;
    }

    return 0;
}
