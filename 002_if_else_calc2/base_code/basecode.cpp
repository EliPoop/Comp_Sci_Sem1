// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
while(true){
	int x;
int y;
int q = 1;

cout<<"input a number"<<endl;
cin>>x;
cout<<"input another number"<<endl;
cin>>y;

cout<<"type 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division"<<endl;
cin>>q;

if(q==1){
	cout<<x+y<<endl;
}
else if (q==2){
	cout<<x-y<<endl;
}
else if (q==3){
	cout<<x*y<<endl;

}
else if (q==4){
	cout<<x/y<<endl;

}
cout<< "do you want to do another problem? Type 1 for Yes, Type 2 for No"<< endl;
int z;
cin>>z;
if(z==2)
{
	break;
	}
}

}