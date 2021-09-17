int littlePonneyAndPalindrome(string A){
    int hashMap[26]={0};
   for(char a:A)
       hashMap[a-'a']++;
   int countOdd=0;
   
   for(int a : hashMap){
       if(a%2)
           countOdd++;
   }
   if(countOdd<=1){
       return 1;
   }
   return 0;
   }

int Solution::solve(string A) {
  return littlePonneyAndPalindrome(A);
}
