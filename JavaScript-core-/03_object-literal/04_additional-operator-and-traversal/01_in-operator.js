// in 연산자
// 프로퍼티 존재 여부 확인하기
var student = {
    name : '유관순',
    age : 16,
    test : undefined
};

// 존재하지 않는 프로퍼티에 접근하려 해도 에러가 발생하지 않고 undefined를 반환
// 프로퍼티 존재 여부를 쉽게 확인
console.log(student.name === undefined);
console.log(student.height === undefined);
console.log(student.test === undefined);

console.log("name" in student);
console.log("height" in student);
console.log("test" in student);