#include<bits/stdc++.h>
using namespace std ;

// prototypes ....
void subsetsOfSet(vector<string>& st) ;
void subsetsOfSetHelper(vector<string>& st , vector<string>& chosen);

int main(){
	
    // Test Cases ....	
	vector<string> v = { "BOB" , "JACK" , "SARA" , "KARAN" } ;
	subsetsOfSet(v) ;
	return  0 ;
}


void subsetsOfSet(vector<string>& st){
	
	vector<string> chosen ;
	subsetsOfSetHelper(st,chosen);

}

void subsetsOfSetHelper(vector<string>& st , vector<string>& chosen){
	
	if( st.size() == 0 ){
	 	cout << "{ " ;
	    for(int i = 0 ; i < chosen.size() ; i++)
	       cout << chosen[i] << " " ; 
	    cout << "}" << endl ;
	}
	else {
		
		string element = st[0] ;
		st.erase(st.begin());
		chosen.push_back(element);
		subsetsOfSetHelper(st,chosen); // with chosen element
		chosen.pop_back();
		subsetsOfSetHelper(st,chosen); // without chosen element
		st.insert(st.begin(),element); // un-choose part
	}
}
