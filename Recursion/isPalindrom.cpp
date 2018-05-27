#include<bits/stdc++.h>
using namespace std ;


// checks for palindrom string , Returns boolean 
bool isPalindrom(string s) {
	
	if (s.length() < 2 )
	   return true ;
	else {
		
		if (s[0] == s[s.length()-1])
		    return isPalindrom(s.substr(1,s.length()-2)) ;
		else
		    return false ;
	}
}

int main() {
	
	// Test cases 
	
	cout <<"madam  : " <<  isPalindrom("madam") << endl ;
	cout <<"geeksskeeg  : " <<  isPalindrom("geeksskeeg") << endl ;
	cout <<"geek  : " <<  isPalindrom("geek") << endl ;
	cout <<"ss : " <<  isPalindrom("ss") << endl ;
	cout <<"g : " <<  isPalindrom("g") << endl ;
	return 0 ;
}
