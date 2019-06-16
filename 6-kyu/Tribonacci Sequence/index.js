function tribonacci(signature,n){
    if(n==0) {
      signature.length=0; 
      return signature
    } 
    else if(n==1){
      signature.length=1;
      return signature
    }
    else {
    for(var i=0;i<=n-4;i++){
    signature[i+3] = signature[i]+signature[i+1]+signature[i+2];
    signature.push();
    }
    return signature;
    }
  }