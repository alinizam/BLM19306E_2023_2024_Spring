var data = [];
 
for (let k = 0; k < 3; k++) {
  data[k] = function () {
      console.log(k);
    }
  ; // pass "k" value
}

data[0]();
data[1]();
data[2]();