#include<bits/stdc++.h>
using namespace std ;

bool nQueenProblemSolver(int n , int row , int board[][100]);
bool isSafe(int board[][100] , int row , int col , int n);

int main() {
	
	int n , a[100][100] = {0} ;
	cin >> n ;
	
	bool result = nQueenProblemSolver(n,0,a); // only printing one solution 
	
	if (!result)
	   cout << "NO Solution Exists for the given Dimensions !!!!!\n" ; 
	
	return 0;
}

bool  nQueenProblemSolver(int n , int row , int board[][100] ){
	
	if (row == n) {
		
		// only printing one of the solutions
		
		for(int i = 0 ; i<n;i++) {
		    for(int j = 0 ; j<n;j++) {
		        if(board[i][j] == 0 )
		            cout << "- " ;
		        else
			        cout << "Q " ;   
		    }
		    cout << endl ;
	    }
	    cout << endl << endl ;
	    
		return true ;
	}
	else {
		
	     for(int j = 0 ; j<n ; j++) {
	     	if (isSafe(board,row,j,n)) {
	     	    board[row][j] = 1 ;
	     	    bool result = nQueenProblemSolver(n,row+1,board);
		        if (result)
		            return true ;
		        // nQueenProblemSolver(n,row+1,board);
		        board[row][j] = 0 ;  
			}
		 }
	}
	
	return false ;
}

bool isSafe(int board[][100] , int row , int col , int n){
     
	for ( int c = 0 ; c < n ; c++)
	    if (board[row][c])
		    return false ;
				
 	for (int r = 0 ; r < n ; r++)
	    if (board[r][col])
		    return false ;
	
	int i = row , j = col ;          
	while(i-1 >= 0 && j-1>=0)
	    i-- , j-- ;
    for (; i<n && j<n ; i++,j++)
	    if(board[i][j])
		    return false ; 
		  
	i = row , j = col ;
	while(i-1 >=0 && j+1 < n)
	    i-- , j++ ;
	for (; i<n && j>=0 ; i++,j--)
	    if(board[i][j])
		    return false ;
		  
    return true ;		  
}
