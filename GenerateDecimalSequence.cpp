#include<bits/stdc++.h>
using namespace std ;

// Generates Decimal sequence of n digits ( Prototype )
void GenerateDecimalSequence(int n , string prefix = "") ;


int main(){
	
	// Test Cases 
	
	for(int i = 1 ; i <= 2 ; i++ )
	{
	    GenerateDecimalSequence(i); 
        cout << endl << endl  ;
	}
	
	return 0 ;
}


void GenerateDecimalSequence(int n , string prefix){
	
	if ( n == 0 )
	   cout << prefix << endl ;
	else {
		
		for ( int i = 0 ; i<10 ; i++) 
			GenerateDecimalSequence(n-1 ,prefix+to_string(i));
	}
}
