// If our functions can hold on to live data/state between executions then this would let 
// one's function definitions have an associated cache/persistent memory or a permenant 
// store of data. 

function createFunction() {
    let count = 0;
    function multiplyBy2 (num) {
        count++;
        console.log(count)
        return num*2;
    }
    return multiplyBy2;
}

const secondLabel = createFunction; // this points to ~[f]->createFunction

const generatedFunc = createFunction(); // ~[f]->multipyBy2 is stored here in generatedFunc

const result = generatedFunc(3); // 6
const result2 = generatedFunc(4) // 
console.log(result);
console.log(result2);

// Calling a function in the same scope as it was defined can be odd. 
// There is a way to run a function outside where it was defined with out an error - we return the inner function 
// and assign it to a new variable. 

function outer () {
    let counter = 0; 
    function incrementCounter() {
        counter ++;
        console.log(counter);
    }
    return incrementCounter;
}

const counterClosure = outer(); // counterClosure = incrementCounter
counterClosure();
counterClosure();
counterClosure();
const myNewFunction = outer() // myNewFunction = incrementCounter
myNewFunction();
myNewFunction();
myNewFunction();


// once accepts a callback function and returns a function '
function once(cb) {
    // create variable hasBeenCalled: boolean
    // create variables cachedResult

    let hasBeenCalled = false; // indicates whether cb has been invoked
    let cachedResult; // stores result of cb invocation

    // create a function, oncifiedCb
    function oncifiedCb(...args) {
        // if oncifiedCB has not been called:
        if (!hasBeenCalled) { // if cb hasn't been called
            // 1. invoke cb with args and store results in cachedResult
            cachedResult = cb(...args); // call cb and store result
            // 2. set hasBeenCalled to true
            hasBeenCalled = true; // set hasBeenCalled to true
       
        } // return cachedResult
        return cachedResult;
    }
    return oncifiedCb
}

function after(numOfCalls, callback) {

}

const called = function(string) { return ('hello ' + string);}