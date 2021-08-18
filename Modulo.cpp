#include<iostream>
using namespace std;

int main(){
    int a=2147483647 , b=2;
    cout<<(a+b)<<endl;
    cout<<(a+b)%5<<endl;//here overflow condiion will occur.

    cout<<((a%5)+(b%5)%5)<<endl; // for avoiding the overflow we will do this approach 

    return 0;
    }
