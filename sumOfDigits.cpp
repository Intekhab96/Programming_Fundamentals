#include<bits/stdc++.h>
using namespace std ;


// PreCondition : n should be an integer 
long int sumOfDigits(long int n ){
	
	if (n < 0 )
	   sumOfDigits(abs(n)) ;
	else if ( n < 10 )
	    return n ;
	else 
	 return n%10 + sumOfDigits(n/10) ;
}

int main() {
	
	// Test Cases 
	
	cout << " 12      : " << sumOfDigits(12) << endl ;
	cout << " 1242434 : " << sumOfDigits(1242434) << endl ;
	cout << " 2       : " << sumOfDigits(2) << endl ;
	cout << " -434     : " << sumOfDigits(-434) << endl ;
	
	return 0 ;
}
