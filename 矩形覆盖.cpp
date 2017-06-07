class Solution {
public:
    int rectCover(int number) {
		if(number <= 2)
            {
            return number;
        }
        int t1 = 1, t2 = 2;
        for(int i = 3; i <= number; i++)
            {
            t2 = t1 + t2;
            t1 = t2 - t1;
        }
        return t2;
    }
};