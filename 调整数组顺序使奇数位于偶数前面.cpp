class Solution {
public:
    void reOrderArray(vector<int> &array) {
        vector<int> temp;
        for(int i = 0; i < array.size(); i++)
            {
            if(array[i] % 2 != 0)
                {
                temp.push_back(array[i]);
            }
        }
        for(int i = 0; i < array.size(); i++)
            {
            if(array[i] % 2 == 0)
                {
                temp.push_back(array[i]);
            }
        }
        array = temp;
    }
};