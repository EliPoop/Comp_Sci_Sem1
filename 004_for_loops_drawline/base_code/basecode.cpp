// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	for(int y = 0; y < 9; y++){
		for(int x = 1; x < 5; x++){
		gotoxy(x,y+5);
		cout << "*";
		}
	}
}
