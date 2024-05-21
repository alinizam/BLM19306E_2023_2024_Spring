const firstName="Ahmet";
function f(){
    return this.firstName;
}
const ins=new f();

console.log(f.prototype==ins.__proto__);



