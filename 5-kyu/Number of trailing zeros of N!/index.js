function zeros (n) {
    if(n==0) return 0;
    else if(n%5==0){
          var res=0;
          while(n%5==0){
          n/=5
          res+=n
        }
        while(n>5){
              n = parseInt(n/5)
              res+=n
          }
        return res+parseInt(n/5)
      }
    else{
          var res=0 
          while(n>5){
              n = parseInt(n/5)
              res+=n
          }
          return res+parseInt(n/5)
      }   
}