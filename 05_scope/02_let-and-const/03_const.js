// 03_const
// const 키워드는 상수(constant)를 선언하기 위해 사용한다.
// let 키워드와 마찬가지로 블록 레벨 스코프를 가진다.

// const 키워드로 선언한 변수는 반드시 선언과 동시에 초기화 해야 한다.
// const x;
const x = 1;
// const 키워드로 선언한 변수는 재할당이 금지된다.
// x = 2;

// 상수 : 재할당이 금지된 변수 
// const 키워드에 의해 재할당이 금지되므로 할당된 값을 변경할 수 있는 방법은 없다.
// 일반적으로 상수의 이름은 대문자로 선언해 상수임을 명확히 나타내며
// 여러 단어로 이루어진 경우 언더스코어(_)로 구분해서 스네이크 케이스로 표현하는 것이 일반적이다.

// 할인율은 변경할 수 없는 상수로서 사용 될 값이다.
const DISCOUNT_RATE = 0.15;
let price = 15000;
let discountPrice = price * (1 - DISCOUNT_RATE);
console.log(discountPrice);

// const 키워드로 선언된 변수에 객체를 할당한 경우 값을 변경할 수 있다.
const student = {
    name : '홍길동',
    age : 20
};

student.name = '유관순'
console.log(student);

// student 객체 자체에 재할당은 불가하다.
student = {};