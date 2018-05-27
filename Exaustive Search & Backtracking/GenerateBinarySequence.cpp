#include<bits/stdc++.h>
using namespace std ;

//  Generates binary Sequence of n bits ( Prototype )
void GenerateBinarySequence( int n , string prefix = "" ); 

int main(){
	
	// Test Cases 
	
	for(int i = 1 ; i <= 5 ; i++ )
	{
	    GenerateBinarySequence(i); 
        cout << endl << endl  ;
	}
	
	return 0 ;
}


void GenerateBinarySequence( int n , string prefix ) {
	
	if ( n == 0 )
	  cout << prefix << endl ;
	else {
		
		GenerateBinarySequence(n-1 , prefix + "0" );
		GenerateBinarySequence(n-1 , prefix + "1" );
	}
}
