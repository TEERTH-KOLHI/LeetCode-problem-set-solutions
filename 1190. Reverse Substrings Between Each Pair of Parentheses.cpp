class Solution {
public:
    string reverseParentheses(string s) {
        int n = s.length();
        stack<char>stk;
        for(int i = 0; i < n; i++){
            if(s[i] == ')'){
                string curr = "";
                while(stk.top() != '('){
                    curr += stk.top();
                    stk.pop();
                }
                stk.pop();
                for(auto &it:curr){
                    stk.push(it);
                }
            }else{
                stk.push(s[i]);
            }
        }
        string curr = "";
        while(!stk.empty()){
            curr += stk.top();
            stk.pop();
        }
        reverse(curr.begin(), curr.end());
        return curr;
    }
};
