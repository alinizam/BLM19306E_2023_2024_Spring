function add(a,b){
    return a+b;
}
function extract(a,b){
    return a-b;
}
function square(a){
    return a*a;
}
function calculator(){

}
calculator.prototype.a;
calculator.prototype.b;
calculator.prototype.calculate=function(algorithm){
    return algorithm(this.a,this.b);
};

(function run(){
    const cal=new calculator();
    cal.a=5;
    cal.b=10;
    console.log(cal.calculate(add));
    console.log(cal.calculate(extract));
    console.log(cal.calculate(square));
    console.log(cal.calculate((x)=>(x*x)));
    console.log(cal.calculate((x)=>{return x*x}));
})();
