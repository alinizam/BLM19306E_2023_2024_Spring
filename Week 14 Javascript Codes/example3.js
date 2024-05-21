function emp(){
    this.firstName="Ahmet";
}
emp.prototype.lastName="Ak";

const e1=new emp();
e1.salary=15000;
emp.prototype.lastName="Ak";
e1.lastName="Ak oğlu";

console.log(e1);
console.log(e1.lastName);
console.log(e1.__proto__.lastName);

console.log(emp);


