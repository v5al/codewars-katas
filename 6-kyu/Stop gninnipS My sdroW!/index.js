function spinWords(str){
    var words = str.split(" ");
    for(var i=0;i<words.length;i++){
      if(words[i].length>4)
      words[i] = words[i].split("").reverse().join("");
    }
    return words.join(" ");
  }