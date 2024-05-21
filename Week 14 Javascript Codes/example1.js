function f(){
    this.firstName="Ahmet";
}
const fIns=new f();
f.prototype.lastName="Ak";
console.log(fIns.firstName);
console.log(fIns.lastName);

f.prototype.getName=function(){
    return this.firstName+" "+this.lastName;
};

console.log(fIns.getName());

const fIns1=Object.create(fIns);
console.log(fIns1.firstName);