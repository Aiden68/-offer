class Solution {
public:
    void FindNumsAppearOnce(vector<int> data,int* num1,int *num2) {
		int temp = data[0];
        for (int i = 1; i < data.size(); i++)
        {
            temp ^= data[i];
        }
        int pos = 0;
        while ((temp & 1) == 0)
        {
            temp = temp >> 1;
            pos++;
        }
        cout << pos << endl;
        *num1 = *num2 = 0;
        for (int i = 0; i < data.size(); i++)
        {
            if (((data[i] >> pos) & 1) == 0)
            {
                *num1 ^= data[i];
            }
            else
            {
                *num2 ^= data[i];
            }
        }
    }
};