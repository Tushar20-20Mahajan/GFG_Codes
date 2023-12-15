//{ Driver Code Starts
//Initial Template for C++

// CPP code to check divisibility of number
#include <bits/stdc++.h>
using namespace std;

// Prorotype of function
void isDivisibleByPrime(int);


// } Driver Code Ends

//User function Template for C++

// Function to check divisibility
// N is the input integer
//#include <iostream>

void isDivisibleByPrime(int n) {
    if (n % 11 == 0) {
        std::cout << "Eleven";
    } else if (n % 3 == 0) {
        std::cout << "Three";
    } else if (n % 2 == 0) {
        std::cout << "Two";
    } else {
        std::cout << "-1";
    }
    cout<<endl;
}



//{ Driver Code Starts.

// Driver Code to test above function
int main() {
    
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        
        isDivisibleByPrime(n);
        
    }
    
	return 0;
}
// } Driver Code Ends