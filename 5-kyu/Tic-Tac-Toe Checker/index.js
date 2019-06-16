function isSolved(board) {
    var zeroZero = board[0][0];
    var zeroOne = board[0][1];
    var zeroTwo = board[0][2];
    var oneZero = board[1][0];
    var oneOne = board[1][1];
    var oneTwo = board[1][2];
    var twoZero = board[2][0];
    var twoOne = board[2][1];
    var twoTwo = board[2][2];
    var x=0,o=0,e=0;
    for(var i=0;i<board.length;i++){
      for(var j=0;j<board.length;j++){
        if(board[i][j]=='1') x++;
        else if(board[i][j]=='2') o++;
        else if(board[i][j]=='0') e++;
      }
    }
    if(zeroZero == zeroOne && zeroZero == zeroTwo && zeroZero!=0) return zeroZero;
    else if(zeroZero == oneZero && zeroZero == twoZero && zeroZero!=0) return zeroZero;
    else if(zeroZero == oneOne && zeroZero == twoTwo && zeroZero!=0) return zeroZero;
    else if(oneZero == oneOne && oneZero == oneTwo && oneZero!=0) return oneZero;
    else if(twoZero == twoOne && twoZero == twoTwo && twoZero!=0) return twoZero;
    else if(twoZero == oneOne && twoZero == zeroTwo && twoZero!=0) return twoZero;
    else if(e>x && e>o) return -1;
    else if(x>o || x<o) return 0;
    else return -1;
}