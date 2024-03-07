// 04_콜백 함수
// 함수의 매개변수를 통해 다른 함수의 내부를 전달되는 함수를 콜백 함수라고 한다.
// 매개변수를 통해 함수의 외부에서 콜백 함수를 전달받은 함수를 고차 함수라고 한다.

function increase(value) {
    return value +1;
}

function decrease(value) {
    return value -1;
}

// 전달 받은 함수에 전달 받은 값을 적용 시켜주는 고차 함수
function apply(func, value) {
    return func(value);
}

// 고차 함수로 콜백 함수를 전달하며 호출
console.log(apply(increase, 5));
console.log(apply(decrease, 5));