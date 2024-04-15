/* this file is goin going to be a general javascript implementation file that attempts to be a 
reference file for modern javascript and its implementation */

/* Higher Order Functions and Callbacks:
    callback functions must be used as input in another function call AND it is called inside of 
    the other function. While higher-order functions must take a function as an argument AND it must 
    call its input function when it is called; hence, the term callback as one function call leads to another. 
    So basically, higher-order functions have callbacks as inputs and call those callbacks somewhere in their definition.
*/
const array = [1, 2, 3];
function update(cb) { // higher order function: update()
    const output = [];
    for (let i = 0; i < array.length; i++) {
        const updated = cb(array[i]);
        output.push(updated);
    }
    return output;
}
// Callback functions 
function add22(num) {
    return num + 22;
}
function multiplyBy22(num) { 
    return num * 22;
}
function stringify(num) {
    return num.toString();
}
// Call update with each callback function 
update(add22); // returns 
update(multiplyBy22) // returns
update(stringify); // returns 
//------
function forEach(array, callback) {
    // iterate through our array with a for loop
    for (let i = 0; i < array.length; i++){
         // invoke the call back function, passing in the current array element
         callback(array[i]);
    }
}

function map(arr, call) {
    // initialize new array
    const results = [];
    // call foreach with the pass in array and a new function that will need to tke an array element
    forEach(arr, function (element) {
        // invoke the pass in call back funcion with the current array element given to us by foreACJ
        results.push(call(element));
        // ADD THE RETURN VALUE TO OUR array
    });
    // return our array containg the results
    return results;
}

function filter(arr, call) {
    const results = [];
    forEach(arr, (element) => {
        if (call(element)) {
            results.push(element)
        }
    });
    return results;
}

function reduce(arr, cb, initialVal) {
    let accumulator = initialVal;
    for(let i = 0; i < arr.length; i++) {
        // UPdate the accumulator with the result of the callback function
        accumulator = cb(accumulator, arr[i]);
    }
    return accumulator;
}
forEach(['a','b','c'], i => console.log(i));

console.log(filter)

function add20 (num){
    return num + 20
  }
  
  // CREATE YOUR CONSOLE.LOG BELOW 
  console.log(add20);
  