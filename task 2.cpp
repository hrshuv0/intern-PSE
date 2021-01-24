#include <bits/stdc++.h>

using namespace std;

int efficientJanitor(vector<float> weights);

int main()
{
    //freopen("in.txt", "r", stdin);

    int n, c;
    float x;
    vector<float> weights;

    cin >> n;

    for(int i = 0; i < n; i++)
    {
        cin >> x;
        weights.push_back(x);
    }

    sort(weights.begin(), weights.end());

    c = efficientJanitor(weights);

    cout << c << endl;
}

int efficientJanitor(vector<float> weights)
{
    int l = 0, r = weights.size()-1 , c = 0;

    while(l < r+1)
    {
        if(l == r)
        {
            c++;
            break;
        }
        else if(weights[l]+weights[r] <= 3)
        {
            c++;
            l++;
            r--;
        }
        else{
            c++;
            r--;
        }
    }
    return c;
}
