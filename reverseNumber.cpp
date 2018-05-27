#include<bits/stdc++.h>
using namespace std ;

void reverseNumber(long int n ) {
	 
	 if ( n > 0 ){
	 	cout << n%10 ;
	 	reverseNumber(n/10) ;
	}
}

int main() {
	
	long int t  ;
	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL) ;
	
	// Test Cases ....
	reverseNumber(5754863) ;
	cout << endl ;
	reverseNumber(486300) ;
	cout << endl ;
	
	return 0 ;
}


