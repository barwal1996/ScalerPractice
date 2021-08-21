#include<iostream>

using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    
  int n, x, y;
    cin >> n; // take the length of arr
    int a[n+1]; //for space
    for (int i = 1; i <= n; ++i){ //loop will iterate to the length of arr
        cin >> a[i];//take input of elements of arr
    }
    cin >> x >> y;// take the varaible which need to be inserted
    n++;
    for (int i = n; i >= x; --i){
        a[i] = a[i-1]; // check the x value and its location.
    }
    a[x] = y; // insert the value afte xth position
    for (int i = 1; i <= n; ++i){
        cout << a[i] << " ";
    }
}