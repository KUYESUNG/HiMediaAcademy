// 02_let
// var 키워드의 단점을 보완하기 위해서 ES6에서는 새로운 변수 선언 키워드인 let, const를 도입했다.

// 1. 변수 중복 선언 금지
let msg = '안녕하세요';
//let이나 const 키워드로 선언된 변수는 같은 스코프 내에서 중복 선언을 허용하지 않는다.
// let msg = '안녕히가세요';

// 2. 블록 레벨 스코프
// let 키워드로 선언한 변수는 모든 코드 블록(함수, if, for, while, try-catch)을 지역 스코프로 인정한다.
let i = 0;
for(let i = 0; i < 10; i++) {
    console.log(`지역 변수 i : ${i}`);
}
console.log(`전역 변수 i : ${i}`);

// 3. 변수 호이스팅
// let 키워드로 선언한 변수는 변수 호이스팅이 발생하지 않는 것처럼 동작한다.
console.log(x);
let x = 10;