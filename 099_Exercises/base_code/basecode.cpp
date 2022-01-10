// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int temp = 0;
char sym;
cout<<"input a slowflake: ";
cin>>sym;

for(int i = 0 ;i < 20; i++){
	gotoxy(4,i+5);
	cout << sym<< endl;
	sleep(1);
	gotoxy(4,i+5);
	cout<< ' '<< endl;
	
	
	
}

}

