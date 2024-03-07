// 03_중첩 함수
// 함수 내부에 정의 된 함수를 중첩 함수 또는 내부 함수라고 한다.
// 중첩 함수를 포함하는 함수는 외부 함수라고 한다.

function outer() {

    var outerval = '외부 함수';

    function inner() {
        
        var innerVal = '내부 함수';
        console.log(innerVal, outerval);    // 외부 함수의 변수를 참조할 수 있다.
    }

    inner();
}

outer();

// inner(); // 에러남