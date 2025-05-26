//Object Manipulation: Write a function cloneObject(obj) that creates a deep copy of an object. Ensure that nested objects are also copied.
function cloneObject(obj)
{
    return JSON.parse(JSON.stringify(obj));//string convert to object...
}
const originial={a:1,b:{c:2}};
const cloned=cloneObject(originial);
console.log(cloned);