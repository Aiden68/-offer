class Solution {
public:
     int  NumberOf1(int n) {
        int ans = 0;
        if (n < 0){
            n = int(n + pow(2.0, 31));
            ans = 1;
        }
        //cout << n << endl;
        while (n != 0){
            if (n % 2 == 1)
                ans++;
            n /= 2;
        }
        return ans;
     }
};