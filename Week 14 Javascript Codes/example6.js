const f=(function (){
    const instance=this;
    return {name:"Ahmet",
            getInstance:function(){
                return instance;
            }
    };
})();

const f1=f.getInstance() ;
const f2=f.getInstance();

console.log(f1==f2);    