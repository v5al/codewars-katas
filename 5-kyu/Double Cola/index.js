function whoIsNext(names, r) {
    var lengthh = names.length;
    while (r >= lengthh) { 
      r -= lengthh; 
      lengthh *= 2; 
    }
    var ans = Math.ceil(names.length * r / lengthh)-1;
    return names[ans];
  }