// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here

int y;
int x;

cin >> y;
cin >> x;

cout<< "pick a number from 1 and 4" <<endl;
int g;
cin>>g;

if(g==1)
{
	cout << x*y << endl;
}
else if(g==2)
{
	cout << x-y << endl;

	}
else if (g==3)
{
	cout << x/y << endl;
}	
else if (g==4)
{
cout << x+y << endl;
}





}

