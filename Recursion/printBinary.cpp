#include<bits/stdc++.h>
using namespace  std ;


// preCondition : n should be a positive integer
void printBinary(int n){
    
	if(n<2){
		cout << n ;
	}
	else {
		printBinary(n/2);
		cout << n%2 ;
	}
}

int main(){
	
	
	// Test Cases 
	
    printBinary(10);
	cout << endl ;	
	printBinary(20);
	cout << endl ;
	printBinary(109);
	cout << endl ;	
	printBinary(203);
	cout << endl ;
		
	return 0 ;
}
