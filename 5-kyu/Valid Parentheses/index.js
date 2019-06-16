function validParentheses(parens){
    var p =parens.split("");
     if (p[0] == ')') return false;
     else if(p[p.length-1] == '(') return false;
   var openn=0,closee=0,errorss;
   if(  parens.length<=100){
   for(var i=0;i<p.length;i++){
     if(p[i]=='(') openn++;
     else if(p[i]==')') closee++;
   }
   if(openn===closee) return true;
   else return false;
   }
 }