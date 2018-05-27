#include<bits/stdc++.h>
using namespace std ;

// prototypes
void diceSum(int n , int desiredSum); // n : no. of dice rolled
void diceSumHelper(int n , int desiredSum , int sumSoFar , vector<int>& chosen);


int main() {
	
	// test cases
	diceSum(4,9) ;
	cout << endl << endl ;
	
	
	return 0 ;
}

void diceSum(int n , int desiredSum){
	vector<int> chosen ;
	diceSumHelper(n,desiredSum, 0 , chosen);
}

void diceSumHelper(int n , int desiredSum , int sumSoFar , vector<int>& chosen) {
   
   if ( n == 0 )	{
   	    cout << "{ " ;
	    for(int i = 0 ; i < chosen.size() ; i++)
	       cout << chosen[i] << " " ; 
	    cout << "}" << endl ;
   	}
	else {
		
        for(int i=1;i<=6 ;i++) {
        	if(sumSoFar+i+6*(n-1) >= desiredSum && sumSoFar+i+1*(n-1)<=desiredSum)
        	{  chosen.push_back(i);
			   diceSumHelper(n-1,desiredSum,sumSoFar+i,chosen) ;
               chosen.pop_back() ;
			
			}
        } 		
	} 
}
