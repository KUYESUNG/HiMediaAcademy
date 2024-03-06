// 01_논리 연산자
// || (OR), &&(AND), !(NOT)의 논리연산자는 피연산자를 논리연산한다.

// 01_short-circuit-evaluation(단축 평가)
// 표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평가 과정을 생략하는 것

// OR, AND 연산자 표현식의 결과는 때로는 불리언 값이 아닐 수도 있다.

// OR의 경우 'apple'이 이미 Truthy 값이여서 true로 평가되고
// 논리 연산의 결과를 결정한 첫 번째 피연산자 apple을 그대로 반환한다.
console.log('apple' || 'banana');
console.log(false || 'banana');
console.log('banana' || false);

// AND의 경우 좌항, 우항 모두 확인해야 하므로
// 논리 연산의 결과를 결정하는 두 번째 피연산자 banana를 그대로 반환한다.
console.log('apple' && 'banana');
console.log(false && 'banana');

// 단축 평가를 사용하면 if문을 대체할 수 있다.
var num = 1;

if(num % 2 == 0)
    console.log('짝수입니다.');
else
    console.log('홀수입니다');

num % 2 == 0 && console.log('짝수입니다.');
num % 2 == 0 || console.log('홀수입니다');

