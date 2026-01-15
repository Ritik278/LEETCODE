/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {

    let current = init;
    return{
        increment:function inc(){
        current = current+1;
        return current;
        
    },
    
     reset:function res(){
       current= init;
       return current
    },
     decrement:function dec(){
      current =  current-1;
       return current
    }
    }
    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */