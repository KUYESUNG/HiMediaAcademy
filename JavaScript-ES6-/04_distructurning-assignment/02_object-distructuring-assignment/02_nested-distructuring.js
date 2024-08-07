// 02_중첩 구조 분해
let product = {

    size : {
        width : 10,
        height : 30
    },

    item : ["doll", "robot"]
};

let {

    size : {
        width, 
        height
    },

    item : [item1, item2],

    producer = "홍길동"
} = product;

console.log(width);
console.log(height);
console.log(item1);
console.log(item2);
console.log(producer);



