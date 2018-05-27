#include<bits/stdc++.h>
using namespace std ;

// prototypes

void diceRoll1(int n , string chosen = "");  // version 1 
void diceRoll(int n);                       //  version 2 
void diceRollHelper(int n , vector<int>& chosen) ; // Helper Function

int main(){
	
	// Test Cases 
	
	diceRoll(1) ;
	cout << endl << endl ;
	diceRoll1(2) ;
	cout << endl << endl ;
	diceRoll(3) ;
	cout << endl << endl ; 
	
	return 0 ;
}

// Version 1 
void diceRoll1(int n , string chosen )  {
     
    if( n == 0 ) {
	    cout << "{ " ;
	    for(int i = 0 ; i < chosen.length() ; i++)
	       cout << chosen[i] << " " ; 
	    cout << "}" << endl ;
	}
    else {
       	
        for(int i = 1 ; i<=6 ; i++)
           diceRoll1(n-1,chosen + to_string(i)) ;
    	
	} 
}

// Version 2 
void diceRoll(int n){
   vector<int> chosen ;
   diceRollHelper(n,chosen) ;	
}

// Helper function used in diceRoll (version 2)
void diceRollHelper(int n , vector<int>& chosen) {
	
	if( n == 0 ) {
		cout << "{ " ;
		for(int i = 0 ; i<chosen.size() ; i++)
		   cout << chosen[i]  << " " ;
	    cout << "}\n" ;
	    
	} 
	else {
		
		for(int i = 1 ; i<=6 ; i++) {
		    chosen.push_back(i) ;
	        diceRollHelper(n-1,chosen);
			chosen.pop_back();    
		}
	}
}
