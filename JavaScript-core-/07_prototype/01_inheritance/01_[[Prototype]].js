// 프로토타입 특징
const user = {
    id : 'user',
    login : function() {
        console.log(`${this.id}님 로그인 되었습니다.`);
    }
};

const student = {
    __proto__ : user
};

// 프로토타입은 프로퍼티를 읽을 때만 사용하여 프로퍼티를 추가, 수정, 삭제하는 연산은 객체에 직접 한다.
student.id = 'user01';

student.login();

// for in 반복문은 상속 프로퍼티도 순회 대상에 포함시킨다.
for(let prop in student) {
    console.log(prop);

    // key에 대응하는 프로퍼티가 상속 프로퍼티가 아니고 obj에 직접 구현되어있는 프로퍼티일 때만 true를 반환
    let isOwn = student.hasOwnProperty(prop);

    if(isOwn) {
        console.log(`객체 프로퍼티 ${prop}`);
    } else {
        console.log(`상속 프로퍼티 ${prop}`);
    }
}