#include<bits/stdc++.h>
using namespace std ;


// prototype
void stringPermutations(string s , string chosen = "" ) ;

int main(){
	
   // Test Case ....	
	stringPermutations("NICE");
	
	
	return 0 ;
}

void stringPermutations(string s , string chosen)  { 
	
	if(s.length() == 0 )
	  cout << chosen << endl ; 
	else {
		
	   for(int i = 0 ; i< s.length() ; i++){
	   		char ch =  s[i] ;
		    chosen += ch ;
		    s.erase(i,1) ;
		    stringPermutations(s ,chosen) ;
		    s.insert(i,1,ch) ;
		    chosen.erase(chosen.length()-1,1);
	   	}
	}
}
