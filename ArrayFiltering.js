//Array Filtering: Write a function filterEvenNumbers(arr) that takes an array of numbers and returns a new array containing only the even numbers.
function filterEvenNumbers(arr){
   return arr.filter(num=>num%2===0);
}
let arr=[1,2,3,4,5,6,7];
console.log("The array is::"+arr);
const EvenNumbers=filterEvenNumbers(arr);
console.log("Even no is::"+EvenNumbers);
