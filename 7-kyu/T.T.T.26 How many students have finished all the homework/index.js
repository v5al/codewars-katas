function howMany(students,finished,unfinish){
    //coding here...
    var finishAll= unfinish + finished[0] + finished[1] - students;
    return finishAll<0 ? -1 : finishAll;
  }